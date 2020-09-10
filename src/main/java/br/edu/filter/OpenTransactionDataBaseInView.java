package br.edu.filter;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.edu.util.JPAUtil;

@WebFilter(urlPatterns="/*")
public class OpenTransactionDataBaseInView implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			if(!tx.isActive()){
				tx.begin();
			}
			// processa a requisição
			chain.doFilter(request, response);
			// faz commit
			tx.commit();
		} catch (Exception e) { // ou em caso de erro faz o rollback
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} 
	}

	@Override
	public void destroy() {
		JPAUtil.closeEntityManager();
	}
}
