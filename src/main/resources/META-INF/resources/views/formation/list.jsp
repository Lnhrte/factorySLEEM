<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Liste des formations</title>
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
			<th>Date de début</th>
			<th>Date de fin</th>
			<th></th>
			<th></th>
			<th></th>

		</tr>
		<c:forEach var="formation" items="${formations}">
			<tr>
				<td>${formation.id}</td>
				<td><fmt:formatDate value="${formation.dateDebut}" pattern="dd/MM/yyyy" /></td>
				<td><fmt:formatDate value="${formation.dateFin}" pattern="dd/MM/yyyy" /></td>
				
				<td><a class="btn btn-danger" href="./delete?id=${formation.id}">Supprimer</a></td>
				<td><a class="btn btn-info" href="./edit?id=${formation.id}">Editer</a></td>
				<td><a class="btn btn-success" href="./planning?id=${formation.id}">Voir Planning</a></td>
			</tr>
		</c:forEach>
	</table>

	<a class="btn btn-info" href="./add">Nouvelle Formation</a>
</body>
</html>