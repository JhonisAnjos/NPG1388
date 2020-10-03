package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ICidadeDAO;
import br.edu.dao.IFornecedorDAO;
import br.edu.domain.Cidade;
import br.edu.domain.Endereco;
import br.edu.domain.Fornecedor;
import br.edu.util.DAOFactory;


@WebServlet("/restrito/salvarFornecedor")
public class SalvarFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SalvarFornecedor() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String inscricaoEstadual = request.getParameter("inscricaoEstadual");
		String cnpj = request.getParameter("cnpj");
		
		
		Integer cidadeId = Integer.parseInt(request.getParameter("cidadeId"));
		String logradouro = request.getParameter("logradouro");
		String numero = request.getParameter("numero");
		String bairro = request.getParameter("bairro");
		
		ICidadeDAO cidadeDAO = DAOFactory.getCidadeDAO();
		Cidade cidade = cidadeDAO.buscarPorId(Cidade.class, cidadeId);
		
		Endereco endereco = new Endereco(logradouro, numero, bairro, cidade);
		Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, email, inscricaoEstadual, cnpj);
		
		IFornecedorDAO fornecedorDAO = DAOFactory.getFornecedorDAO();
		fornecedorDAO.salvar(fornecedor);
		
		((HttpServletResponse) response)
		.sendRedirect(((HttpServletRequest) request).getContextPath() + "/restrito/listarFornecedores");
		
	}

}
