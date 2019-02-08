<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Inscription du formateur</title>
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
<!-- signup section -->
	<section class="signup-section spad">
		<div class="signup-bg set-bg" style="background-image:url('../img/signup-bg.jpg');"></div>
		
		<div class="container-fluid">
		
			<div class="row">
				<div class="col-lg-6">
					<div class="signup-warp">
			
						<div class="section-title text-white text-left">
							<h2>Créer un compte formateur</h2>
							<h5>Renseigner les champs suivants</h5>
						</div>

	<div class="container">
		<fieldset>
			<legend>Edition d'une Personne</legend>

			<form:form class="signup-form" action="save" method="get"
				modelAttribute="formateur">
				<form:hidden path="version" />
<%-- 				<form:hidden path="type" value="formateur"/> --%>
				<div class="form-group">
					<form:label path="id">Id</form:label>
					<form:input path="id" readonly="true" cssClass="form-control" />
				</div>
				<div class="form-group">
					<form:label path="nom">Nom</form:label>
					<form:input type="text" path="nom"  required="true" />
				</div>
				<div class="form-group">
					<form:label path="prenom">Prenom</form:label>
					<form:input path="prenom"  required="true" />
				</div>
				<div class="form-group">
					<form:label path="adresse">Adresse</form:label>
					<form:input path="adresse.numero"  required="true" value="numero" onfocus="this.value=''" />
					<form:input path="adresse.rue"  required="true" value="rue" onfocus="this.value=''" />
					<form:input path="adresse.codePostal" required="true" value="code postal" onfocus="this.value=''" />
					<form:input path="adresse.ville" required="true" value="ville" onfocus="this.value=''" />
					<form:input path="adresse.pays" required="true" value="pays" onfocus="this.value=''" />
				</div>
				<div class="form-group">
					<form:label path="coordonnees">Coordonnees</form:label>
					<form:input path="coordonnees.telephone" 
						required="true" value="telephone" onfocus="this.value=''" />
						<form:input path="coordonnees.email" 
						required="true" value="email" onfocus="this.value=''" />
				</div>
					<div class="form-group">
					<form:label path="indisponibleDebut">Indisponnible du</form:label>
					<form:input type="date" path="indisponibleDebut"  required="true" />
				</div>
				<div class="form-group">
					<form:label path="indisponibleFin">au</form:label>
					<form:input type="date" path="indisponibleFin"  required="true" />
				</div>
<!-- 				<div class="form-group"> -->
<%-- 					<form:label path="matieres">Matieres</form:label> --%>
<%-- 					<form:select path="matieres" cssClass="form-control" required="true"> --%>
<%-- 					<ul>${matiere.id}</ul> --%>
<%-- 					</form:select> --%>
<%-- 					<form:input path="matieres" cssClass="form-control" required="true" /> --%>
<!-- 				</div> -->
				<div>
					<button class="site-btn" type="submit">Enregistrer</button>
					<a class="b-btn" href="../HomeGestionnaire">Annuler</a>
				</div>
			</form:form>
		</fieldset>

	</div>
	</div>
				</div>
			</div>
		</div>
	</section>
	<!-- signup section end -->
</body>
</html>