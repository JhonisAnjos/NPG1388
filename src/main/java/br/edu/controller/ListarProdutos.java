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
import br.edu.domain.Produto;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/listarProdutos" })
public class ListarProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarProdutos() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IProdutoDAO produtoDAO= DAOFactory.getProdutoDAO();
		List<Produto> produtos = produtoDAO.buscarTodos();

		request.setAttribute("produtos", produtos);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/listarProdutos.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
