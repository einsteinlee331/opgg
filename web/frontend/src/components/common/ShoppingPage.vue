<template>
    <div class="list_box1">
        <div class="width950 div_box">
        <div @click="ItemList = name.unknown1, counter +=1, Price = name.price1, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img1"></div><span class="">{{name.unknown1}}</span><br><span class="">price : 300</span></div>
        <div @click="ItemList = name.unknown2, counter +=1, Price = name.price2, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img2"></div><span class="">{{name.unknown2}}</span><br><span class="">price : 200</span></div>
        <div @click="ItemList = name.unknown3, counter +=1, Price = name.price3, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img3"></div><span class="">{{name.unknown3}}</span><br><span class="">price : 100</span></div>
        <div @click="ItemList = name.unknown4, counter +=1, Price = name.price4, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img4"></div><span class="">{{name.unknown4}}</span><br><span class="">price : 120</span></div>
        <div @click="ItemList = name.unknown5, counter +=1, Price = name.price5, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img5"></div><span class="">{{name.unknown5}}</span><br><span class="">price : 150</span></div>
        <div @click="ItemList = name.unknown6, counter +=1, Price = name.price6, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img6"></div><span class="">{{name.unknown6}}</span><br><span class="">price : 230</span></div>
        <div @click="ItemList = name.unknown7, counter +=1, Price = name.price7, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img7"></div><span class="">{{name.unknown7}}</span><br><span class="">price : 700</span></div>
        <div @click="ItemList = name.unknown8, counter +=1, Price = name.price8, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img8"></div><span class="">{{name.unknown8}}</span><br><span class="">price : 800</span></div>
        <div @click="ItemList = name.unknown9, counter +=1, Price = name.price9, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img9"></div><span class="">{{name.unknown9}}</span><br><span class="">price : 120</span></div>
        <div @click="ItemList = name.unknown10, counter +=1, Price = name.price10, add(), fx_price(name.price1)" class="innerbox"><div class="miniB img10"></div><span class="">{{name.unknown10}}</span><br><span class="">price : 1000</span></div>
        <!-- <div class="innerbox"><div class="miniB img11"></div><span class="">name : unknown11</span><br><span class="">price : 500</span></div>
        <div class="innerbox"><div class="miniB img12"></div><span class="">name : unknown12</span><br><span class="">price : 500</span></div> -->
        
        <div id="popup">
        <h2>Total : {{this.total_price}} 원</h2>
        <span><br>Name : {{ ItemList }}을 선택하셨습니다</span><br>
        <span>Items In Cart : </span>
        <br>
        <div id="humph"></div>
        <span id="calculate"></span>
        <button>구매</button>
        <button @click="counter=0, ItemList =0, total_price=0, remove()">RESET</button>        
        </div>
        </div>

        </div>
    
</template>
<script>
export default {
    data() { 
        return {
            ItemList : '',
            counter : 0,
            thisCounter : '',
            ShoppingList : '',
            price : 0,
            total_price : 0,

            name : {
                    unknown1 : '베인',
                    unknown2 : '타릭',
                    unknown3 : '야스오',
                    unknown4 : '바이',
                    unknown5 : '이즈리얼',
                    unknown6 : '모데카이저',
                    unknown7 : '제라스',
                    unknown8 : '드레이븐',
                    unknown9 : '그레이브즈',
                    unknown10 : '사일러스',

                    price1 : 300,
                    price2 : 200,
                    price3 : 100,
                    price4 : 120,
                    price5 : 150,
                    price6 : 230,
                    price7 : 700,
                    price8 : 800,
                    price9 : 120,
                    price10 : 1000

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
          add: function(event){
            var myspan = document.getElementById("humph");
            var price = this.Price;
            var boo = document.getElementById("calculate");
            myspan.appendChild(document.createElement("p")).append(this.ItemList +'  '+ this.Price);
            return 
          },
          remove: function(){
           var var1 = document.getElementById("humph").getElementsByTagName('p');
            $(var1).remove();
            }
              
          },
          popup: function(){
              document.getElementById("popup");


          }
    }

</script>

<style>
main{position: relative}
#popup{width: 400px; height: 300px; position: absolute; bottom: 130px; right: 18%; overflow-y: scroll; background-color: rgb(123, 166, 247); padding-left: 20px}


.list_box1{width:1000px; margin: 0 auto;}
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
