package br.ucsal.loja.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.ProdutoDAO;
import br.ucsal.loja.model.Produto;


public class ObterProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO dao = new ProdutoDAO(); 
		Long id = Long.parseLong(request.getParameter("id"));
		Produto produto = dao.obter(id) ;
		request.setAttribute("produto", produto);
		RequestDispatcher dispatcher = request.getRequestDispatcher("visualizarProduto.jsp");
	    dispatcher.forward(request, response);
		
	}

}

