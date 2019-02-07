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
	<div align="center">
		<h2>Planning duree${dureeFormation } module 1 ${modules[0]}</h2>
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