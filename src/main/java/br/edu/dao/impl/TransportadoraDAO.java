package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.ITransportadoraDAO;
import br.edu.domain.Transportadora;

public class TransportadoraDAO extends AbstractDAO<Transportadora, Integer> implements ITransportadoraDAO  {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Transportadora> buscarTodos() {
		return entityManager.createQuery("SELECT t FROM " + Transportadora.class.getSimpleName() + " t").getResultList();
	}

}
