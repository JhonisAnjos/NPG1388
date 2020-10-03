package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.IFornecedorDAO;
import br.edu.domain.Fornecedor;
import br.edu.util.DAOFactory;


@WebServlet(name = "listarFornecedores", urlPatterns = { "/restrito/listarFornecedores" })
public class ListarFornecedores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarFornecedores() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IFornecedorDAO fornecedorDAO = DAOFactory.getFornecedorDAO();
		List<Fornecedor> fornecedores = fornecedorDAO.buscarTodos();

		request.setAttribute("fornecedores", fornecedores);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/listaDeFornecedores.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
