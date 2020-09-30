package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.impl.AbstractDAO;
import br.edu.domain.Usuario;
import br.edu.factory.DAOFactory;


@WebServlet("/Cadastrar")
public class Cadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cadastrar() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario(nome, cpf, email, senha);
		AbstractDAO usuarioDAO;
		try {
			AbstractDAO<Usuario,Integer> dao=(AbstractDAO<Usuario,Integer>) new DAOFactory().createDAO(Usuario.class);
			dao.salvar(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		RequestDispatcher rd = request
//				.getRequestDispatcher("/publico/login.html");
//		rd.forward(request, response);
		
		((HttpServletResponse) response)
		.sendRedirect(((HttpServletRequest) request).getContextPath() + "/publico/login.jsp?hello=1");
		
	}

}
