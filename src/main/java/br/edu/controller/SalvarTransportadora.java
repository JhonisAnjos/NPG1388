package br.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ICidadeDAO;
import br.edu.dao.ITransportadoraDAO;
import br.edu.domain.Cidade;
import br.edu.domain.Endereco;
import br.edu.domain.Transportadora;
import br.edu.util.DAOFactory;


@WebServlet("/restrito/salvarTransportadora")
public class SalvarTransportadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SalvarTransportadora() {
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
		Transportadora transportadora = new Transportadora(nome, endereco, telefone, email, inscricaoEstadual, cnpj);
		
		ITransportadoraDAO fornecedorDAO = DAOFactory.getTransportadoraDAO();
		fornecedorDAO.salvar(transportadora);
		
		((HttpServletResponse) response)
		.sendRedirect(((HttpServletRequest) request).getContextPath() + "/restrito/listarTransportadoras");
		
	}

}
