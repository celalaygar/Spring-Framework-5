<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>This is General page</h5>
	<table>
		<tr><td>Mesaj 1 : </td><td>${mesaj1 }</td></tr>
		<tr><td>Mesaj 2 : </td><td>${mesaj2 }</td></tr>
	</table>
	
	<hr/>
	<a href="${pageContext.request.contextPath}/"  >Geri</a><br/>
</body>
</html>