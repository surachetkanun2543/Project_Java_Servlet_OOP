package app.Login;

import java.awt.Desktop;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import app.DAO.CustomerDAO;
import app.Database.connect;
import app.Model.CustomerModel;

/**
 * Servlet implementation class ChkLogin
 */
@WebServlet("/ChkLogin.do")
public class ChkLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChkLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (IOException | ServletException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (IOException | ServletException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, URISyntaxException {

		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		connect db = new connect();
		CustomerDAO cusDAO = new CustomerDAO(db);
		String username = request.getParameter("username");
		int password = Integer.parseInt(request.getParameter("password"));
		CustomerModel cusModel = cusDAO.FindLogin(username, password);


		System.out.println("cusModel:" + cusModel.toString());

		if (cusModel.getName() !=null ) {
			session.setAttribute("userId", cusModel.getId());
			session.setAttribute("username", cusModel.getName());
			session.setAttribute("password", cusModel.getPassword());
			response.sendRedirect(request.getContextPath() + "/Sell.do");
		} else {
			out.print(" <center><h1>\r\n"
					+ "Invalid username or passowrd , please try again.</h1><center>");
			out.print(" <h1><a href='http://localhost:8080/Project-web/Login.do'>Login</a></h1>");
			
		}

	}

}
