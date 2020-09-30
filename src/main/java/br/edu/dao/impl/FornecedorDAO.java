package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.IFornecedorDAO;
import br.edu.domain.Fornecedor;

public class FornecedorDAO extends AbstractDAO<Fornecedor, Integer> implements IFornecedorDAO {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Fornecedor> buscarTodos() {
		return entityManager.createQuery("SELECT t FROM " + Fornecedor.class.getSimpleName() + " t").getResultList();
	}

}
