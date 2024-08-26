<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
	<h1>main</h1>
	<p>ㅎㅇ 내 이름 ${name}</p>
	<p>ㅎㅇ 내이름 ${person.name}이고 , 나이 ${ person.age } 살 임</p>
	<a href="/servlet1?name=홍길동&age=21">이름은 홍길동, 나이는 21</a>
	<br>
	<a href="/servlet1/signup">회원가입</a>
	<!-- 
	1. main.jsp에 회원가입 링크를 추가
		- 링크는 /servlet/signup
	2. Signup 서블릿을 추가
		- views/signup.jsp와 연결
	3. signup.jsp 추가
	 -->
	
</body>
</html>