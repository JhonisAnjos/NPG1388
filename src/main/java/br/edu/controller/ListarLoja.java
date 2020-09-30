package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ILojaDAO;
import br.edu.domain.Loja;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/listarLojas" })
public class ListarLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarLoja() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ILojaDAO transportadoraDAO = DAOFactory.getLojaDAO();
		List<Loja> lojas = transportadoraDAO.buscarTodos();

		request.setAttribute("lojas", lojas);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/listarLojas.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
