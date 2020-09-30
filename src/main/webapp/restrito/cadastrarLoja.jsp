<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="tituloDaPagina" value="CADASTRAR LOJA" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<form class="col s12" action="salvarLoja" method="post" >
	<div class="row">
	</div>
	<div class="row">
		<div class="row">
			<div class="input-field col s4">
				<input id="last_name" name="nome" type="text" class="validate"> <label
					for="last_name">Nome</label>
			</div>
			<div class="input-field col s4">
				<input id="last_name" name="telefone" type="text" class="validate"> <label
					for="last_name">Telefone</label>
			</div>
			<div class="input-field col s4">
				<input id="last_name" name="email" type="text" class="validate"> <label
					for="last_name">Email</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s4">
				<input id="last_name" name="inscricaoEstadual" type="text" class="validate"> <label
					for="last_name">Inscrição Estadual</label>
			</div>
			<div class="input-field col s4">
				<input id="last_name" required="required" name="cnpj" type="text" class="validate"> <label
					for="last_name">CNPJ</label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="row">
			<div class="input-field col s4">
				<select name="cidadeId">
					<option value="" disabled selected>Selecione</option>
					<c:forEach var="cidade" items="${cidades}" varStatus="id">
						<option value="${cidade.id}">${cidade.nome}</option>
					</c:forEach>
				</select> <label>Cidade</label>
			</div>
			<div class="input-field col s6">
				<input id="last_name" name="logradouro" type="text" class="validate"> <label
					for="last_name">Logradouro</label>
			</div>
			<div class="input-field col s2">
				<input id="last_name" name="numero" type="text" class="validate"> <label
					for="last_name">Número</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s4">
				<input id="last_name" name="bairro" type="text" class="validate"> <label
					for="last_name">Bairro</label>
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