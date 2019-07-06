<template>

<div id="loginwrapper">
<Nav></Nav>
<div id="inner_wrapper">
<span id="title">Log-in</span>
<br>
<br>
<div id="box">
    <div class="box2 sm_bx1">
        <input v-model="customerId" placeholder="아이디" class="box2 sm_bx1" type="text" autofocus>
    </div>
    <div class="box2 sm_bx2">
        <input v-model="passWord" placeholder="비밀번호" class="box2 sm_bx1" type="password" autofocus>
    </div>
</div>
<br>
<button id="cancel" @click="cancel">취소</button>
<button id="submit" @click="login">확인</button><br>
<span class="spanbtn"><a href="">아이디 | 암호 찾기</a></span><br>
<span class="spanbtn" @click="routing1"><a href="">회원가입</a></span>
</div>

<Footer></Footer>
</div>

</template>

<script>

import Home from '@/components/Home.vue'
import Nav from '@/components/common/Nav.vue'
import axios from 'axios'
import Footer from '@/components/common/Footer.vue'
import Router from 'vue-router'
import { store } from "../../store";

Vue.use(Router)

export default {
  name: 'Home',
  components : {Nav, Footer},
  data(){
      return{
            context: 'http://localhost:9000/customers',
            customerId: '',
            passWord: '',
            customerName: '',
            passwordConfirm: '',
            dateofBirth: '',
            emailAddress: '',
            phoneNumers: ''
      };
  },
  methods : {
      routing1(){
          this.$router.push('/enrollment');
      },
      cancel(){
          this.$router.push('/');
      },
      login(){
          let data = {
              customerId : this.customerId,
              passWord : this.passWord
          }
          let headers = {
                 "Content-Type": "application/json",
                  Authorization: "JWT fefege.."    
          }
          axios.post(`${this.context}/loginpage`,JSON.stringify(data),{headers: headers})
               .then(res=>{
                   store.state.customerId = res.data.customerId;
                   alert(`반갑습니다 ${store.state.customerId}님`)
                   this.$router.push('/myPage');

               }).catch(e=>{
                   alert('Error')
               })
               
            }

    }   

  }


</script>
<style scoped>
#inner_wrapper{width: 1000px; margin: 0 auto;text-align: center; height: 500px; padding-top:50px;}
#title{font-size:36px;font-family: 'Barriecito';}
#box{width: 400px;height:200px;background:rgba(158, 158, 240, 0.671); margin: 0 auto;padding-top:35px; }
.box2{width: 300px; height:50px; background: white; margin: 0 auto; }
.sm_bx2{margin-top:30px;}
.spanbtn{font-size:11px;}

</style>
