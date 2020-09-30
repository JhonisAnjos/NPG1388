
function atualizarId(id) {
	this.id = id;
	$('#deleteModal').openModal();
}

function excluirTransportadora(){
	$.post("excluirTransportadora", {'id' : id}, function(resposta) {
		$("#transportadora_" + id).hide();
	});
}

function excluirLoja(){
	$.post("excluirLoja", {'id' : id}, function(resposta) {
		$("#loja_" + id).hide();
	});
}

function excluirProduto(){
	$.post("excluirProduto", {'id' : id}, function(resposta) {
		$("#produto_" + id).hide();
	});
}

function excluirFornecedor(){
	$.post("excluirFornecedor", {'id' : id}, function(resposta) {
		$("#fornecedor_" + id).hide();
	});
}

$(document).ready(function() {
	$('select').material_select();
	$('.button-collapse').sideNav();
	$('.collapsible').collapsible();
	
});