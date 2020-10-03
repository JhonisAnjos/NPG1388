package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ISaidaDAO;
import br.edu.domain.Saida;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/historicoSaida" })
public class historicoSaida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public historicoSaida() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ISaidaDAO saidaDAO= DAOFactory.getSaidaDAO();
		List<Saida> saidas = saidaDAO.buscarTodos();

		request.setAttribute("saidas", saidas);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/historicoSaida.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
