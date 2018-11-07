package br.ucsal.loja.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.ClienteDAO;
import br.ucsal.loja.model.Cliente;

@WebServlet("/AdicionarClienteServlet")
public class AdicionarClienteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String cpf = request.getParameter("cpf");
		String cidade = request.getParameter("cidade");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String estado = request.getParameter("estado");
		String logradouro = request.getParameter("logradouro");
		String bairro = request.getParameter("bairro");

		Cliente cliente = new Cliente();
		cliente.setName(name);
		cliente.setCpf(cpf);
		cliente.setCidade(cidade);
		cliente.setBairro(bairro);
		cliente.setNumero(numero);
		cliente.setEstado(estado);
		cliente.setLogradouro(logradouro);
		cliente.setEstado(estado);

		ClienteDAO dao = new ClienteDAO();
		dao.inserir(cliente);

		response.sendRedirect("/ListarClienteServlet");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
