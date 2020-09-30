package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ITransportadoraDAO;
import br.edu.domain.Transportadora;
import br.edu.util.DAOFactory;

@WebServlet(name = "excluirTransportadora", urlPatterns = { "/restrito/excluirTransportadora" })
public class ExcluirTransportadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirTransportadora() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		ITransportadoraDAO transportadoraDAO = DAOFactory.getTransportadoraDAO();
		transportadoraDAO.excluir(Transportadora.class, id);
		
		response.getWriter().write("teste");
		response.getWriter().close();
	}

}
