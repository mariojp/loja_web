package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.ProdutoDAO;
import br.ucsal.loja.model.Produto;

/**
 * Servlet implementation class AlterarProdutoServlet
 */

@WebServlet("/AlterarProdutoServlet")
public class AlterarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarProdutoServlet() {
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
	 * @author Ronaldo Matheus e Getúlio Ferreira
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id=Long.parseLong(request.getParameter("id"));
		String nome=request.getParameter("nome");
		String email=request.getParameter("email");
		String status=request.getParameter("status");
		Produto produto = new Produto();
		produto.setName(nome);
		produto.setId(id);
		produto.setEmail("email");
		produto.setDescription("description");
		produto.setStatus("status");
		ProdutoDAO dao=new ProdutoDAO();
		dao.altera(produto);
		response.sendRedirect("/ListarProdutoServlet");
		
	}

}
