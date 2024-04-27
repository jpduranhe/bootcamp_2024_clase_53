package cl.clase_53.sesion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class UsaSesion
 */
public class UsaSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsaSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String nombreUsuario= (String) session.getAttribute("nombreUsuario");
		String rol= (String) session.getAttribute("rol");
		String html;
		if(nombreUsuario == null || rol==null ) {
			html="""
					<html>
						<body>
							<h1> No hay usuario Logueado</h1>
						</body>						
					</html>
				""";
		} else {
			
		
			html="""
					<html>
						<body>
							<h1> USuario : __nombreUsuario__</h1>
							<h4> Rol: **rol** </h4>
						</body>						
					</html>
				""".replace("__nombreUsuario__", nombreUsuario)
					.replace("**rol**", rol);
		}
		response.getWriter().print(html);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
