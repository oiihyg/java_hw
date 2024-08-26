<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container"></div>
	<h1 class="mt-3">회원가입</h1>
	<!-- 
	회원 가입을 위한 화면을 구성
	- 아이디, 비번, 비번확인, 이메일
	 -->
	<form action="<%=request.getContextPath()%>/signup" method="post">
		<div class="form-group">
	  		<label for="id">Name:</label>
	  		<input type="text" class="form-control" id="usr" name="id">
		</div>
		<div class="form-group">
		  	<label for="pw">Password:</label>
		  	<input type="password" class="form-control" id="pw" name="pw">
		</div>
		<div class="form-group">
		  	<label for="pw2">Password con:</label>
		  	<input type="password" class="form-control" id="pw2" name="pw2">
		</div>
		<div class="form-group">
		  	<label for="email">email:</label>
		  	<input type="email" class="form-control" id="email" name="email">
		</div>
		<button type="submit" class="btn btn-outline-success col-12">회원가입</button>
	</form>
	<c:if test=""></c:if>
</body>
</html>