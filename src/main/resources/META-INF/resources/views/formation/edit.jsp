<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>

<title>Creation formation</title>
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
	<div class="page-info-section set-bg" style="background-image:url('../img/page-bg/3.jpg');">
		<div class="container">
			<div class="site-breadcrumb">
				<a href="../HomeGestionnaire">Accueil</a>
				<span>Gestionnaire /</span>
				<span>Création formation</span>
			</div>
			
		</div>
	</div>
	


	<!-- Page -->
	<section class="contact-page spad pb-0">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="contact-form-warp">
						<div class="section-title text-white text-left">
							<h2>Créer une formation</h2>
							<p>Veuillez remplir les champs suivants</p>
						</div>

			<form:form class="contact-form" action="save" method="get" modelAttribute="formation">
				<form:hidden path="version" />
				<div class="form-group">
					<form:label path="id">Id</form:label>
					<form:input path="id" readonly="true" cssClass="form-control" />
				</div>
				
					<p style="color:black">Date de début de la formation</p>
					<form:input type="date" path="dateDebut" cssClass="form-control" required="true" />
				
				
					<p style="color:black">Date de fin de la formation</p>
					<form:input type="date" path="dateFin" cssClass="form-control" required="true" />
				
					<p style="color:black">Matière de la formation</p>
					<select>
					<c:forEach var="matiere" items="${matieres}">
							<option value="matiere">${ matiere.titre}</option>
							</c:forEach>
							</select><br><br>
							
							
					<p style="color:black">Formateur de la formation</p>
<!-- 					<select> -->
<%-- 					<c:forEach var="formateur" items="${formateurs}"> --%>
<%-- 							<option value="formateur">${ formateur.nom}</option> --%>
<%-- 							</c:forEach> --%>
<!-- 							</select><br><br>				 -->
				<div>
					<button class="site-btn" type="submit">Enregistrer</button>
					<a class="b-btn" href="../HomeGestionnaire">Annuler</a>
				</div>
			</form:form>
			</div>
			</div>
			</div></div>
	</section>

	
</body>
</html>