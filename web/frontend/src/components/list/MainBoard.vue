
<template>
    <section id="mainboard">
        <div class="boxes" id="board">
            <nav id="inner_nav">
                <li><a href="#image">새소식</a></li>
                <li><a href="#">e스포츠</a></li>
                <li><a href="#">커뮤니티</a></li>
            </nav>
                <div id="page1">
                    <div id="image"></div>
                    <h4>9.13 패치 노트(수정)</h4>
                    <span>9.13 패치의 시간이 돌아왔습니다. 이번 패치에 반영된 주요 변경 사항을 만나보세요!</span>
                </div>
        </div>
        <div class="boxes" id="login">
            <h5>회원가입 및 로그인</h5>
            <router-link to="../Loginpage"><button id="loginbox"></button></router-link><br>
            <span id="enrollment"><router-link to="../Enrollment">회원가입</router-link></span><br><span><a href="">아이디 | 비밀번호찾기</a></span>
        </div>

    
        <div class="boxes" id="search">
            <ul>
             <li>챔피언 검색</li>
            </ul>
            <div class="inner-contents">
            <div class="search-input">
            <form id="mainSearchForm">
            <span><input id="searchKeyword" type="text" title="검색어를 입력하세요" onkeypress="return checkEnter(event, 'buttonSearchKeyword');"></span>
            <input type="button" class="searchBtn" value="검색" title="검색" onclick="mainSearchKeyword();" id="buttonSearchKeyword">
            </form>
        </div>
       
        </div>

        </div>
    </section>
</template>



<script>
import Enrollment from '@/components/list/Enrollment'
export default {
    
}
</script>


<style scoped>
/* board */
#mainboard{width:1200px; margin: 0 auto; padding: 50px;}
#board{width: 600px; height: 400px;  float: left; border-style:solid;}
#login{width: 450px; height: 200px;  border-style:solid; float: left;}

#inner_nav{width: 600px; height:75px; background: rgb(106, 186, 252);}
#inner_nav li{width:200px; float:left;text-align:center; list-style-type: none;
height:75px;line-height:75px;}
#inner_nav li:hover{background-color: blue}
#inner_nav li a{display:block}
#image{width: 100%; height: 180px; background-image:url("../../assets/main.jpg");}

/* login */
h5{text-align: center; width:100%; height:40px; line-height:40px; font-weight: bolder; font-size: 23px}
#loginbox{margin-bottom: 10px; width:250px; height:60px;
background-image:url("//static.leagueoflegends.co.kr/common/img/main/login_trigger_btn.png"); 
background-size:cover; background-position-x: -30px;box-shadow: 1px 1px 4px}
#login{text-align:center;}
/* boxes */
#search{width: 450px; height: 200px; float: left; border-style: none solid solid none;background-image:url(../../assets/champ-main.png);
background-size:cover; }
#loginbox > a {display: block}
#mainSearchForm{text-align:center; padding-top: 30px;}
.inner-contents{ height: 100px;}
#searchCover{background:rgba(150, 145, 145, 0.171); width:450px;height:200px;}
</style>

