<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 글쓰기 화면</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function writeui() {
		location.href = "writeForm";
	}
</script>
</head>
<body>
	<div class="container">
		<img src="image/multicampus.png">
		<h2 class="text-center">공지사항 목록 화면</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
			<c:set var="pageDTO" value="${pageDTO}" />
				<c:forEach var="list" items="${pageDTO.list}">
					<tr>
						<td>${list.no}</td>
						<td><a href="retrieve?no=${list.no}">${list.title}</a></td>
						<td>${list.author}</td>
						<td>${list.writeday}</td>
						<td>${list.readcnt}</td>
						<td><a href="delete?no=${list.no}">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tr>
				<td colspan="6">
				<c:set var="perPage" value="${pageDTO.perPage}" />
				<c:set var="curPage" value="${pageDTO.curPage}" />
				<c:set var="totalCount" value="${pageDTO.totalCount}" />
				
				<c:set var="totalNum" value="${totalCount / perPage}" />
				<c:if test="${totalCount%perPage !=0 }">
				<c:set var="totalNum" value="${totalNum+1}" />
				</c:if>
				
					<c:forEach var="x" begin="1" end="${totalNum}">
						<c:choose>
							<c:when test="${curPage == x}">
								${x}
							</c:when>
							<c:otherwise>
							<a href="list?curPage=${x}">${x}</a>			
							</c:otherwise>
						</c:choose>
						</c:forEach>
				</td>
			</tr>
		</table>
		<button onclick="writeui()">글쓰기</button>
	</div>

</body>
</html>