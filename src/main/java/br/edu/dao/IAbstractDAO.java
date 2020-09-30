package br.edu.dao;

import javax.persistence.EntityManager;

public interface IAbstractDAO<T, I> {

	void setEntityManager(EntityManager entityManager);

	void salvar(T object);

	void atualizar(T object);

	void excluir(Class<T> type, I id);

	T buscarPorId(Class<T> type, I id);


}