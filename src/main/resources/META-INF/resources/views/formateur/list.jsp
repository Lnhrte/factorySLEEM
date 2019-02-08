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

<title>Liste des formateurs</title>
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
				<span>Liste des formateurs</span>
			</div>
			<div class="section-title text-white">
					<h2>Liste des formateurs</h2>
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
			<th>Nom</th>
			<th>Prenom</th>
			<th colspan="5" style="text-align: center">Adresse</th>
			<th colspan="2" style="text-align: center">Coordonnees</th>
			<th colspan="2" style="text-align: center">Indisponible</th>
			<th>Matieres</th>
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
			<td>Du</td>
			<td>Au</td>

		</tr>
		<c:forEach var="formateur" items="${formateur}">
			<tr>
				<td>${formateur.id}</td>
				<td>${formateur.nom}</td>
				<td>${formateur.prenom}</td>
				<td>${formateur.adresse.numero}</td>
				<td>${formateur.adresse.rue}</td>
				<td>${formateur.adresse.codePostal}</td>
				<td>${formateur.adresse.ville}</td>
				<td>${formateur.adresse.pays}</td>
				<td>${formateur.coordonnees.telephone}</td>
				<td>${formateur.coordonnees.email}</td>
				<td><fmt:formatDate value="${formateur.indisponibleDebut}"
						pattern="dd/MM/yyyy" /></td>
				<td><fmt:formatDate value="${formateur.indisponibleFin}"
						pattern="dd/MM/yyyy" /></td>
<!-- 				<td><a class="btn btn-success" href="./matiere/list">Voir Matieres</a></td> -->
				<td><a class="btn btn-success" href="./matiere?id=${formateur.id}">Voir Matieres</a></td>
				<td><a class="btn btn-danger"
					href="./delete?id=${formateur.id}">Supprimer</a></td>
				<td><a class="btn btn-info" href="./edit?id=${formateur.id}">Editer</a></td>
			</tr>
		</c:forEach>
	</table>

	<a class="btn btn-info" href="./creation">Nouveau Formateur</a>
</body>
</html>