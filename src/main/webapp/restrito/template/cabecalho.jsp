<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/font/material-design-icons/Material-Design-Icons.woff" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}\resource\css\template.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
<script src="${pageContext.request.contextPath}\resource\js\template.js"></script>

</head>

<body>
	<ul id="slide-out" class="side-nav fixed z-depth-2">
		<li class="center no-padding">
			<div class="indigo darken-2 white-text" style="height: 180px;">
				<div class="row">
					<img style="margin-top: 10%;" width="100" height="100"
						src="${pageContext.request.contextPath}\resource\img\img_avatar.jpeg"
						class="circle responsive-img" />

					<p style="margin-top: 0%;">${sessionScope.usuario.nome}</p>
				</div>
			</div>
		</li>

		<li id="dash_dashboard"><a class="waves-effect" href="#!"><b>Página Principal</b></a></li>

		<ul class="collapsible" data-collapsible="accordion">
			<li id="dash_users">
				<div id="dash_users_header" class="collapsible-header waves-effect">
					<b>Fornecedores</b>
				</div>
				<div id="dash_users_body" class="collapsible-body">
					<ul>
						<li id="users_seller"><a class="waves-effect"
							style="text-decoration: none;" href="cadastrarFornecedor">Cadastrar</a></li>

						<li id="users_customer"><a class="waves-effect"
							style="text-decoration: none;" href="listarFornecedores">Listar</a></li>
					</ul>
				</div>
			</li>

			<li id="dash_products">
				<div id="dash_products_header"
					class="collapsible-header waves-effect">
					<b>Transportadoras</b>
				</div>
				<div id="dash_products_body" class="collapsible-body">
					<ul>
						<li id="products_product"><a class="waves-effect"
							style="text-decoration: none;" href="#!">Cadastrar</a> <a
							class="waves-effect" style="text-decoration: none;" href="#!">Listar</a>
						</li>
					</ul>
				</div>
			</li>

			<li id="dash_categories">
				<div id="dash_categories_header"
					class="collapsible-header waves-effect">
					<b>Lojas</b>
				</div>
				<div id="dash_categories_body" class="collapsible-body">
					<ul>
						<li id="categories_category"><a class="waves-effect"
							style="text-decoration: none;" href="#!">Cadastrar</a></li>

						<li id="categories_sub_category"><a class="waves-effect"
							style="text-decoration: none;" href="#!">Listar</a></li>
					</ul>
				</div>
			</li>

			<li id="dash_brands">
				<div id="dash_brands_header" class="collapsible-header waves-effect">
					<b>Produtos</b>
				</div>
				<div id="dash_brands_body" class="collapsible-body">
					<ul>
						<li id="brands_brand"><a class="waves-effect"
							style="text-decoration: none;" href="#!">Cadastrar</a></li>

						<li id="brands_sub_brand"><a class="waves-effect"
							style="text-decoration: none;" href="#!">Listar</a></li>
					</ul>
				</div>
			</li>
		</ul>
	</ul>

	<header>
		<ul class="dropdown-content" id="user_dropdown">
			<li><a class="indigo-text"
				href="${pageContext.request.contextPath}\sair">Sair</a></li>
		</ul>

		<nav class="indigo" role="navigation">
			<div class="nav-wrapper">
				<a data-activates="slide-out" class="button-collapse show-on-"
					href="#!"><img style="margin-top: 17px; margin-left: 5px;"
					src="https://res.cloudinary.com/dacg0wegv/image/upload/t_media_lib_thumb/v1463989873/smaller-main-logo_3_bm40iv.gif" /></a>

				<ul class="right hide-on-med-and-down">
					<li><a class='right dropdown-button' href=''
						data-activates='user_dropdown'><i class=' material-icons'>power_settings_new</i></a>
					</li>
				</ul>

				<a href="#" data-activates="slide-out" class="button-collapse"><i
					class="mdi-navigation-menu"></i></a>
			</div>
		</nav>

		<nav>
			<div class="nav-wrapper indigo darken-2" style="text-align: center;">
				<a style="margin-left: 20px;font-size: 25px;"  href="#!">${tituloDaPagina}</a>
			</div>
		</nav>
	</header>