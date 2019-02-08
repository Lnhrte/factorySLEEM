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
	<div class="page-info-section set-bg" style="background-image:url('../img/page-bg/1.jpg');">
		<div class="container">
			<div class="site-breadcrumb">
				<a href="../HomeGestionnaire">Accueil</a>
				<span>Planning</span>
			</div>
			<div align="right"><button class="site-btn">G�n�rer un PDF</button></div>
			<div class="section-title text-white">
					<h2>Exemple de Planning </h2><br>
					
			
			
				</div>
				
		</div>
	</div>


	<table class="table">
		<tr>
			<th style="vertical-align: middle; text-align: center;">Mois</th>
			<th colspan="2" style="vertical-align: middle; text-align: center;">Date</th>
			<th style="vertical-align: middle; text-align: center;">Module</th>
			<th style="vertical-align: middle; text-align: center;">Formateurs</th>
			<th style="vertical-align: middle; text-align: center;">Titre</th>

		</tr>
		<tr>
			<td rowspan="14" style="vertical-align: middle; text-align: center;">Janvier</td>
			<td>jeu</td>
			<td>18</td>
			<td rowspan="2" bgcolor="yellow"
				style="vertical-align: middle; text-align: center;">UML</td>
			<td rowspan="14" style="vertical-align: middle; text-align: center;">UML</td>
			<td rowspan="14" style="vertical-align: middle; text-align: center;">Formateur
				JEE</td>
		</tr>
		<tr>
			<td>ven</td>
			<td>19</td>
		</tr>
		<tr>
			<td bgcolor="grey">sam</td>
			<td bgcolor="grey">20</td>
			<td bgcolor="grey"></td>
		</tr>
		<tr>
			<td bgcolor="grey">dim</td>
			<td bgcolor="grey">21</td>
			<td bgcolor="grey"></td>
		</tr>
		<tr>
			<td>lun</td>
			<td>22</td>
			<td rowspan="2" bgcolor="green"
				style="vertical-align: middle; text-align: center;">Algo Objet</td>
		</tr>
		<tr>
			<td>mar</td>
			<td>23</td>
		</tr>
		<tr>
			<td>mer</td>
			<td>24</td>
			<td rowspan="3" bgcolor="DodgerBlue"
				style="vertical-align: middle; text-align: center;">Init Prog
				Java</td>
		</tr>
		<tr>
			<td>jeu</td>
			<td>25</td>
		</tr>
		<tr>
			<td>ven</td>
			<td>26</td>
		</tr>
		<tr>
			<td bgcolor="grey">sam</td>
			<td bgcolor="grey">27</td>
			<td bgcolor="grey"></td>
		</tr>
		<tr>
			<td bgcolor="grey">dim</td>
			<td bgcolor="grey">28</td>
			<td bgcolor="grey"></td>
		</tr>
		<tr>
			<td>lun</td>
			<td>29</td>
			<td rowspan="3" bgcolor="blue"
				style="vertical-align: middle; text-align: center;">BDD SQL</td>
		</tr>
		<tr>
			<td>mar</td>
			<td>30</td>
		</tr>
		<tr>
			<td>mer</td>
			<td>31</td>
		</tr>


	</table>
</body>
</html>