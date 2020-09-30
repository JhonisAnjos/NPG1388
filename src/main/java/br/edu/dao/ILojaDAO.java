package br.edu.dao;

import java.util.List;

import br.edu.domain.Loja;

public interface ILojaDAO extends IAbstractDAO<Loja, Integer> {

	List<Loja> buscarTodos();

}