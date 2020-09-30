package br.edu.dao;

import java.util.List;

import br.edu.domain.Fornecedor;

public interface IFornecedorDAO extends IAbstractDAO<Fornecedor, Integer>{
	
	public void excluir(Class<Fornecedor> type, Integer id);
	
	public void salvar(Fornecedor object);

	public List<Fornecedor> buscarTodos();

}