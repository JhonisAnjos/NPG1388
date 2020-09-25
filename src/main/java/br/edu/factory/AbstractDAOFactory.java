package br.edu.factory;

import br.edu.dao.impl.AbstractDAO;

public abstract class AbstractDAOFactory {
	
	public abstract AbstractDAO createDAO(Class<?> type) throws Exception;
}
