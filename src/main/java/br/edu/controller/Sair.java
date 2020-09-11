package br.edu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sair
 */
@WebServlet(name = "sair", urlPatterns = { "/sair" })
public class Sair extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Sair() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Invalida sessão e redireciona para login
        request.getSession().invalidate();
        
        ((HttpServletResponse) response)
		.sendRedirect(((HttpServletRequest) request).getContextPath() + "/publico/login.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
