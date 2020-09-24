package br.edu.dao;

import java.util.List;

import br.edu.domain.Fornecedor;

public interface IFornecedorDAO {

	public List<Fornecedor> buscarTodos();
	
	public void excluir(Class<Fornecedor> type, Integer id);
	
	public void salvar(Fornecedor object);

}