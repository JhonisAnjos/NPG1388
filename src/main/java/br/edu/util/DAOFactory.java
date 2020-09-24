package br.edu.util;

import br.edu.dao.IFornecedorDAO;
import br.edu.dao.IUsuarioDAO;
import br.edu.dao.impl.CidadeDAO;
import br.edu.dao.impl.FornecedorDAO;
import br.edu.dao.impl.ICidadeDAO;
import br.edu.dao.impl.UsuarioDAO;

public class DAOFactory {

	public static IUsuarioDAO getUsuarioDAO() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.setEntityManager(JPAUtil.getEntityManager());
		return dao;
	}
	
	public static IFornecedorDAO getFornecedorDAO() {
		FornecedorDAO dao = new FornecedorDAO();
		dao.setEntityManager(JPAUtil.getEntityManager());
		return dao;
	}
	
	public static ICidadeDAO getCidadeDAO() {
		CidadeDAO dao = new CidadeDAO();
		dao.setEntityManager(JPAUtil.getEntityManager());
		return dao;
	}
}
