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
			<legend>Edition de la Matiere</legend>

			<form:form action="save" method="get" modelAttribute="matiere">
				<form:hidden path="version" />
				<div class="form-group">
					<form:label path="id">Id</form:label>
					<form:input path="id" readonly="true" cssClass="form-control" />
				</div>
				<div class="form-group">
					<form:label path="titre">Titre</form:label>
					<form:input path="titre" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="duree">Durée</form:label>
					<form:input path="duree" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="objectif">Objectif</form:label>
					<form:input path="objectif" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="prerequis">Prérequis</form:label>
					<form:input path="prerequis" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="contenu">Contenu</form:label>
					<form:input path="contenu" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="niveau">Niveau</form:label>
					<form:input path="niveau" cssClass="form-control" required="true" />
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