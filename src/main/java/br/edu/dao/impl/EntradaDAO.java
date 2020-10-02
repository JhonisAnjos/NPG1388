package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.IEntradaDAO;
import br.edu.domain.Entrada;

public class EntradaDAO extends AbstractDAO<Entrada, Integer> implements IEntradaDAO {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Entrada> buscarTodos() {
		return entityManager.createQuery("SELECT t FROM " + Entrada.class.getSimpleName() + " t").getResultList();
	}

}
