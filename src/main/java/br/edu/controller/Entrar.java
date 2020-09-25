package br.edu.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.IUsuarioDAO;
import br.edu.domain.Usuario;
import br.edu.util.DAOFactory;

/**
 * Servlet implementation class Entrar
 */
@WebServlet(name = "entrar", urlPatterns = { "/entrar" })
public class Entrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Entrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		IUsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
		
		Optional<Usuario> usuario = Optional.ofNullable(usuarioDAO.getUsuario(email, senha));
		
		if(usuario.isPresent()){
			request.getSession().setAttribute("usuario", usuario.get());
			
//			RequestDispatcher rd = request
//					.getRequestDispatcher("/restrito/index.html");
//			rd.forward(request, response);
			
			((HttpServletResponse) response)
			.sendRedirect(((HttpServletRequest) request).getContextPath() + "/");
			
		}else{
//			RequestDispatcher rd = request
//					.getRequestDispatcher("login.html");
//			rd.forward(request, response);
			
			((HttpServletResponse) response)
			.sendRedirect(((HttpServletRequest) request).getContextPath() + "/publico/login.jsp?error=1");
		}
		
	}

}
