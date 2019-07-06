<template>
  <div id="container">
    <div id="bg1-wt"></div>
    <Nav></Nav>

    <div id="wrapper">
      <h1>OP.GG</h1>

      <form method="POST">
        <label for="user_id">아이디</label>
        <input v-model="customerId" type="text" name="customerId" placeholder="ID" />
        <br />
        <label for="password">비밀번호</label>
        <input v-model="passWord" type="password" name="password" placeholder="PASSWORD" />
        <br />
        <label for="psConfirm">비밀번호 확인</label>
        <input
          v-model="passwordConfirm"
          type="password"
          name="PasswordConfirm"
          placeholder="CONFIRMATION"
        />
        <br />
        <label for="user_name">이름</label>
        <input v-model="customerName" type="text" name="customerName" placeholder="NAME" />
        <br />
        <label for="b_date">생년월일</label>
        <input v-model="dateofBirth" type="text" placeholder="DATE OF BIRTH" />
        <br />
        <label for="email">이메일</label>
        <input v-model="emailAddress" type="text" name="emailAddress" placeholder="Email address" />
        <br />
        <label for="phone_numb">휴대전화('-'없이 번호만 입력해주세요)</label>
        <input v-model="phoneNumers" type="text" placeholder="Phone Number" />
        <br />
        <br />

        <button>
          <router-link to="/">취소하기</router-link>
        </button>
        <button type="submit" @click="save">가입하기</button>
      </form>
    </div>
    <Footer></Footer>
  </div>
</template>
<script>
import Home from "@/components/Home.vue";
import axios from "axios";
import Element from "element-ui";
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
import Router from "vue-router";

export default {
  name: "Home",
  components: { Nav, Footer },
  data() {
    return {
      context: "http://localhost:9000/customers",
      customerId: "",
      passWord: "",
      passwordConfirm: "",
      customerName: "",
      dateofBirth: "",
      emailAddress: "",
      phoneNumers: ""
    };
  },
  methods: {
    save() {
      alert("customerId");
      let data = {
        customerId: this.customerId,
        passWord: this.passWord,
        passwordConfirm: this.passwordConfirm,
        customerName: this.customerName,
        dateofBirth: this.dateofBirth,
        emailAddress: this.emailAddress,
        phoneNumers: this.phoneNumers
      };

      let headers = {
        "Content-Type": "application/json",
        Authorization: "JWT fefege.."
      };
      axios
        .post(`${this.context}`, JSON.stringify(data), { headers: headers })
        .then(res => {
          alert(`회원가입성공!`);
        })
        .catch(e => {});
      this.$router.push("/loginpage");
    }
  }
};
</script>
<style scoped>
#wrapper {
  width: 800px;
  height: 480px;
  margin: 0 auto;
  padding-top: 3%;
}
</style>
