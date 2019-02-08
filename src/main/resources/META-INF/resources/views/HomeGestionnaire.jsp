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

<title>Home Gestionnaire</title>
<meta charset="UTF-8">
	<meta name="description" content="WebUni Education Template">
	<meta name="keywords" content="webuni, education, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	

	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">

	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.css"/>
	<link rel="stylesheet" href="css/style.css"/>
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
	<div class="page-info-section set-bg" style="background-image:url('img/page-bg/4.jpg');">
		<div class="container">
			<div class="site-breadcrumb">
				<a href="./HomeGestionnaire">Accueil</a>
				<span>Gestionnaire</span>
			</div>
			<div class="section-title text-white">
					<h2>Bienvenue sur votre compte gestionnaire</h2>
				</div>
		</div>
	</div>
	



<!-- categories section -->
	<section class="categories-section spad">
		<div class="container">
			
			<div class="row">
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" style="background-image:url('img/formation.png');"></div>
						<div class="ci-text">
							<h5>Formation</h5>
							<p><a href="./formation/add">Ajouter une formation</a><br>
							<a href="./formation/">Accéder aux formations</a></p>
							<span>1</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" style="background-image:url('img/planning.png');"></div>
						<div class="ci-text">
							<h5>Planning</h5>
							<p><a href="./formation/planning">Accéder au planning des formations</a></p>
							<br>
							<span>2</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" style="background-image:url('img/formateur.png');"></div>
						<div class="ci-text">
							<h5>Formateur</h5>
							<p>
							<a href="./formateur/creation">Ajouter un formateur</a><br>
							<a href="rechercheFormateur.html">Rechercher un formateur par compétence</a><br>
							<a href="./formateur/">Accéder aux formateurs</a>
							</p>
							
							<span>3</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" style="background-image:url('img/stagiaire.png');"></div>
						<div class="ci-text">
							<h5>Stagiaire</h5>
							<p><a href="creationStagiaire.html">Ajouter un stagiaire</a><br>
							<a href="listStagiaires.html">Accéder à la liste des stagiaires</a></p>
							<br>
							<span>4</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" style="background-image:url('img/matiere.png');"></div>
						<div class="ci-text">
							<h5>Matière</h5>
							<p><a href="./matiere">Accéder à la liste des matières</a></p>
							<br>
							<span>5</span>
						</div>
					</div>
				</div>
				
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" style="background-image:url('img/salle.png');"></div>
						<div class="ci-text">
							<h5>Salle</h5>
							<p><a href="./salle">Accéder à la liste des salles</a>
							</p>
							<br>
							<span>6</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- categories section end -->
</body>
</html>