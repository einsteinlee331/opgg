<template>
<div>
  <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">OP.GG</a>
    </div>
    <ul class="nav navbar-nav">
      <li><router-link to="/">Home</router-link></li>
      <li><router-link to="/shopping">SHOP</router-link></li>
      <li><router-link to="/test">TEST</router-link></li>
      <li><router-link to="/Loginpage">Login_test</router-link></li>
      <li><router-link to="/MyPage">MyPage</router-link></li>
    </ul>
  </div>
</nav>
</div>
</template>

<script>
// var testNav = document.getElementsByTagName('li')
// testNav.addEventListner('click', function(){
//   testNav.removeEventListener()
//   this.style.backgroundColor="black"
// })

export default {
data : { mouseDown : false},
name: 'Nav'
,

methods:{

  
}
}


</script>

<style scoped>
.container-fluid{
  background-color:rgb(32, 54, 102); padding:0; margin:0;box-shadow: 0;height:50px; }
.navbar-header{margin:0;padding:0}  
.navbar{border:none}
.navbar-default{
  margin:0;
}

</style>