package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ICategoriaDAO;
import br.edu.dao.IFornecedorDAO;
import br.edu.dao.IProdutoDAO;
import br.edu.domain.Categoria;
import br.edu.domain.Fornecedor;
import br.edu.domain.Produto;
import br.edu.util.DAOFactory;


@WebServlet("/restrito/salvarProduto")
public class SalvarProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SalvarProduto() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Boolean controlado = Boolean.parseBoolean(request.getParameter("controlado"));
		Double peso= Double.parseDouble(request.getParameter("peso"));
		
		Integer quantidadeMinima = Integer.parseInt(request.getParameter("quantidadeMinima"));
		Integer categoriaId = Integer.parseInt(request.getParameter("categoriaId"));
		Integer fornecedorId = Integer.parseInt(request.getParameter("fornecedorId"));
		
		
		ICategoriaDAO categoriaDAO = DAOFactory.getCategoriaDAO();
		Categoria categoria = categoriaDAO.buscarPorId(Categoria.class, categoriaId);
		
		IFornecedorDAO fornecedorDAO= DAOFactory.getFornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscarPorId(Fornecedor.class, fornecedorId);
		
		Produto produto = new Produto(nome, categoria, fornecedor, peso, controlado, quantidadeMinima);
		
		IProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();
		produtoDAO.salvar(produto);
		
		((HttpServletResponse) response)
		.sendRedirect(((HttpServletRequest) request).getContextPath() + "/restrito/listarProdutos");
		
	}

}
