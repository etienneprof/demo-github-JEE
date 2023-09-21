package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaSuperServlet
 */
@WebServlet("/MaSuperServlet")
public class MaSuperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MaSuperServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Coucou Etienne est passé par là.
		System.out.println("Une modification dans etienne2");
		// Coucou Etienne est passï¿½ par lï¿½.
		System.out.println("Coucou, c'est Etienne");
		System.out.println("Une modification sur etienne1");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Une nouvelle modif sur etienne2");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
