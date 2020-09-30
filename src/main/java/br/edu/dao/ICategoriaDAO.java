package br.edu.dao;

import java.util.List;

import br.edu.domain.Categoria;

public interface ICategoriaDAO extends IAbstractDAO<Categoria, Integer> {

	List<Categoria> buscarTodos();

}