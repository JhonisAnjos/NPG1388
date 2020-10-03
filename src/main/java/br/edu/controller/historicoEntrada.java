package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.IEntradaDAO;
import br.edu.domain.Entrada;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/historicoEntrada" })
public class historicoEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public historicoEntrada() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IEntradaDAO entradaDAO= DAOFactory.getEntradaDAO();
		List<Entrada> entradas = entradaDAO.buscarTodos();

		request.setAttribute("entradas", entradas);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/historicoEntrada.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
