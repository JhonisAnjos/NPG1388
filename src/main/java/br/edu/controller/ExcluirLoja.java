package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ILojaDAO;
import br.edu.domain.Loja;
import br.edu.util.DAOFactory;

@WebServlet(name = "excluirLoja", urlPatterns = { "/restrito/excluirLoja" })
public class ExcluirLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirLoja() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		ILojaDAO lojaDAO = DAOFactory.getLojaDAO();
		lojaDAO.excluir(Loja.class, id);
		
		response.getWriter().write("teste");
		response.getWriter().close();
	}

}
