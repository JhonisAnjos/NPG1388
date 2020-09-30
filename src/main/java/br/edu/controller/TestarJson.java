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

/**
 * Servlet implementation class TestarJson
 */
@WebServlet(name = "testarJson", urlPatterns = { "/restrito/testarJson" })
public class TestarJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestarJson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JsonReader jsonReader = Json.createReader( new StringReader(request.getParameter("itens")));
		
		JsonArray jsonArray = jsonReader.readArray();
		
		for (int i = 0; i < jsonArray.size(); i++) {

	         JsonObject jsonObject = jsonArray.getJsonObject(i);
	         
	         System.out.println(jsonObject.getString("nome"));


		}
	}

}
