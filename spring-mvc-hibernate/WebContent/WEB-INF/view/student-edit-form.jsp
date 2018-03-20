<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The Student Ekle</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row"> 
		
			<div class="col-12">
				<div class="jumbotron">
					<h3>Öğrenci Ekleme Paneli</h3>
					<div class="col-12">
						<a class="btn btn-success" href="${pageContext.request.contextPath }/student/list">
							Öğrenci Listesine Geri Git
						</a>
					</div>
				</div>
				<div class="col-12">
				
					<form:form class="form-horizantal" modelAttribute="student" action="" method="POST">
						<div class="form-group">
							<label for="adi" class="col-sm-10 control-label">Ogrenci Adi</label>
							<div>
								<form:input type="text" class="form-control" id="adi" placeholder="adi" path="firstName"></form:input> 
							</div>
						</div>
						<div class="form-group">
							<label for="adi" class="col-sm-10 control-label">Ogrenci SoyAdi</label>
							<div>
								<form:input type="text" class="form-control" id="soyadi" placeholder="soyadi" path="lastName"></form:input> 
							</div>
						</div>
						<div class="form-group">
							<label for="adi" class="col-sm-10 control-label">Ogrenci Email</label>
							<div>
								<form:input type="text" class="form-control" id="email" placeholder="email" path="email"></form:input> 
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary" >Güncelle</button> 
							</div>
						</div>
					</form:form>
				</div>
				
				<hr>

			</div>
		</div>
	
	</div>
</body>
</html>