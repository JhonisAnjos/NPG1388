class Loja {
	constructor(nome, endereco) {
		this.nome =nome;
		this.endereco = endereco;
	}
}


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


function sendjsonarraytoservlet(){
	var selected = [];
	var rows = $('#tb').datagrid('getSelections');
	for(var i=0; i<rows.length; i++){

	selected.push(rows[i].fieldname1);
	selected.push(rows[i].fieldname2);
	selected.push(rows[i].fieldname3);
	selected.push(rows[i].fieldname4);
	selected.push(rows[i].fieldname5);
	

	 }
//	 $.post(‘/context/restmethod’, { “arrayparams”: JSON.stringify(selected)},
//
//	function(returnedData){
//	         console.log(returnedData);
//	}).fail(function(){
//	     console.log(“error”);
//	});

}

var selected = [];

//var table = $('#tb');
//
//table.find('tr').each(function(indice){
//    $(this).find('td').each(function(indice){
//        selected.push(this.innerHTML);
//    });
//});

function popularSelected() {
	
	var table = $('#tb > tbody');
	
	table.find('tr').each(function(indice){
		
		var loja = new Loja(this.cells[0].innerHTML, this.cells[1].innerHTML);
		
		
		selected.push(loja);
});
	
//	table.find('tr').each(function(indice){
//  $(this).find('td').each(function(indice){
//      selected.push(this.innerHTML);
//  });
//});
	
}

function submeter() {
	$.post("testarJson", { 'itens': JSON.stringify(selected)},

			function(returnedData){
			         console.log(returnedData);
			}).fail(function(){
			     console.log('error');
			});

			}
	
