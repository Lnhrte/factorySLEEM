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
			<legend>Edition d'une Personne</legend>

			<form:form action="save" method="get"
				modelAttribute="formateur">
				<form:hidden path="version" />
<%-- 				<form:hidden path="type" value="formateur"/> --%>
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
					<form:input path="adresse.numero" cssClass="form-control" required="true" value="numero" />
					<form:input path="adresse.rue" cssClass="form-control" required="true" value="rue" />
					<form:input path="adresse.codePostal" cssClass="form-control" required="true" value="code postal" />
					<form:input path="adresse.ville" cssClass="form-control" required="true" value="ville" />
					<form:input path="adresse.pays" cssClass="form-control" required="true" value="pays" />
				</div>
				<div class="form-group">
					<form:label path="coordonnees">Coordonnees</form:label>
					<form:input path="coordonnees.telephone" cssClass="form-control"
						required="true" value="telephone"/>
						<form:input path="coordonnees.email" cssClass="form-control"
						required="true" value="email"/>
				</div>
					<div class="form-group">
					<form:label path="indisponibleDebut">Indisponnible du</form:label>
					<form:input type="date" path="indisponibleDebut" cssClass="form-control" required="true" />
				</div>
				<div class="form-group">
					<form:label path="indisponibleFin">au</form:label>
					<form:input type="date" path="indisponibleFin" cssClass="form-control" required="true" />
				</div>
<!-- 				<div class="form-group"> -->
					<form:label path="matieres">Matieres</form:label>
					<form:select path="matieres" cssClass="form-control" required="true">
					<ul>${matiere.id}</ul>
					</form:select>
<%-- 					<form:input path="matieres" cssClass="form-control" required="true" /> --%>
<!-- 				</div> -->
				<div>
					<button class="btn btn-success" type="submit">Enregistrer</button>
					<a class="btn btn-warning" href="./">Annuler</a>
				</div>
			</form:form>
		</fieldset>

	</div>
</body>
</html>