<template>
    <div id="nav_bar">       
        <li><a href="#">새소식</a></li>
        <li><a href="#">게임정보</a></li>
        <li><a href="#">e스포츠</a></li>
        <li><a href="#">커뮤니티</a></li>
        <li><a href="#">소셜미디어</a></li>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
    #nav_bar{width:800px; height:55px;margin: 0 auto; border-radius: 15px; background-color: rgb(233, 177, 104);}
    #nav_bar li{width:160px;float:left;text-align:center;list-style-type: none; line-height:55px;}
    #nav_bar li:hover{background-color:rgb(180, 131, 66); border-radius: 15px}
    #nav_bar li a{display:block;}
</style>
