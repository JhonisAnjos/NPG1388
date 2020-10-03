<%@ page language="java" contentType="text/html; ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="tituloDaPagina" value="HISTÓRICO DE SAÍDA" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<table class="highlight" id="tb">
	<thead>
		<tr>
			<th>Loja</th>
			<th>Transportadora</th>
			<th>Total</th>
			<th>Detalhes</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="saida" items="${saidas}" varStatus="id">
			<tr id="saida_${saida.id}">

				<td>${saida.loja.nome}</td>
				<td>${saida.transportadora.nome}</td>
				<td>${saida.total}</td>
				<td><a href="#!" class="edit"
					data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" title="Detalhes">info</i></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</main>
<c:import url="/restrito/template/rodape.jsp" />