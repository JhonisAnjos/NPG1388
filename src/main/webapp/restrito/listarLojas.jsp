<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="tituloDaPagina" value="LISTA DE LOJAS" scope="request" />
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
		<c:forEach var="loja" items="${lojas}" varStatus="id">
			<tr id="loja_${loja.id}">

				<td>${loja.nome}</td>
				<td>${loja.email}</td>
				<td>${loja.endereco}</td>
				<td>${loja.telefone}</td>
				<td><a href="#editModal" class="edit"
					data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" title="Edit">&#xE254;</i></a> <a
					href="#deleteModal" onclick="atualizarId(${loja.id})"
					class="delete" data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" data-id="1" title="Delete">&#xE872;</i></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<div id="deleteModal" class="modal">
    <div class="modal-content">
      <h4>Excluir Loja</h4>
      <p>Tem certeza de que deseja excluir este registro?</p>
			<p>Essa ação não pode ser desfeita.</p>
    </div>
    <div class="modal-footer">
      <a href="#!" onclick="excluirLoja()" class="modal-close waves-effect waves-green btn-flat">SIM</a>
      <a href="#!" class="modal-close waves-effect waves-green btn-flat">NÂO</a>
    </div>
  </div>
</main>
<c:import url="/restrito/template/rodape.jsp" />