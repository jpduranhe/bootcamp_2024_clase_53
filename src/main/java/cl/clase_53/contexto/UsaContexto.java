package cl.clase_53.contexto;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UsaContexto
 */
public class UsaContexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto= getServletContext();
		String nombreCtx= (String) contexto.getAttribute("nombre_ctx");
		String html="""
				<html>
					<body>
						<h1> Valor del Contexto __ctx_value__</h1>
					</body>						
				</html>
			""".replace("__ctx_value__", nombreCtx);
		response.getWriter().print(html);
	}

}
