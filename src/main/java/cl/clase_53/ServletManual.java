package cl.clase_53;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/ServletManual","/JaimeElPulento"})
public class ServletManual  extends HttpServlet{
	private static final long serialVersionUID = 7972116382498392667L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ServletManual ").append(request.getContextPath());
	}
}
