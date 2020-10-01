<%@ page language="java" contentType="text/html; ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="tituloDaPagina" value="LISTA DE PRODUTOS" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<table class="highlight" id="tb">
	<thead>
		<tr>
			<th>Nome</th>
			<th>Categoria</th>
			<th>Fornecedor</th>
			<th>Peso</th>
			<th>Ações</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="produto" items="${produtos}" varStatus="id">
			<tr id="produto_${produto.id}">

				<td>${produto.nome}</td>
				<td>${produto.categoria.nome}</td>
				<td>${produto.fornecedor.nome}</td>
				<td>${produto.peso}</td>
				<td><a href="#editModal" class="edit"
					data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" title="Edit">&#xE254;</i></a> <a
					href="#deleteModal" onclick="atualizarId(${produto.id})"
					class="delete" data-toggle="modal"><i class="material-icons"
						data-toggle="tooltip" data-id="1" title="Delete">&#xE872;</i></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<div id="deleteModal" class="modal">
    <div class="modal-content">
      <h4>Excluir produto</h4>
      <p>Tem certeza de que deseja excluir este registro?</p>
			<p>Essa ação não pode ser desfeita.</p>
    </div>
    <div class="modal-footer">
      <a href="#!" onclick="excluirProduto()" class="modal-close waves-effect waves-green btn-flat">SIM</a>
      <a href="#!" class="modal-close waves-effect waves-green btn-flat">NÂO</a>
    </div>
  </div>
</main>
<c:import url="/restrito/template/rodape.jsp" />