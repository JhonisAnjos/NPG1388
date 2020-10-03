<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="tituloDaPagina" value="LISTA DE TRANSPORTADORAS"
	scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<table class="highlight">
	<thead>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereço</th>
			<th>Telefone</th>
			<th>Ações</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="transportadora" items="${transportadoras}"
			varStatus="id">
			<tr id="transportadora_${transportadora.id}">

				<td>${transportadora.nome}</td>
				<td>${transportadora.email}</td>
				<td>${transportadora.endereco}</td>
				<td>${transportadora.telefone}</td>
				<td><a href="#editModal" class="edit" data-toggle="modal"><i
						class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
					<a href="#deleteModal" onclick="atualizarId(${transportadora.id})"
					class="delete" data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" data-id="1" title="Delete">&#xE872;</i></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<div id="deleteModal" class="modal">
	<div class="modal-content">
		<h4>Excluir Transportadora</h4>
		<p>Tem certeza de que deseja excluir este registro?</p>
		<p>Essa ação não pode ser desfeita.</p>
	</div>
	<div class="modal-footer">
		<a href="#!" onclick="excluirTransportadora()"
			class="modal-close waves-effect waves-green btn-flat">SIM</a> <a
			href="#!" class="modal-close waves-effect waves-green btn-flat">NÂO</a>
	</div>
</div>
</main>
<c:import url="/restrito/template/rodape.jsp" />