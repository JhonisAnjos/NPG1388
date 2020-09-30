package br.edu.dao;

import java.util.List;

import br.edu.domain.Transportadora;

public interface ITransportadoraDAO extends IAbstractDAO<Transportadora, Integer> {

	List<Transportadora> buscarTodos();

}