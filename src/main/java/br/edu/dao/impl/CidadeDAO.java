package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.ICidadeDAO;
import br.edu.domain.Cidade;

public class CidadeDAO extends AbstractDAO<Cidade, Integer> implements ICidadeDAO{
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cidade> buscarTodos(){
		return entityManager.createQuery("SELECT c FROM " + Cidade.class.getSimpleName() + " c "
				+ "WHERE c.uf='BA'").getResultList();
	}
}
