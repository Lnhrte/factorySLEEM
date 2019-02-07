<%@page import="sopra.projet.factorySleem.model.Formation"%>
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

<title>Planning</title>
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
						<img src="img/logoNous.png" alt="">
					</div>
					
				</div>
				
			</div>
		</div>
	</header>
	<!-- Header section end -->
	
	<!-- Page info -->
	<div class="page-info-section set-bg" style="background-image:url('img/page-bg/1.jpg');">
		<div class="container">
			<div class="site-breadcrumb">
				<a href="HomeGestionnaire.html">Accueil</a>
				<span>Planning</span>
			</div>
			<div align="right"><button class="site-btn">Générer un PDF</button></div>
			<div class="section-title text-white">
					<h2>Planning duree${dureeFormation } module 1 ${modules[0]}</h2><br>
					
			
			
				</div>
				
		</div>
	</div>


	<table class="table">
		<tr>
			<th style="vertical-align: middle; text-align: center;">Mois</th>
			<th style="vertical-align: middle; text-align: center;">Date</th>
			<th style="vertical-align: middle; text-align: center;">Module</th>
			<th style="vertical-align: middle; text-align: center;">Formateurs</th>
			<th style="vertical-align: middle; text-align: center;">Titre</th>

		</tr>
		<tr>
			<td rowspan="${dureeFormation}"
				style="vertical-align: middle; text-align: center;"><c:if
					test="${formation.dateDebut.getMonth()==0}">Janvier</c:if> <c:if
					test="${formation.dateDebut.getMonth()==1}">Février</c:if> <c:if
					test="${formation.dateDebut.getMonth()==2}">Mars</c:if> <c:if
					test="${formation.dateDebut.getMonth()==3}">Avril</c:if> <c:if
					test="${formation.dateDebut.getMonth()==4}">Mai</c:if> <c:if
					test="${formation.dateDebut.getMonth()==5}">Juin</c:if> <c:if
					test="${formation.dateDebut.getMonth()==6}">Juillet</c:if> <c:if
					test="${formation.dateDebut.getMonth()==7}">Août</c:if> <c:if
					test="${formation.dateDebut.getMonth()==8}">Septembre</c:if> <c:if
					test="${formation.dateDebut.getMonth()==9}">Octobre</c:if> <c:if
					test="${formation.dateDebut.getMonth()==10}">Novembre</c:if> <c:if
					test="${formation.dateDebut.getMonth()==11}">Décembre</c:if></td>

		</tr>
		<c:forEach var="i" begin="0" end="${dureeFormation}" step="1">
			<tr>
				<td style="vertical-align: middle; text-align: center;">${formation.dateDebut.getDay()+i}</td>
			</tr>
		</c:forEach>
		<tr>
			<td rowspan="${dureesModules.get(0)}" bgcolor="yellow"
				style="vertical-align: middle; text-align: center;">${modules.get(0)}</td>
			<td rowspan="${dureesModules.get(0)}"
				style="vertical-align: middle; text-align: center;">Olivier</td>
			<td rowspan="${dureesModules.get(0)}"
				style="vertical-align: middle; text-align: center;">Formateur
				JEE</td>
		</tr>


	</table>
</body>
</html>