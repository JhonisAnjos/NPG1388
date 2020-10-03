package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.IProdutoDAO;
import br.edu.dao.ITransportadoraDAO;
import br.edu.dao.ILojaDAO;
import br.edu.domain.Produto;
import br.edu.domain.Transportadora;
import br.edu.domain.Loja;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/registrarSaida" })
public class RegistrarSaida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrarSaida() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IProdutoDAO produtoDAO= DAOFactory.getProdutoDAO();
		List<Produto> produtos= produtoDAO.buscarTodos();
		
		ILojaDAO lojaDAO= DAOFactory.getLojaDAO();
		List<Loja> lojas= lojaDAO.buscarTodos();
		
		ITransportadoraDAO transportadoraDAO= DAOFactory.getTransportadoraDAO();
		List<Transportadora> transportadoras= transportadoraDAO.buscarTodos();


		request.setAttribute("transportadoras", transportadoras);
		request.setAttribute("produtos", produtos);
		request.setAttribute("lojas", lojas);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/registrarSaida.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
