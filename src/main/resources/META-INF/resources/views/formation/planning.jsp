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
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Planning de la formation</title>
</head>
<body>
	<h2 align="center">Planning</h2>
	<table class="table">
		<tr>
			<th style="vertical-align: middle; text-align: center;">Mois</th>
			<th style="vertical-align: middle; text-align: center;">Date</th>
			<th style="vertical-align: middle; text-align: center;">Module</th>
			<th style="vertical-align: middle; text-align: center;">Formateurs</th>
			<th style="vertical-align: middle; text-align: center;">Titre</th>
		</tr>
		<c:forEach var="i" begin="0" end="${nbMoisFormation}" step="1">
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
		</c:forEach>
		<%-- 		<c:forEach var="i" begin="0" end="${dureeFormation}" step="1"> --%>
		<!-- 			<tr> -->
		<%-- 				<td style="vertical-align: middle; text-align: center;">${formation.dateDebut.getDay()+i}</td> --%>
		<!-- 			</tr> -->
		<%-- 		</c:forEach> --%>
		<!-- 		<tr> -->
		<%-- 			<td rowspan="${dureesModules.get(0)}" bgcolor="yellow" --%>
		<%-- 				style="vertical-align: middle; text-align: center;">${modules.get(0)}</td> --%>
		<%-- 			<td rowspan="${dureesModules.get(0)}" --%>
		<!-- 				style="vertical-align: middle; text-align: center;">Olivier</td> -->
		<%-- 			<td rowspan="${dureesModules.get(0)}" --%>
		<!-- 				style="vertical-align: middle; text-align: center;">Formateur -->
		<!-- 				JEE</td> -->
		<!-- 		</tr> -->


	</table>
</body>
</html>