package br.ucsal.loja.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.ucsal.loja.model.Usuario;

/**
 * Servlet Filter implementation class AcessoFilter
 */
@WebFilter("/admin/*")
public class AcessoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AcessoFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		Usuario usuario = (Usuario) httpServletRequest.getSession().getAttribute("usuario");
		if (usuario!=null &&usuario.getPapel().getId() == 1l) {
			chain.doFilter(request, response);
		}else {
			request.setAttribute("erro", "Acesso Proibido");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
