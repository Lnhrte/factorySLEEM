<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>

<title>La FACTORY SLEEM</title>
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
	
<!-- Hero section -->
	<section class="hero-section set-bg"  style="background-image:url('img/bg.jpg');">
	
		<div class="container">
		
			<div class="hero-text text-white">
				<h2>Bienvenue à la Factory-Sleem</h2>
				<p>Veuillez vous connecter</p>
			</div>

<div>${param.error}</div>
<div class="row">
				<div class="col-lg-10 offset-lg-1">
					<form action="" class="intro-newslatter" method="post">
						<input type="text" placeholder="Identifiant" name="username">
						<input type="password" class="last-s" placeholder="Mot de passe" name="password">
						<button class="site-btn" value="envoyer">Se connecter</button>
					</form>
				</div>
			</div>

</div>
	</section>
	<!-- Hero section end -->

	
	
</body>
</html>