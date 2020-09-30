package br.edu.dao;

import java.util.List;

import br.edu.domain.Produto;

public interface IProdutoDAO extends IAbstractDAO<Produto, Integer>{

	List<Produto> buscarTodos();

}