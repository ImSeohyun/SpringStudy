<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

<form action="LoginServlet" method="get">
아이디: <input type="text" name="userid" id="userid">
비밀번호: <input type="text" name="passwd" id="passwd"><br>
<input type="submit" value="로그인">
<input type="reset" value="취소">
</form>