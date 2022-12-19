<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>MyPetDessert Login Page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">

</head>
<style>
html, body {
	width: 100%;
	height: 100%;
}

.left {
	width: 50%;
	height: 100%;
	background-image: "";
	background-size: cover;
	background-repeat: no-repeat;
	float: left;
}

.right {
	width: 50%;
	height: 100%;
	padding: 5%;
	float: right;
}

.right .login-box {
	width: 100%;
	height: 100%;
	border: 1px solid #000;
	padding: 10%;
}

.login-box-logo {
	width: 100%;
	height: 33%;
	background-image:
		url(https://static.cdninstagram.com/rsrc.php/v3/yr/r/NL0hPV-L09m.png);
	background-size: cover;
	background-repeat: no-repeat;
}

input {
	height: 7vh;
	width: 100%;
	margin: 1% 0%;
	font-size: 2.5vmin;
}

.login-btn {
	cursor: pointer;
	background-color: #b2dffc;
	color: #ffffff;
	font-weight: 600;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 10%;
	margin-top: 2%;
}
</style>
<body>
	<div class="left"></div>
	<div class="right">
		<div class="login-box">
			<div class="login-box-logo"></div>
			<div>
				<input type="text" name="id" placeholder="사용자 이름 또는 메일" /> <input
					type="password" name="pwd" placeholder="비밀번호" />
			</div>
			<div class="login-btn">로그인</div>
			<div style="border-top: 1px solid #999999; margin-top: 13%;"></div>
			<div
				style="margin: -4.5% 45%; color: #999999; width: 12%; background-color: #ffffff;">또는</div>
			<div
				style="margin-top: 11%; color: #999999; width: 100%; display: flex; justify-content: center;">비밀번호를
				잊으셨나요?</div>
		</div>
	</div>
	<script>
var loginBtn = document.querySelector(".login-btn");
loginBtn.addEventListener('click', login);

function login() {
	let url = "/login";
	let inputed_id = document.getElementsByName("id")[0].value;
	let inputed_pwd = document.getElementsByName('pwd')[0].value;
	
	//alert(request.getContentType());
	
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
</script>
</body>
</html>