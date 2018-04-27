<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Show Student Form</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="jumbotron jumbotron-fluid">
					<div class="container">
						<h1 class="display-4">Personel Data Form</h1>
						<p class="lead">This is a personel data entry form.</p>
					</div>
				</div>
				<form:form modelAttribute="personel" class="form-horizontal"
					method="post"
					action="${pageContext.request.contextPath}/savePersonel">
					<div class="form-group">
						<table>
							<tr>
								<td>name</td>
								<td><form:input id="name" path="name" type="text"
										class="form:input-large" /></td>
							</tr>
							<tr>
								<td>salary</td>
								<td><form:input id="salary" path="salary" type="number"
										class="form:input-large" /></td>
							</tr>
							<tr>
								<td>phoneModel</td>
								<td><form:checkboxes class="form-check-label"
										items="${phoneList}" path="phoneModel" /></td>
							</tr>
							<tr>
								<td>gender</td>
								<td>
									<form:radiobutton path = "gender" value = "M" label = "Male" />
                  					<form:radiobutton path = "gender" value = "F" label = "Female" />
								</td>
							</tr>
							<tr>
								<td>averageAge</td>
								<td>
									<form:radiobuttons path = "averageAge"  items="${avarageAgeList }" />
								</td>
							</tr>
							<tr>
								<td>skills</td>
								<td>
									<form:select path = "skills" items = "${skillsList}" multiple = "true" />
                     			</td>
							</tr>
							<tr>
								<td>country</td>
								<td>
								<form:select path="country">
										<form:option value="NONE" label="Select" />
										<form:options items="${countryList}" />
									</form:select>
								</td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" id="btnAdd"
									class="btn btn-primary" value="Kaydet" /></td>
							</tr>
						</table>
					</div>
				</form:form>
			</div>
		</div>


	</div>




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>