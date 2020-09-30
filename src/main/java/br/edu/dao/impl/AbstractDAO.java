package br.edu.dao.impl;

import javax.persistence.EntityManager;

import br.edu.dao.IAbstractDAO;

public abstract class AbstractDAO<T, I> implements IAbstractDAO<T, I> {

	protected EntityManager entityManager;
	
	protected Class<T> persistenceClass;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void salvar(T object) {
		this.entityManager.persist(object);
	}

	@Override
	public void atualizar(T object) {
		this.entityManager.merge(object);
	}

	@Override
	public void excluir(Class<T> type, I id) {
		T object = this.entityManager.find(type, id);
		this.entityManager.remove(object);
	}

	@Override
	public T buscarPorId(Class<T> type, I id) {
		return this.entityManager.find(type, id);
	}

}
