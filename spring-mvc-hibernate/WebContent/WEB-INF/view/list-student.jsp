<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The Student Listesi</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">


		<div class="jumbotron">
			<h1 class="display-4">Öğrenci Listesi</h1>
			<hr class="my-4">
			<p class="lead">
				<a class="btn btn-success"
					href="${pageContext.request.contextPath }/">
					Anasayfa </a> 
				<a class="btn btn-info "
					onclick="window.location.href='showStudentForm'; return false;"
					type="button" >Öğrenci Ekle</a>
			</p>
		</div>

		<div>
			<table class="table table-striped">
				<tr>
					<th>İd</th>
					<th>First Name</th>
					<th>Lasnt Name</th>
					<th>Email Addres</th>
					<th>İşlem</th>
				</tr>
				<c:forEach var="tempStudent" items="${students }">
					<tr>
						<td>${tempStudent.id }</td>
						<td>${tempStudent.firstName }</td>
						<td>${tempStudent.lastName }</td>
						<td>${tempStudent.email }</td>
						<th>
							<a class="btn btn-warning"
							href="${pageContext.request.contextPath }/student/showFormForUpdate/${tempStudent.id }">
								Güncelle </a>
								<a class="btn btn-danger"
							href="${pageContext.request.contextPath }/student/deleteStudent/${tempStudent.id }">
								Sil </a>
						</th>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>