<%@ page language="java" contentType="text/html; ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="tituloDaPagina" value="HISTÓRICO DE ENTRADA" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<table class="highlight" id="tb">
	<thead>
		<tr>
			<th>Tranpsortadora</th>
			<th>Data do pedido</th>
			<th>Data da entrada</th>
			<th>Núm. nota fiscal</th>
			<th>Total</th>
			<th>Detalhes</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="entrada" items="${entradas}" varStatus="id">
			<tr id="entrada_${entrada.id}">
				
				<td>${entrada.transportadora.nome}</td>
				<td>${entrada.dataPedido}</td>
				<td>${entrada.dataEntrada}</td>
				<td>${entrada.numeroNotaFiscal}</td>
				<td>${entrada.total}</td>
				<td><a href="#!" class="edit"
					data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" title="Detalhes">info</i></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</main>
<c:import url="/restrito/template/rodape.jsp" />