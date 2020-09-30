package br.edu.dao.impl;

import java.util.List;

import br.edu.dao.ICategoriaDAO;
import br.edu.domain.Categoria;

public class CategoriaDAO extends AbstractDAO<Categoria, Integer> implements ICategoriaDAO {
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> buscarTodos(){
		return entityManager.createQuery("SELECT c FROM " + Categoria.class.getSimpleName() + " c "
				+ "WHERE c.uf='BA'").getResultList();
	}
}
