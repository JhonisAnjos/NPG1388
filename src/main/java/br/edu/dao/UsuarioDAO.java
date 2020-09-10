package br.edu.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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

	@Override
	public Usuario getUsuario(String email, String senha) {
		String sql = "SELECT * FROM usuario u WHERE email=:email AND senha=:senha";
		
		Query query = this.entityManager.createNativeQuery(sql, Usuario.class);
		query.setParameter("email", email);
		query.setParameter("senha", senha);
		
		try {
			return (Usuario) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
	}
}
