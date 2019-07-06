package com.project.web.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Customer
 */
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@Table(name="customers")
public class Customer implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="customer_id") private String customerId;
    @Column(name="pass_word") private String passWord;
    @Column(name="password_confirm") private String passwordConfirm;
    @Column(name="customer_name") private String customerName;
    @Column(name="dateof_birth") private String dateofBirth;
    @Column(name="email_address") private String emailAddress;
    @Column(name="phone_numers") private String phoneNumers;


    @Override 
    public String toString(){
        return "Customer:[customerId:"+customerId+", pass_word:"+passWord+", passwordConfirm:"+passwordConfirm+", customerNAme:"+customerName+",dateofBirth:"+dateofBirth+", emailAddress:"+emailAddress+", phoneNumbers:"+ phoneNumers + " ]";
    }

    @Builder
    public Customer(String customerId,String customerName, 
    String passWord, String PasswordConfirm, 
    String dateofBirth, String emailAddress, 
    String phoneNumers){
        this.customerId = customerId;

        this.passWord = passWord;
        this.passwordConfirm = PasswordConfirm;
        
        this.customerName = customerName;
        this.dateofBirth = dateofBirth;
        this.emailAddress = emailAddress;
        this.phoneNumers = phoneNumers;
        
    }
}