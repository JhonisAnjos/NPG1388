$('.button-collapse').sideNav();

$('.collapsible').collapsible();

$('select').material_select();

function atualizarId(id) {
	this.id = id;
	$('#deleteModal').openModal();
}

function excluirFornecedor(){
	$.post("excluirFornecedor", {'id' : id}, function(resposta) {
		$("#fornecedor_" + id).hide();
	});
}