package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ITransportadoraDAO;
import br.edu.domain.Transportadora;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/listarTransportadoras" })
public class ListarTransportadoras extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarTransportadoras() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ITransportadoraDAO transportadoraDAO = DAOFactory.getTransportadoraDAO();
		List<Transportadora> transportadoras = transportadoraDAO.buscarTodos();

		request.setAttribute("transportadoras", transportadoras);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/listarTransportadoras.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
