package br.ucsal.loja.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.ClienteDAO;
import br.ucsal.loja.model.Cliente;

/**
 * Servlet implementation class RemoverClienteServlet
 */
@WebServlet("/RemoverClienteServlet")
public class RemoverClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente=new Cliente();
		Long id=Long.parseLong(request.getParameter("id"));
		cliente.setId(id);
		ClienteDAO dao= new ClienteDAO();
		dao.removerCliente(cliente);
		response.sendRedirect("/ListarClienteServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
