package app.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import app.DAO.CustomerDAO;
import app.Database.connect;
import app.Model.CustomerModel;

/**
 * Servlet implementation class Edituser
 */
@WebServlet("/Edituser.do")
public class Edituser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edituser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {

			if (session.getAttribute("username") != null) {

				connect db = new connect();
				CustomerDAO cusDAO = new CustomerDAO(db);

				// get value from java session
				int userId = Integer.parseInt(request.getParameter("customerId"));
				CustomerModel cusModel = cusDAO.FindByID(userId);

				// send user data to user.jsp
				request.setAttribute("cusModel", cusModel);

				RequestDispatcher rd = request.getRequestDispatcher("/app/user/edituser.jsp");
				rd.forward(request, response);

			} else {
				response.sendRedirect(request.getContextPath() + "/Login.do");
			}

		} catch (Exception e) {
			;
		}
	}

}
