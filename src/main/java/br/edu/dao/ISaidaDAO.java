package br.edu.dao;

import java.util.List;

import br.edu.domain.Saida;

public interface ISaidaDAO  extends IAbstractDAO<Saida, Integer>{

	List<Saida> buscarTodos();

}