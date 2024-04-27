package cl.clase_53.contexto;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CreaContexto
 */
public class CreaContexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto= getServletContext();
		contexto.setAttribute("nombre_ctx","Aaron" );
		
		String html="""
				<html>
					<body>
						<h1> Contexto Seteado</h1>
					</body>						
				</html>
			""";
		response.getWriter().print(html);
	
	}


}
