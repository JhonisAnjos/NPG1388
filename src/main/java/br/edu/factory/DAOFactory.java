package br.edu.factory;

import br.edu.dao.impl.AbstractDAO;
import br.edu.dao.impl.CidadeDAO;
import br.edu.dao.impl.UsuarioDAO;
import br.edu.domain.Cidade;
import br.edu.domain.Usuario;
import br.edu.util.JPAUtil;

public class DAOFactory extends AbstractDAOFactory{
	
	private JPAUtil jpaUtil = JPAUtil.getInstance(); 

	@SuppressWarnings("rawtypes")
	@Override
	public AbstractDAO createDAO(Class<?> type) throws Exception {
		if(type.equals(Usuario.class)) {
			AbstractDAO dao = new UsuarioDAO();
			dao.setEntityManager(jpaUtil.getEntityManager());
			return dao;
		}
		if(type.equals(Cidade.class)) {
			CidadeDAO dao = new CidadeDAO();
			dao.setEntityManager(jpaUtil.getEntityManager());
			return dao;
		}
		throw new Exception("Tipo de classe inválida");
	}

}
