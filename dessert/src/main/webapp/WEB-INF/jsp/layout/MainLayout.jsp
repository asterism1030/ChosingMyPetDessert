<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Animal Dessert Site</title>
</head>
<style>
html, body {
	width: 100%;
	height: 100%;
	margin: 0px;
}

.main_top {
	height: 20vh;
	width: 100%;
}

.main_center {
	width: 100%;
	height: calc(100% - 20vh);
}

.left {
	width: 15vw;
	height: 100%;
	float: left;
}

.content {
	height: 100%;
	width: calc(100% - 40vw);
	float: left;
}

.right {
	width: 25vw;
	height: 100%;
	float: left;
}
</style>
<body>

	<div class="main_top">
		<tiles:insertAttribute name="siteTop" />
	</div>

	<div class="main_center">
		<div class="left">
			<tiles:insertAttribute name="siteLeft" />
		</div>

		<div class="content">
			<tiles:insertAttribute name="content" />
		</div>

		<div class="right">
			<tiles:insertAttribute name="siteRight" />
		</div>
	</div>


	<script>
 	// TODO ) 분리...??
 	/*
 	 *		로그아웃 버튼 이벤트
 	 */
var logoutBtn = document.querySelector(".logout-btn");
logoutBtn.addEventListener('click', logout);

function logout() {
	//alert(request.getContentType());
	// Get 비동기 쿼리 전송
	fetch("/")
	.then(function(response) {
		alert(response);
	})
	.catch((e)=>console.log(e));
}
 	 
 	/*
 	 * 		좋아요 버튼 이벤트
 	 */
var isLikeBtn = document.querySelector(".like-btn");
isLikeBtn.addEventListener('click', addLike);

function addLike() {
	let url = "/addLiked";
	let dessert_id = document.getElementsByName("id")[0].value;
	let dessert_likeCnt = document.getElementsByName('likeCnt')[0].value;
	
	// TODO ) 전달 인자는 charset, int 이므로 이것에 맞춰서 수정
	
	// POST 비동기 쿼리 전송
	fetch(url, {
		method: "POST",
		cache: 'no-cache',
		headers: {
			'Content-Type': 'charset=utf-8;charset=utf-8',
		},
		body:
			JSON.stringify({
			    id: inputed_id,
			    pwd: inputed_pwd,
			  }),
	})
	.then(function(response) {
		alert(response);
	})
	.catch((e)=>console.log(e));
}

	/*
	 * 		장바구니 담기 버튼 이벤트
	 */
var addToCartBtn = document.querySelector(".addToCart-btn");
addToCartBtn.addEventListener('click', addToCart);

function addToCart() {
let url = "/addToCart";

let item = object;	// TODO) 디저트 정보를 통째로 보냄

// POST 비동기 쿼리 전송
fetch(url, {
	method: "POST",
	cache: 'no-cache',
	headers: {
		'Content-Type': 'charset=utf-8;charset=utf-8',
	},
	body:
		JSON.stringify({
		    id: inputed_id,
		    pwd: inputed_pwd,
		  }),
})
.then(function(response) {
	alert(response);
})
.catch((e)=>console.log(e));
}

	/*
	 * 		장바구니 빼기 버튼 이벤트
	 */
var subToCartBtn = document.querySelector(".subToCart-btn");
subToCartBtn.addEventListener('click', subToCart);

function subToCart() {
let url = "/addToCart";

let id = "";	// 디저트 아이디

//POST 비동기 쿼리 전송
fetch(url, {
method: "POST",
cache: 'no-cache',
headers: {
	'Content-Type': 'charset=utf-8;',
},
body:
	JSON.stringify({
	    id: inputed_id,
	  }),
})
.then(function(response) {
alert(response);
})
.catch((e)=>console.log(e));
}
	</script>

</body>
</html>