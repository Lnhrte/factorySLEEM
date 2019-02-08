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

<title>Liste des matières</title>
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
				<span>Liste des matières</span>
			</div>
			<div class="section-title text-white">
					<h2>Liste des matières</h2>
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