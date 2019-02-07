<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Liste des matieres</title>
</head>
<body>
	<div>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			logged as${pageContext.request.userPrincipal.name } <a class="btn"
				href="../logout">logout</a>
		</c:if>
	</div>
	<sec:authorize access="hasRole('ROLE_ADMIN')"></sec:authorize>
	<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_USER')"></sec:authorize>
	<table class="table">
		<tr>
			<th>Id</th>
			<th>Titre</th>
			<th>Durée</th>
			<th>Objectif</th>
			<th>Prérequis</th>
			<th>Contenu</th>
			<th>Niveau</th>
			<!-- 			<th>Formateurs</th> -->
			<!-- 			<th>Modules</th> -->
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="matiere" items="${matieres}">
			<tr>
				<td>${matiere.id}</td>
				<td>${matiere.titre}</td>
				<td>${matiere.duree}</td>
				<td>${matiere.objectif}</td>
				<td>${matiere.prerequis}</td>
				<td>${matiere.contenu}</td>
				<td>${matiere.niveau}</td>
				<%-- 				<td>${matiere.formateurs}</td> --%>
				<%-- 				<td>${matiere.modules}</td> --%>
				<td><a class="btn btn-danger" href="./delete?id=${matiere.id}">Supprimer</a></td>
				<td><a class="btn btn-info" href="./edit?id=${matiere.id}">Editer</a></td>
			</tr>
		</c:forEach>
	</table>

	<a class="btn btn-info" href="./add">Nouvelle Matiere</a>
</body>
</html>