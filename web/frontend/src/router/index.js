import Vue from 'vue'
import Router from 'vue-router'
import Vuex from 'vuex'
import Home from '@/components/Home'
import Nav from '@/components/common/Nav'
import Shopping from '@/components/list/Shopping'
import MenuBar from '@/components/list/MenuBar'
import MainBoard from '@/components/list/MainBoard'
import Enrollment from '@/components/list/Enrollment'
import Carousel from '@/components/common/Carousel'
import ShoppingPage from '@/components/common/ShoppingPage'
import Test from '@/components/list/Test.vue'
import Loginpage from '@/components/list/Loginpage.vue'
import MyPage from '@/components/list/MyPage.vue'
import MyPageEdit from '@/components/list/MyPageEdit.vue'


Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
   {path: '/',name: 'home',component: Home},
   {path: '/nav', name: 'nav', component: Nav},
   {path: '/shopping', name: 'shopping', component: Shopping},
   {path: '/carousel', name: 'carousel', component: Carousel},
   {path: '/mainboard', name: 'mainboard', component: MainBoard},
   {path: '/enrollment', name: 'enrollment', component: Enrollment},
   {path: '/shoppingpage', name: 'shoppingpage', component: ShoppingPage},
   {path: '/menubar', name: 'menubar', component: MenuBar},
   {path: '/test', name: 'test', component: Test},
   {path: '/loginpage', name: 'loginpage', component: Loginpage},
   {path: '/myPage', name: 'myPage', component: MyPage},
   {path: '/myPageEdit', name: 'myPageEdit', component: MyPageEdit}
  ]
})
