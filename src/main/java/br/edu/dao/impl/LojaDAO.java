package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.ILojaDAO;
import br.edu.domain.Loja;

public class LojaDAO extends AbstractDAO<Loja, Integer> implements ILojaDAO  {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Loja> buscarTodos() {
		return entityManager.createQuery("SELECT t FROM " + Loja.class.getSimpleName() + " t").getResultList();
	}

}
