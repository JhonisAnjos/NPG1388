<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="tituloDaPagina" value="PÁGINA PRINCIPAL" scope="request" />
<c:import url="/restrito/template/cabecalho.jsp" />
<main>
<div class="row">
		<div class="col s6">
			<div style="padding: 35px;" align="center" class="card">
				<div class="row">
					<div class="left card-title">
						<b>Entrada</b>
					</div>
				</div>

				<div class="row">
					<a href="${pageContext.request.contextPath}\restrito\registrarEntrada">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">note_add</i>
							<span class="indigo-text text-lighten-1"><h5>Registrar</h5></span>
						</div>
					</a>
					<div class="col s1">&nbsp;</div>
					<div class="col s1">&nbsp;</div>

					<a href="${pageContext.request.contextPath}\restrito\historicoEntrada">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">history</i>
							<span class="indigo-text text-lighten-1"><h5>Histórico</h5></span>
						</div>
					</a>
				</div>
			</div>
		</div>
		<div class="col s6">
			<div style="padding: 35px;" align="center" class="card">
				<div class="row">
					<div class="left card-title">
						<b>Saída</b>
					</div>
				</div>

				<div class="row">
					<a href="${pageContext.request.contextPath}\restrito\registrarSaida">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">note_add</i>
							<span class="indigo-text text-lighten-1"><h5>Registrar</h5></span>
						</div>
					</a>
					<div class="col s1">&nbsp;</div>
					<div class="col s1">&nbsp;</div>

					<a href="${pageContext.request.contextPath}\restrito\historicoSaida">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">history</i>
							<span class="indigo-text text-lighten-1"><h5>Histórico</h5></span>
						</div>
					</a>
				</div>
			</div>
		</div>

	
	</div>

	<div class="row">
		<div class="col s6">
			<div style="padding: 35px;" align="center" class="card">
				<div class="row">
					<div class="left card-title">
						<b>Produtos</b>
					</div>
				</div>

				<div class="row">
					<a href="${pageContext.request.contextPath}\restrito\cadastrarProduto">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">note_add</i>
							<span class="indigo-text text-lighten-1"><h5>Cadastrar</h5></span>
						</div>
					</a>

					<div class="col s1">&nbsp;</div>
					<div class="col s1">&nbsp;</div>

					<a href="${pageContext.request.contextPath}\restrito\listarProdutos">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">list</i>
							<span class="indigo-text text-lighten-1"><h5>Listar</h5></span>
						</div>
					</a>
				</div>
			</div>
		</div>

		<div class="col s6">
			<div style="padding: 35px;" align="center" class="card">
				<div class="row">
					<div class="left card-title">
						<b>Usuários</b>
					</div>
				</div>
				<div class="row">
					<a href="#!">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">person_add_alt_1</i>
							<span class="indigo-text text-lighten-1"><h5>Cadastrar</h5></span>
						</div>
					</a>
					<div class="col s1">&nbsp;</div>
					<div class="col s1">&nbsp;</div>

					<a href="#!">
						<div style="padding: 30px;"
							class="grey lighten-3 col s5 waves-effect">
							<i class="indigo-text text-lighten-1 large material-icons">list</i>
							<span class="truncate indigo-text text-lighten-1"><h5>Listar</h5></span>
						</div>
					</a>
				</div>
			</div>
		</div>
	</div>

	<div class="fixed-action-btn click-to-toggle"
		style="bottom: 45px; right: 24px;">
		<a class="btn-floating btn-large pink waves-effect waves-light"> <i
			class="large material-icons">add</i>
		</a>

		<ul>
			<li><a class="btn-floating red"><i class="material-icons">note_add</i></a>
				<a href="" class="btn-floating fab-tip">Add a note</a></li>

			<li><a class="btn-floating yellow darken-1"><i
					class="material-icons">add_a_photo</i></a> <a href=""
				class="btn-floating fab-tip">Add a photo</a></li>

			<li><a class="btn-floating green"><i class="material-icons">alarm_add</i></a>
				<a href="" class="btn-floating fab-tip">Add an alarm</a></li>

			<li><a class="btn-floating blue"><i class="material-icons">vpn_key</i></a>
				<a href="" class="btn-floating fab-tip">Add a master password</a></li>
		</ul>
	</div>
</main>
<c:import url="/restrito/template/rodape.jsp" />