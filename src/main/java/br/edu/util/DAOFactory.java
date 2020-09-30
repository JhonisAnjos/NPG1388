package br.edu.util;

import br.edu.dao.ICategoriaDAO;
import br.edu.dao.ICidadeDAO;
import br.edu.dao.IFornecedorDAO;
import br.edu.dao.ILojaDAO;
import br.edu.dao.IProdutoDAO;
import br.edu.dao.ITransportadoraDAO;
import br.edu.dao.IUsuarioDAO;
import br.edu.dao.impl.CategoriaDAO;
import br.edu.dao.impl.CidadeDAO;
import br.edu.dao.impl.FornecedorDAO;
import br.edu.dao.impl.LojaDAO;
import br.edu.dao.impl.ProdutoDAO;
import br.edu.dao.impl.TransportadoraDAO;
import br.edu.dao.impl.UsuarioDAO;

public class DAOFactory {

	private static JPAUtil jpaUtil = JPAUtil.getInstance();
	
	public static IUsuarioDAO getUsuarioDAO() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
	
	public static IFornecedorDAO getFornecedorDAO() {
		FornecedorDAO dao = new FornecedorDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
	
	public static ICidadeDAO getCidadeDAO() {
		CidadeDAO dao = new CidadeDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
	
	public static ITransportadoraDAO getTransportadoraDAO() {
		TransportadoraDAO dao = new TransportadoraDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
	public static ILojaDAO getLojaDAO() {
		LojaDAO dao = new LojaDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
	public static ICategoriaDAO getCategoriaDAO() {
		CategoriaDAO dao = new CategoriaDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
	
	public static IProdutoDAO getProdutoDAO() {
		ProdutoDAO dao = new ProdutoDAO();
		dao.setEntityManager(jpaUtil.getEntityManager());
		return dao;
	}
}
