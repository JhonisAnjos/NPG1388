package br.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ICidadeDAO;
import br.edu.domain.Cidade;
import br.edu.util.DAOFactory;


@WebServlet( urlPatterns = { "/restrito/cadastrarLoja" })
public class CadastrarLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastrarLoja() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ICidadeDAO cidadeDAO = DAOFactory.getCidadeDAO();
		List<Cidade> cidades= cidadeDAO.buscarTodos();

		request.setAttribute("cidades", cidades);

		 RequestDispatcher rd = request
		 .getRequestDispatcher("/restrito/cadastrarLoja.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
