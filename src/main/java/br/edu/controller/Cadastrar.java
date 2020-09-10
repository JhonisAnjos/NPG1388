package br.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.IUsuarioDAO;
import br.edu.domain.Usuario;
import br.edu.util.DAOFactory;


@WebServlet("/Cadastrar")
public class Cadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cadastrar() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario(nome, cpf, email, senha);
		IUsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/index.html");
		rd.forward(request, response);
		
	}

}
