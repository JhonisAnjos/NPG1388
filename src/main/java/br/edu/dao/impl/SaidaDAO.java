package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.ISaidaDAO;
import br.edu.domain.Saida;

public class SaidaDAO extends AbstractDAO<Saida, Integer> implements ISaidaDAO  {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Saida> buscarTodos() {
		return entityManager.createQuery("SELECT t FROM " + Saida.class.getSimpleName() + " t").getResultList();
	}

}
