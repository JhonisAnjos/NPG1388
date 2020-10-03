package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.IFornecedorDAO;
import br.edu.domain.Fornecedor;
import br.edu.util.DAOFactory;

@WebServlet(name = "excluirFornecedor", urlPatterns = { "/restrito/excluirFornecedor" })
public class ExcluirFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirFornecedor() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		IFornecedorDAO fornecedorDAO = DAOFactory.getFornecedorDAO();
		fornecedorDAO.excluir(Fornecedor.class, id);
		
		response.getWriter().write("teste");
		response.getWriter().close();
	}

}
