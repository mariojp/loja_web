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
import br.ucsal.loja.dao.ProdutoDAO;
import br.ucsal.loja.model.Cliente;
import br.ucsal.loja.model.Produto;

/*
* @author Walter Neto e Matheus Rivas
*/

@WebServlet("/AdicionarClienteServlet")
public class AdicionarClienteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/AdicionarClienteForm.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String cpf = request.getParameter("cpf");
		String nome = request.getParameter("nome");
		String logradouro = request.getParameter("logradouro");
		String numero = request.getParameter("numero");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		Cliente cliente = new Cliente(id, cpf, nome, logradouro, numero, bairro, cidade, estado);
		ClienteDAO dao = new ClienteDAO();
		dao.inserir(cliente);

		List<Cliente> lista = dao.getLista();
		request.setAttribute("clientes", lista);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListarProduto.jsp");
		requestDispatcher.forward(request, response);

	}

}
