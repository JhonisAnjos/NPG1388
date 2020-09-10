package br.edu.util;

import br.edu.dao.IUsuarioDAO;
import br.edu.dao.UsuarioDAO;

public class DAOFactory {

	public static IUsuarioDAO getUsuarioDAO() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.setEntityManager(JPAUtil.getEntityManager());
		return dao;
	}
}
