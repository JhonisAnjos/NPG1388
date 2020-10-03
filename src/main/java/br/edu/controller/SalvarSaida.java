package br.edu.controller;

import java.io.IOException;
import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ILojaDAO;
import br.edu.dao.IProdutoDAO;
import br.edu.dao.ISaidaDAO;
import br.edu.dao.ITransportadoraDAO;
import br.edu.domain.ItemSaida;
import br.edu.domain.Loja;
import br.edu.domain.Produto;
import br.edu.domain.Saida;
import br.edu.domain.Transportadora;
import br.edu.util.DAOFactory;

@WebServlet(urlPatterns = { "/restrito/salvarSaida" })
public class SalvarSaida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarSaida() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/* SAIDA */
		Integer transportadoraId = Integer.parseInt(request.getParameter("transportadoraId"));
		Integer lojaId = Integer.parseInt(request.getParameter("lojaId"));
		
		Double total = Double.parseDouble(request.getParameter("total"));
		Double frete = Double.parseDouble(request.getParameter("frete"));
		Double imposto = Double.parseDouble(request.getParameter("imposto"));

		ITransportadoraDAO transportadoraDAO = DAOFactory.getTransportadoraDAO();
		Transportadora transportadora = transportadoraDAO.buscarPorId(Transportadora.class, transportadoraId);
		
		ILojaDAO lojaDAO = DAOFactory.getLojaDAO();
		Loja loja = lojaDAO.buscarPorId(Loja.class, lojaId);

		Saida saida = new Saida(loja, transportadora, total, frete, imposto);

		/* ITEM SAIDA */
		IProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();

		JsonReader jsonReader = Json.createReader(new StringReader(request.getParameter("itens")));

		JsonArray jsonArray = jsonReader.readArray();

		for (int i = 0; i < jsonArray.size(); i++) {
			JsonObject jsonObject = jsonArray.getJsonObject(i);

			Produto produto = produtoDAO.buscarPorId(Produto.class,
					Integer.parseInt(jsonObject.getString("produtoId")));
			String lote = jsonObject.getString("lote");
			Integer quantidade = Integer.parseInt(jsonObject.getString("quantidade"));
			Double valor = Double.parseDouble(jsonObject.getString("valor"));
			ItemSaida itemSaida = new ItemSaida(saida, produto, lote, quantidade, valor);
			
			saida.getItensSaida().add(itemSaida);

		}
		/* SALVAR SAIDA */
		ISaidaDAO entradaDAO = DAOFactory.getSaidaDAO();
		entradaDAO.salvar(saida);
		
		((HttpServletResponse) response)
		.sendRedirect(((HttpServletRequest) request).getContextPath() + "/");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
