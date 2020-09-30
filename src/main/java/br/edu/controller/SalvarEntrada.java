package br.edu.controller;

import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.dao.ITransportadoraDAO;
import br.edu.domain.Entrada;
import br.edu.domain.Transportadora;
import br.edu.util.DAOFactory;

/**
 * Servlet implementation class SalvarEntrada
 */
@WebServlet(urlPatterns = { "/restrito/salvarEntrada" })
public class SalvarEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalvarEntrada() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*ENTRATA */
		Integer transportadoraId = Integer.parseInt(request.getParameter("transportadoraId"));
		Date dataPedido;
		Date dataEntrada;
		try {
			dataPedido = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataPedido"));
			dataEntrada = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataEntrega"));
		} catch (ParseException e) {
			throw new ServletException("Erro ao formatar data");
		}
		
		Double total = Double.parseDouble(request.getParameter("total"));
		Double frete = Double.parseDouble(request.getParameter("frete"));
		Integer numeroNotaFiscal = Integer.parseInt(request.getParameter("numeroNotaFiscal"));
		Double imposto = Double.parseDouble(request.getParameter("imposto"));
		
		ITransportadoraDAO transportadoraDAO = DAOFactory.getTransportadoraDAO();
		Transportadora transportadora = transportadoraDAO.buscarPorId(Transportadora.class, transportadoraId);
		
		Entrada entrada  = new Entrada(transportadora, dataPedido, dataEntrada, total, frete, numeroNotaFiscal, imposto);
		
		/* ITEM ENTRADA */
		
		JsonReader jsonReader = Json.createReader( new StringReader(request.getParameter("itens")));
		JsonArray jsonArray = jsonReader.readArray();
		
		for (int i = 0; i < jsonArray.size(); i++) {

	         JsonObject jsonObject = jsonArray.getJsonObject(i);
	         
	         System.out.println(jsonObject.getString("nome"));


		}

		
 	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
