<template>
  <div class="Shopping">
  <Nav></Nav>
  <Carousel></Carousel>

  <main>
  <span id="title">
  <h2><img src="../../assets/log.png"></h2>
  </span>
  <ShoppingPage></ShoppingPage>

  </main>
  <Footer></Footer>
  </div>
  
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Carousel from '@/components/common/Carousel.vue'
import ShoppingPage from '@/components/common/ShoppingPage.vue'
import Footer from '@/components/common/Footer.vue'

export default {
  name: 'Home',
  components : {Nav, Carousel,ShoppingPage,Footer},
  methods : {}
}
</script>
<style scoped>
#title{margin:0}
h2{text-align:center; margin: 30px 0}
#title h2 img{width: 30%; margin:0;}
#upper{width:100%; margin: 0 auto; background: yellow;}
main { height: 1350px;}

</style>
