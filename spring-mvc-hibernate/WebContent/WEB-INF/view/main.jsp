<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Anasayfa</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="jumbotron">
					<h1 class="display-4">ANASAYFA</h1>
					<p>Bu sayfa üzerinde spring framework içeriisinde hibernate kullanılarak öğrenci ekleme listeleme silme ve güncelleme işlemi yapılacaktır.</p>
					<hr class="my-4">
					<a class="btn btn-success"
						href="${pageContext.request.contextPath }/student/list">
						Öğrenci Listesi </a> 
					<a class="btn btn-info"
						href="${pageContext.request.contextPath }/student/showStudentForm">Öğrenci
						Ekle</a> 

				</div>
			</div>
		</div>

	</div>

</body>
</html>