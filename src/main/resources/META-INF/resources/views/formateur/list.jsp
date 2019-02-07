<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Liste de Personnes</title>
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
			<!-- 			<th>Type</th> -->
			<th>Nom</th>
			<th>Prenom</th>
			<th colspan="5" style="text-align: center">Adresse</th>
			<thcolspan="2" style="text-align: center">Coordonnees</th>
			<!-- 			<th>Formations</th> -->
			<th></th>
			<th></th>
		</tr>
		<tr>
			<td colspan="3"></td>
			<td>Numéro</td>
			<td>rue</td>
			<td>code postal</td>
			<td>ville</td>
			<td>pays</td>
			<td>telephone</td>
			<td>email</td>

		</tr>
		<c:forEach var="formateur" items="${formateur}">
			<tr>
				<td>${formateur.id}</td>
				<%-- 				<td>${formateur.type}</td> --%>
				<td>${formateur.nom}</td>
				<td>${formateur.prenom}</td>
				<td>${formateur.adresse.numero}</td>
				<td>${formateur.adresse.rue}</td>
				<td>${formateur.adresse.codePostal}</td>
				<td>${formateur.adresse.ville}</td>
				<td>${formateur.adresse.pays}</td>
				<td>${formateu.coordonnees.telephone}</td>
				<td>${formateur.coordonnees.email}</td>
				<%-- 				<td>${formateur.formation}</td> --%>
				<td><a class="btn btn-danger"
					href="./delete?id=${formateur.id}">Supprimer</a></td>
				<td><a class="btn btn-info" href="./edit?id=${formateur.id}">Editer</a></td>
			</tr>
		</c:forEach>
	</table>

	<a class="btn btn-info" href="./creation">Nouveau Formateur</a>
</body>
</html>