package cl.clase_53.atributorequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UsaAtributoRequest
 */
public class UsaAtributoRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorAttrReq = (String)request.getAttribute("valor_attr_req");
		String html="""
				<html>
					<body>
						<h1> Valor del Atributo en Request __valor_attr_req__ :)</h1>
					</body>						
				</html>
			""".replace("__valor_attr_req__", valorAttrReq);
		response.getWriter().print(html);
	}


}
