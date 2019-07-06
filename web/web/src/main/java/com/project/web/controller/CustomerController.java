package com.project.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


import com.project.web.common.lambda.ISupplier;
import com.project.web.domain.CustomerDTO;
import com.project.web.entities.Customer;
import com.project.web.repositories.CustomerRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * CustomerController
 */


@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired CustomerDTO Customer;
    @Autowired CustomerRepository repo;
    @Autowired ModelMapper modelMapper;

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @PostMapping("")
    public HashMap<String,String> save(@RequestBody CustomerDTO dto){
        System.out.println("회원가입"+dto.toString());
        HashMap<String,String> map = new HashMap<>();

        Customer entity = new Customer();
        entity.setCustomerId(dto.getCustomerId());
        System.out.println("비번 : "+dto.getPassWord());
        entity.setPassWord(dto.getPassWord());
        System.out.println("비번 : "+dto.getPasswordConfirm());
        entity.setPasswordConfirm(dto.getPasswordConfirm());
        entity.setCustomerName(dto.getCustomerName());
        entity.setDateofBirth(dto.getDateofBirth());
        entity.setEmailAddress(dto.getEmailAddress());
        entity.setPhoneNumers(dto.getPhoneNumers());

        System.out.println("엔터티로 바뀐 정보:"+entity.toString());
        repo.save(entity);
        map.put("result", "게시글등록 성공"); 
        return map;
    }
    @DeleteMapping("/leave_account/{customerId}")
    public void leave_account(@PathVariable String customerId){
        Long id = repo.findByCustomerId(customerId).getId();
        repo.deleteById(id);
    }
    // @GetMapping("/{id}")
    // public CustomerDTO findById(@PathVariable String id){
    //     System.out.println("findById: 들어온 아이디" +id);
    //     Customer entity.findById(Long.parseLong(id)).orElseThrow(EntityNotFoundException::new);

    @PostMapping("/loginpage")
    public CustomerDTO login(@RequestBody CustomerDTO dto) throws IllegalArgumentException{
        System.out.println("로그인 진입");
        System.out.println("ID :"+dto.getCustomerId());
        System.out.println("PW :"+dto.getPassWord());
        ISupplier fx =(()->{
            return repo.findByCustomerIdAndPassWord(dto.getCustomerId(),
            dto.getPassWord());
        });     
        return modelMapper().map(fx.get(),CustomerDTO.class);
    }

    @GetMapping("/loginpage/{customerId}")
    public CustomerDTO wiringData(@PathVariable String customerId){
        System.out.println("마이페이지:"+customerId);
        CustomerDTO b = modelMapper.map(repo.findByCustomerId(customerId), CustomerDTO.class);
        return b;
    }

    //마이페이지 수정
    @PutMapping("/{customerId}")
    public HashMap<String, String> update(@PathVariable String customerId, @RequestBody CustomerDTO customer){

        HashMap<String, String> map = new HashMap<>();
        Long id = repo.findByCustomerId(customerId).getId();
        Customer entity = repo.findById(id).get();
        entity.setCustomerId(customer.getCustomerId());
        entity.setPassWord(customer.getPassWord());
        entity.setPasswordConfirm(customer.getPasswordConfirm());
        entity.setCustomerName(customer.getCustomerName());
        entity.setEmailAddress(customer.getEmailAddress());
        entity.setPhoneNumers(customer.getPhoneNumers());
        entity.setDateofBirth(customer.getDateofBirth());
        repo.save(entity);
        map.put("result","success");

       return map; 
    }

    // @GetMapping("/MyPage")
    // public Iterable<CustomerDTO> getlistmapping(){
    //     //Iterable 뜻 you can step thru the object as a collection ex.array
    //     //. Since List preserves the insertion order, it allows positional access and insertion of elements. 
    //     //List Interface is implemented by ArrayList, LinkedList, Vector and Stack classes.
    //     //db가 entity , vue 가 dto
    //     Iterable<Customer> entities = repo.findAll();
    //     List<CustomerDTO> list = new ArrayList<>();
    //     for(Customer T: entities){
    //         CustomerDTO Tuff = modelMapper.map(T, CustomerDTO.class);
    //         list.add(Tuff);
    //     }
    //     //It's a for-each loop over the Collection "props".
    //     //It iterates over all entries of the collection.
    //     return list;
    // }


        // @GetMapping("/{id}")
    // public CustomerDTO findById(@PathVariable String id){
    //     System.out.println("findById: 들어온 아이디" +id);
    //     Customer entity.findById(Long.parseLong(id)).orElseThrow(EntityNotFoundException::new);

    //     CustomerDTO c = modelMapper.map(entity, CustomerDTO.class);
    //     System.out.println("조회결과:" + c.toString());
    //     return c;
    // }

}