package br.ucsal.loja.controller;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.ClienteDAO;
import br.ucsal.loja.dao.ProdutoDAO;
import br.ucsal.loja.model.Cliente;
import br.ucsal.loja.model.Produto;

/**

 * @author Jean Xavier e Gleicy Maria

  */
@WebServlet("/ListarClientesServlet")
public class ListarClienteServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarClienteServlet() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO dao =  new ClienteDAO();
		List<Cliente> clientes  = dao.getLista();
		request.setAttribute("clientes", clientes);
		RequestDispatcher requestDispatcher =   request.getRequestDispatcher("ListarClientes.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

