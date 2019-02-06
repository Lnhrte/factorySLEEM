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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
			<th>Nom</th>
			<th>Prenom</th>
			<th>Adresse</th>
			<th>Coordonnees</th>
			<!-- 			<th>Formations</th> -->
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="ressourcesHumaines" items="${ressourcesHumaines}">
			<tr>
				<td>${ressourcesHumaines.id}</td>
				<td>${ressourcesHumaines.nom}</td>
				<td>${ressourcesHumaines.prenom}</td>
				<td>${ressourcesHumaines.adresse}</td>
				<td>${ressourcesHumaines.coordonnees}</td>
				<%-- 				<td>${ressourcesHumaines.formation}</td> --%>
				<td><a class="btn btn-danger"
					href="./delete?id=${ressourcesHumaines.id}">Supprimer</a></td>
				<td><a class="btn btn-info"
					href="./edit?id=${ressourcesHumaines.id}">Editer</a></td>
			</tr>
		</c:forEach>
	</table>

	<a class="btn btn-info" href="./add">Nouvelle Personne</a>
</body>
</html>