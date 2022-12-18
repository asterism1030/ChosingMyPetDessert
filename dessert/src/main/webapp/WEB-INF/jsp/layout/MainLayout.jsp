<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
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
		<tiles:insertAttribute name="siteTop"/>
	</div>

	<div class="main_center">
		<div class="left">
			<tiles:insertAttribute name="siteLeft"/>
		</div>
		
		<div class="content">
			<tiles:insertAttribute name="content"/>
		</div>
		
		<div class="right">
			<tiles:insertAttribute name="siteRight"/>
		</div>
	</div>
 
</body>
</html>