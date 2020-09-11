package br.edu.filter;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.domain.Usuario;

@WebFilter(urlPatterns="/restrito/*")
public class Security implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String url = ((HttpServletRequest) request).getRequestURI();
		
		if(url.equals(((HttpServletRequest) request).getContextPath()+"/publico/login.jsp")){
			chain.doFilter(request, response);
		}else{
			Optional<Usuario> usuario = Optional
					.ofNullable((Usuario) ((HttpServletRequest) request).getSession().getAttribute("usuario"));
			if (usuario.isPresent()) {
				chain.doFilter(request, response);
			} else {
				((HttpServletResponse) response)
				.sendRedirect(((HttpServletRequest) request).getContextPath() + "/publico/login.jsp");
			}
		}
		
	}

	@Override
	public void destroy() {

	}

}
