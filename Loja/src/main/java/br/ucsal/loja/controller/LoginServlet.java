package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.UsuarioDAO;
import br.ucsal.loja.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("password");
		
		//testou se existe no banco
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = dao.login(email,senha);
		if(usuario != null ) {
			
			request.getSession().setAttribute("usuario", usuario);
			//Admin
			if(usuario.getPapel().getId()==1l) {
				response.sendRedirect("/ListarProdutosServlet");
			}else if(usuario.getPapel().getId()==2l){
				response.sendRedirect("/");
			}
			
			
		}else {
			request.setAttribute("erro", "Usuario ou Senha invalidos");
			request.getRequestDispatcher("login.jsp").forward(request, response);;
		}
		
	}

}
