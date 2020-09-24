package br.edu.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class AbstractDAO<T, I> {

	protected EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void salvar(T object) {
		this.entityManager.persist(object);
	}

	public void atualizar(T object) {
		this.entityManager.merge(object);
	}

	public void excluir(Class<T> type, I id) {
		T object = this.entityManager.find(type, id);
		this.entityManager.remove(object);
	}

	public T buscarPorId(Class<T> type, I id) {
		return this.entityManager.find(type, id);
	}

}
