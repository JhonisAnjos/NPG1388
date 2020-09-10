package br.edu.dao;

import javax.persistence.EntityManager;

import br.edu.domain.Usuario;

public class UsuarioDAO implements IUsuarioDAO {
	
	private EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

	@Override
	public void salvar(Usuario usuario) {
		this.entityManager.persist(usuario);
	}
	 
}
