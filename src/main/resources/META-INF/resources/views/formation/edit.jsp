<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<fieldset>
			<legend>Edition de la Formation</legend>

			<form:form action="save" method="get" modelAttribute="formation">
				<form:hidden path="version" />
				<div class="form-group">
					<form:label path="id">Id</form:label>
					<form:input path="id" readonly="true" cssClass="form-control" />
				</div>
				<div class="form-group">
					<form:label path="dateDebut">Date de début</form:label>
					<form:input type="date" path="dateDebut" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="dateFin">Date de fin</form:label>
					<form:input type="date" path="dateFin" cssClass="form-control" required="true" />
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