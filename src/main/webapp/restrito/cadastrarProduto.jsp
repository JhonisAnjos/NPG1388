<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="tituloDaPagina" value="CADASTRAR PRODUTO" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<form class="col s12" action="salvarProduto" method="post">
	<div class="row"></div>
	<div class="row">
		<div class="row">
			<div class="input-field col s5">
				<select name="fornecedorId" required="required">
					<option value="" disabled selected>Selecione</option>
					<c:forEach var="fornecedor" items="${fornecedores}" varStatus="id">
						<option value="${fornecedor.id}">${fornecedor.nome}</option>
					</c:forEach>
				</select> <label>Fornecedor</label>
			</div>
			<div class="input-field col s5">
				<select name="categoriaId" required="required">
					<option value="" disabled selected>Selecione</option>
					<c:forEach var="categoria" items="${categorias}" varStatus="id">
						<option value="${categoria.id}">${categoria.nome}</option>
					</c:forEach>
				</select> <label>Categoria</label>
			</div>
			<div class="input-field col s2">
				<input id="last_name" name="peso" type="number" class="validate">
				<label for="last_name">Peso</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<input id="last_name" name="nome" type="text" class="validate"
					required="required"> <label for="last_name">Nome</label>
			</div>
			<div class="input-field col s3">
				<select name="controlado" required="required">
					<option value="" disabled selected>Selecione</option>
					<option value="true" >Sim</option>
					<option value="false" >Não</option>
				</select> <label>Controlado</label>
			</div>
			<div class="input-field col s3">
				<input id="last_name" name="quantidadeMinima" type="number"
					class="validate"> <label for="last_name">Quant.
					mínima</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s4">
				<button class="btn" type="submit">SALVAR</button>
			</div>
		</div>
	</div>
</form>
</main>
<c:import url="/restrito/template/rodape.jsp" />