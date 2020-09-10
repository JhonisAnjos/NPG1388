package br.edu.dao;

import javax.persistence.EntityManager;

import br.edu.domain.Usuario;

public interface IUsuarioDAO {

	void setEntityManager(EntityManager entityManager);

	void salvar(Usuario usuario);

	Usuario getUsuario(String email, String senha);

}