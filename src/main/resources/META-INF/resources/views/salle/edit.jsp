<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>

<title>Edition de la Salle</title>
<meta charset="UTF-8">
	<meta name="description" content="WebUni Education Template">
	<meta name="keywords" content="webuni, education, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	

	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">

	<!-- Stylesheets -->
	<link rel="stylesheet" href="../css/bootstrap.min.css"/>
	<link rel="stylesheet" href="../css/font-awesome.min.css"/>
	<link rel="stylesheet" href="../css/owl.carousel.css"/>
	<link rel="stylesheet" href="../css/style.css"/>


</head>
<body>
	<div class="container">
		<fieldset>
			<legend>Edition de la Salle</legend>

			<form:form action="save" method="get" modelAttribute="salle">
				<form:hidden path="version" />
				<div class="form-group">
					<form:label path="code">Code</form:label>
					<form:input path="code" readonly="true" cssClass="form-control" />
				</div>
				<div class="form-group">
					<form:label path="cout">Cout</form:label>
					<form:input path="cout" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="capacite">Capacité</form:label>
					<form:input path="capacite" cssClass="form-control" required="true" />
				</div>
				<div>
					<button class="btn btn-success" type="submit">Enregistrer</button>
					<a class="btn btn-warning" href="./">Annuler</a>
				</div>
			</form:form>
		</fieldset>

	</div>
</body>
</html>