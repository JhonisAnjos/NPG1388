<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="tituloDaPagina" value="REGISTRAR SAÍDA" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<form class="col s12" action="salvarSaida" method="post" onsubmit="converterTabelaJson()">
	<div class="row">
		<c:if test="${!empty param.error}">
			<div class="alert alert-danger" role="alert">Credenciais
				inválidas!</div>
		</c:if>
	</div>
	<div class="row">
		<div class="row">
			<div class="input-field col s6">
				<select name="lojaId" required="required">
					<option value="" disabled selected>Selecione</option>
					<c:forEach var="loja" items="${lojas}" varStatus="id">
						<option value="${loja.id}">${loja.nome}</option>
					</c:forEach>
				</select> <label>Loja</label>
			</div>
			<div class="input-field col s6">
				<select name="transportadoraId" required="required">
					<option value="" disabled selected>Selecione</option>
					<c:forEach var="transportadora" items="${transportadoras}" varStatus="id">
						<option value="${transportadora.id}">${transportadora.nome}</option>
					</c:forEach>
				</select> <label>Transportadora</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s3">
				<input id="frete" name="frete" type="number" class="validate">
				<label for="frete">Frete</label>
			</div>
			<div class="input-field col s3">
				<input id="imposto" name="imposto" type="number" class="validate">
				<label for="imposto">Imposto</label>
			</div>
			<div class="input-field col s3">
				<input id="total" name="total" type="number" class="validate">
				<label for="total">Total</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s2">
				<button class="btn" type="submit">SALVAR</button>
			</div>
			<div class="input-field col s4">
				<a class="waves-effect waves-light btn blue" onclick="adicionarProduto()"><i class="material-icons left">add</i>Adicionar produto</a>
			</div>
		</div>
	</div>
	<input type="hidden" name="itens" id="itens">
	<table class="highlight" id="tb">
		<thead>
			<tr>
				<th>COD</th>
				<th>Produto</th>
				<th>Lote</th>
				<th>Quantidade</th>
				<th>Valor</th>
				<th>Remover</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table>
</form>
	<div id="addModal" class="modal">
		<div class="modal-content">
			<h4>Adicionar produto</h4>
			<form id="formDialog">
			<div class="row">
				<div class="input-field col s6">
					<select id="produtoId" required="required">
						<option value="" disabled selected>Selecione</option>
						<c:forEach var="produto" items="${produtos}" varStatus="id">
							<option value="${produto.id}">${produto.nome}</option>
						</c:forEach>
					</select> <label>Produto</label>
				</div>
				<div class="input-field col s3">
					<input id="lote" name="lote" type="number" class="validate">
					<label for="lote">Lote</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s3">
					<input id="quantidade" name="quantidade" type="number"
						class="validate"> <label for="valor">Quantidade</label>
				</div>
				<div class="input-field col s3">
					<input id="valor" name="valor" type="number" class="validate">
					<label for="valor">Valor</label>
				</div>
			</div>
			</form>
		</div>
		<div class="modal-footer">
			<a href="#!" onclick="inserirProduto()"
				class="modal-close waves-effect waves-green btn-flat">ADICIONAR</a> <a
				href="#!" class="modal-close waves-effect waves-green btn-flat">CANCELAR</a>
		</div>
	</div>
</main>
<c:import url="/restrito/template/rodape.jsp" />