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

<title>Liste des formations</title>
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
<!-- Header section -->
	<header class="header-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="site-logo">
						<img src="../img/logoNous.png" alt="">
					</div>
					
				</div>
				
			</div>
		</div>
	</header>
	<!-- Header section end -->
	
	<!-- Page info -->
	<div class="page-info-section set-bg" style="background-image:url('../img/page-bg/4.jpg');">
		<div class="container">
			<div class="site-breadcrumb">
				<a href="../HomeGestionnaire">Accueil</a>
				<span>Liste des formations</span>
			</div>
			<div class="section-title text-white">
					<h2>Liste des formations</h2>
				</div>
		</div>
	</div>
	

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