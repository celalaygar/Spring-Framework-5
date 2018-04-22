<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>This is Main page</h5>

	<a href="${pageContext.request.contextPath}/">main</a>
	<br />
	<a href="${pageContext.request.contextPath}/search">Search</a>
	<br />
	<hr>
	<table>
		<tr>
			<th>işlem örneği</th>
			<th>işlem</th>
			<th>Örnek link</th>
		</tr>
		<tr>
			<td><b>@Pathvariable </b>kullanımı için :</td>
			<td>
				<a href="${pageContext.request.contextPath}/general-1/5/10/2011">tıkla</a>
			</td>
			<td>// http://localhost:8081/xdeneme/general/5/10/2011</td>
		</tr>
		<tr>
			<td><b>@RequestParam 1</b>kullanımı için :</td>
			<td>
				<a href="${pageContext.request.contextPath}/general-2-1?name=celal&surname=aygar">tıkla</a>
			</td>
			<td>// http://localhost:8081/xdeneme/general-2?name=celal&surname=aygar</td>
		</tr>
		
		
		<tr>
			<td><b>@RequestParam 2</b>kullanımı için :</td>
			<td>
				<a href="${pageContext.request.contextPath}/general-2-2?name=celal&surname=aygar&phoneNumber=05551112233">tıkla</a>
			</td>
			<td>// http://localhost:8081/xdeneme/general-2?name=celal&surname=aygar&phoneNumber=05551112233</td>
		</tr>

	</table>

</body>
</html>