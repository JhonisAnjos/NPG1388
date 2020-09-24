package br.edu.dao.impl;

import javax.persistence.Query;

import br.edu.dao.IUsuarioDAO;
import br.edu.domain.Usuario;

public class UsuarioDAO extends AbstractDAO<Usuario, Integer> implements IUsuarioDAO {

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
