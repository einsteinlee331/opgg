<template>
  <div class="wrapper">
    <div class="hello">
    <Nav></Nav>
    <div id="title"><img src="../assets/log.png" alt=""></div>
   <MenuBar></MenuBar>
  <main>
  <MainBoard></MainBoard>
  </main>
  <Footer></Footer>
  </div>
   </div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import Shopping from '@/components/list/Shopping.vue'
import ShoppingPage from '@/components/common/ShoppingPage.vue'
import Footer from '@/components/common/Footer.vue'
import MenuBar from '@/components/list/MenuBar.vue'
import MainBoard from '@/components/list/MainBoard.vue'
import Enrollment from '@/components/list/Enrollment.vue'
import Test from '@/components/list/Test.vue'
import Loginpage from '@/components/list/Loginpage.vue'

export default {
  name: 'home',
  components:{
    Nav,Shopping,ShoppingPage, Footer, MenuBar,MainBoard,Enrollment, Test, Loginpage
  },
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.wrapper{ width: 100%}
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;

  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

#title img{display:block;width:450px;}
#title{width: 450px; margin: 30px auto}
main{height: 500px}
</style>