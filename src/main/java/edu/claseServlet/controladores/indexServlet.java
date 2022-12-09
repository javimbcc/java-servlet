package edu.claseServlet.controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class indexServlet
 */
@WebServlet(name = "operar", urlPatterns = { "/operar" })
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public indexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uno = request.getParameter("nUno");
		String dos = request.getParameter("nDos");
		Integer iUno = Integer.parseInt(uno);
		Integer iDos = Integer.parseInt(dos);

		String btnSuma = request.getParameter("bSuma");
		String btnResta = request.getParameter("bResta");
		Integer resultado = 0;
		if (btnSuma != null) {
			resultado = iUno + iDos;
		}
		if (btnResta != null) {
			resultado = iUno - iDos;
		}
		// Mandar datos con el request
		request.setAttribute("requestR", resultado);
		// Mandar datos con el Session
		request.getSession().setAttribute("resultadoS", resultado);
		// Mandar datos con el contexto
		getServletContext().setAttribute("resultadoC", resultado);

		RequestDispatcher rd;
		
		rd = request.getRequestDispatcher("/resultado.jsp");
		rd.forward(request, response);
		
		
	}

}
