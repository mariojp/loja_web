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
 * Servlet implementation class AdicionarClienteServlet
 */
@WebServlet("/AdicionarClienteServlet")
public class AdicionarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdicionarClienteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpf = request.getParameter("cpf");
		String nome = request.getParameter("nome");
		String logradouro = request.getParameter("logradouro");
		Integer numero = Integer.parseInt((request.getParameter("numero")));
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");

		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		cliente.setLogradouro(logradouro);
		cliente.setNumero(numero);
		cliente.setBairro(bairro);
		cliente.setCidade(cidade);
		cliente.setEstado(estado);
		ClienteDAO dao = new ClienteDAO();
		dao.adicionarCliente(cliente);
		response.sendRedirect("/ListarClienteServlet");
		
	}

}
