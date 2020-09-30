package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.IProdutoDAO;
import br.edu.domain.Produto;

public class ProdutoDAO extends AbstractDAO<Produto, Integer> implements IProdutoDAO {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Produto> buscarTodos() {
		return entityManager.createQuery("SELECT t FROM " + Produto.class.getSimpleName() + " t").getResultList();
	}

}
