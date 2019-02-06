<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Edition d'une Personne</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	Ch'tite Biloute:
	<input type="text">
	<div class="container">
		<fieldset>
			<legend>Edition d'une Personne</legend>

			<form:form action="save" method="get"
				modelAttribute="ressourcesHumaines">
				<form:hidden path="version" />
				<div class="form-group">
					<form:label path="id">Id</form:label>
					<form:input path="id" readonly="true" cssClass="form-control" />
				</div>
				<div class="form-group">
					<form:label path="nom">Nom</form:label>
					<form:input path="nom" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="prenom">Prenom</form:label>
					<form:input path="prenom" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="adresse">Adresse</form:label>
					<form:input path="adresse" cssClass="form-control" required="true" value="numero" />
					<form:input path="adresse" cssClass="form-control" required="true" value="rue" />
					<form:input path="adresse" cssClass="form-control" required="true" value="code postale" />
					<form:input path="adresse" cssClass="form-control" required="true" value="ville" />
					<form:input path="adresse" cssClass="form-control" required="true" value="pays" />
				</div>
				<div class="form-group">
					<form:label path="coordonnees">Coordonnees</form:label>
					<form:input path="coordonnees" cssClass="form-control"
						required="true" value="telephone"/>
						<form:input path="coordonnees" cssClass="form-control"
						required="true" value="email"/>
				</div>
				<div class="form-group">
					<form:label path="formation">Formations</form:label>
					<form:input path="formation" cssClass="form-control" required="true" />
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