<template>
<div id="wrapper4">
<Nav></Nav>

<div id="inputBox">
<br>
<h2 class="text-center">고객정보</h2>
<label for="">아이디 : </label>
<label> {{customerId}}</label> <br>
<label for="">이름 :</label>
<label> {{customerName}} </label><br>
<label for="">생년월일 :</label>
<label> {{dateofBirth}} </label><br>
<label for="">이메일 :</label>
<label> {{emailAddress}} </label><br>
<label for="">휴대전화 :</label>
<label> {{phoneNumers}} </label><br>
<textarea placeholder="고객의견을 적어주세요" id="form18" class="md-textarea form-control" rows="3"></textarea>
<br>
<a @click="page_routing" class="btn btn-primary" role="button" href="">수정</a>
<a class="btn btn-primary" role="button" href="">취소</a>
<a @click="leave_account" class="btn btn-primary" role="button" href="">탈퇴</a>
</div>



</div>
</template>

<script>
import Nav from '@/components/common/Nav'
import Loginpage from '@/components/list/Loginpage'
import {store} from '../../store'
import axios from 'axios'

export default {
  components : {Nav, Loginpage},
  data(){
      return{
            context: 'http://localhost:9000/customers',
            customerId: store.state.customerId,
            customerName: '',
            passwordConfirm: '',
            dateofBirth: '',
            emailAddress: '',
            phoneNumers: ''
      }
    
  } ,
  //create: hook method중에 하나임 - 페이지 loading 중에 바로 가져옴
      // alert('마이페이지 들어옴');
    // 데이터를 갖고 와야함. dto를 들고와서 각각 값을 박으면 됨.
    // this.offerName = res.data.offerName
       created(){
          axios.get(`${this.context}/loginpage/${this.customerId}`)
               .then(res=>{
                alert(`${this.customerId}`)
                this.customerId = res.data.customerId
                this.passWord = res.data.passWord
                this.passwordConfirm = res.data.passwordConfirm
                this.customerName = res.data.customerName
                this.dateofBirth = res.data.dateofBirth
                this.emailAddress = res.data.emailAddress
                this.phoneNumers = res.data.phoneNumers
                })
               .catch(e =>{
               })
      },
  methods : {
      leave_account(){
        axios
        .delete(`${this.context}/leave_account/${this.customerId}`)
        .then(res=>{
          alert("탈퇴완료!")
           
        })
        .catch(e=>{
          alert("error")
          }
        )
        this.$router.push("/")
      }
  },
      page_routing(){
        this.$router.push("/MyPageEdit")
      }
}

</script>







<style scoped>
#inputBox{
    width: 250px; margin: 0 auto;
}
input[type=text] {
  border: none;
  float: right;
  border-bottom: 1px solid rgba(66, 64, 64, 0.603);
  
}



  body {
    position: relative;
  }
  .affix {
    top: 20px;
    z-index: 9999 !important;
  }
  div.col-sm-9 div {
    height: 250px;
    font-size: 28px;
  }
  #section1 {color: #fff; background-color: #1E88E5;}
  #section2 {color: #fff; background-color: #673ab7;}
  #section3 {color: #fff; background-color: #ff9800;}
  #section41 {color: #fff; background-color: #00bcd4;}
  #section42 {color: #fff; background-color: #009688;}
  
  @media screen and (max-width: 810px) {
    #section1, #section2, #section3, #section41, #section42  {
      margin-left: 150px;
    }
  }
</style>
