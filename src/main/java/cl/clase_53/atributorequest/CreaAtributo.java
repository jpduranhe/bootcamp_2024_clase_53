package cl.clase_53.atributorequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CreaAtributo
 */
public class CreaAtributo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("valor_attr_req", "Francisca");
		
		RequestDispatcher distpacher= null;
		String muestra= request.getParameter("muestra");
		if(muestra.equals("servlet")) {
			distpacher=request.getRequestDispatcher("/UsaAtributoRequest");
		}else {
			distpacher=request.getRequestDispatcher("/Hola.jsp");
		}
				
		distpacher.forward(request, response);
	}

}
