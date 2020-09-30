package br.edu.dao;

import javax.persistence.EntityManager;

import br.edu.domain.Usuario;

public interface IUsuarioDAO extends IAbstractDAO<Usuario, Integer> {

	void setEntityManager(EntityManager entityManager);

	

	Usuario getUsuario(String email, String senha);

}