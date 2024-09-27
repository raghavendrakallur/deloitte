package sample;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class firstservlet
 */
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public firstservlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");

		// Check if the username is null or empty
		if (user != null && !user.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("Second");
			if(user.equals("admin")) {
				rd.include(request, response);
			} else {
				out.println("<h2>Invalid user. Only 'admin' is allowed.</h2>");
			}
		} else {
			out.println("<h2>Username cannot be empty.</h2>");
		}
		
		out.println("This is a sample for request dispatcher");
	}

}
