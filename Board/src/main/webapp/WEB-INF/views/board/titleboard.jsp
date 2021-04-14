<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
alert(${regMsg })
</script>

<body>
	<h1>Connected</h1>
	<table border = 1 >
	<c:forEach items="${list }" var="list">
	<tr>
		<td>${list.bno }</td>
		<td><c:out value="${list.title }"/></td>
		<td><c:out value="${list.writer }"/></td>
		<td><c:out value="${list.regdate }"/></td>
	</tr>
	</c:forEach>
</table> 
	
</body>
</html>