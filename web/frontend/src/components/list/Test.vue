<template>
    <div class="d">
        <Nav></Nav>
        <div class="hello">
        <div class="width950 div_box">
        <div class="innerbox"><div @click="ItemList = name.unknown1, counter +=1, Price = name.price1, add(), fx_price(name.price1)" class="miniB img1"></div><span class="item">name : unknown1</span><br><span class="">price : {{name.price1}}</span></div>
        <div class="innerbox"><div @click="ItemList = name.unknown2, counter +=1, Price = name.price2, add(), fx_price(name.price2)" class="miniB img2"></div><span class="item">name : unknown2</span><br><span class="">price : {{name.price2}}</span></div>
        <div class="innerbox"><div @click="ItemList = name.unknown3, counter +=1, Price = name.price3, add(), fx_price(name.price3)" class="miniB img3"></div><span class="item">name : unknown3</span><br><span class="">price : {{name.price3}}</span></div>
        <div class="innerbox"><div @click="ItemList = name.unknown4, counter +=1, Price = name.price4, add(), fx_price(name.price4)" class="miniB img4"></div><span class="item">name : unknown4</span><br><span class="">price : {{name.price4}}</span></div>
        </div>

        <h2>Total : {{this.total_price}} 원</h2>
        <span><br>Name : {{ ItemList }}</span><br>

        <p>Items in cart : {{ counter }}</p>
         <span>Items In Cart : </span><div id="humph"></div>
        <span id="calculate"></span>

        <button @click="counter=0, ItemList =0, total_price=0">RESET</button>
    </div>
      </div>

</template>

<script>
import Nav from '@/components/common/Nav.vue'
export default {
     components : {Nav},
    data() { 
        return {
            ItemList : '',
            counter : 0,
            thisCounter : '',
            ShoppingList : '',
            price : 0,
            total_price : 0,

            name : {
                    unknown1 : 'unknown1',
                    unknown2 : 'unknown2',
                    unknown3 : 'unknown3',
                    unknown4 : 'unknown4',
                    price1 : 1000,
                    price2 : 1200,
                    price3 : 1100,
                    price4 : 1300,
            },
            addCart : {
                previous: null,
                current: '',
                operator: null,
                operatorClicked: false
            }
           
        }
    },
    methods : {
          fx_price: function(newPrice) {
                // alert('추가한값 : '+ newPrice)
                return this.total_price += newPrice
          },
          unknown3() {
                 return `${this.name.unknown3}`
          },
          unknown4() {
                 return `${this.name.unknown4}`
            },
          bum: function(event){
            var myspan = document.getElementById("humph");

            return 
           },
          add: function(event){
            var myspan = document.getElementById("humph");
            var price = this.Price;
            var boo = document.getElementById("calculate");
            myspan.appendChild(document.createElement("p")).append(this.ItemList +'  '+ this.Price);
            return 
          },
      },
    computed: {    
        }
    }

</script>

<style scoped>
.hello{width:1000px; margin: 0 auto;}
.width900{width:950px; margin: 0 auto;}
.innerbox{width:220px; height:350px; float: left;margin-left: 2.5%; border-radius: 5%; border-style:double; margin-bottom: 2.5%;text-align: center}
.miniB{height:280px; background-size:contain;
background-repeat:no-repeat; cursor: pointer;}
.miniB:hover{background-size: 20em;
}
.miniB span{text-align: center}
.img1{background-image: url(../../assets/champ1.png)}
.img2{background-image: url(../../assets/champ2.png); background-position: center; }
.img3{background-image: url(../../assets/champ3.png); background-position: center;}
.img4{background-image: url(../../assets/champ4.png); background-position: center;}
.img5{background-image: url(../../assets/champ5.png); background-position: center;}
.img6{background-image: url(../../assets/champ6.png); background-position: center; background-position-x: 15px}
.img7{background-image: url(../../assets/champ7.png)}
.img8{background-image: url(../../assets/champ8.png)}
.img9{background-image: url(../../assets/champ9.png)}
.img10{background-image: url(../../assets/champ10.png)}
</style>
