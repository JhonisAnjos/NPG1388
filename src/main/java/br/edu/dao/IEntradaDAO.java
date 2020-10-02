package br.edu.dao;

import java.util.List;

import br.edu.domain.Entrada;

public interface IEntradaDAO extends IAbstractDAO<Entrada, Integer> {

	List<Entrada> buscarTodos();

}