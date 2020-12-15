package app.user;

import java.io.IOException;
import java.io.PrintWriter;


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
 * Servlet implementation class Confirmedituser
 */
@WebServlet("/Confirmedituser.do")
public class Confirmedituser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmedituser() {
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
				
				int customerId  = Integer.parseInt(request.getParameter("customerId"));
				String customerName  = (request.getParameter("customerName"));
				String customerSurname  = (request.getParameter("customerSurname"));
				String customerUsername  = (request.getParameter("customerUsername"));
				int customerPassword  = Integer.parseInt(request.getParameter("customerPassword"));
				int customerAddress  = Integer.parseInt(request.getParameter("customerAddress"));
				int customerPostcode  = Integer.parseInt(request.getParameter("customerPostcode"));
				int customerBank_acct  = Integer.parseInt(request.getParameter("customerBank_acct"));
				Double customerBalance  = Double.parseDouble(request.getParameter("customerBalance"));
				int customerVerified  = Integer.parseInt(request.getParameter("customerVerified"));

				CustomerModel cusModel = new CustomerModel();
				CustomerModel.setId(customerId);
				CustomerModel.setName(customerName);
				CustomerModel.setSurname(customerSurname);
				CustomerModel.setUsername(customerUsername);
				CustomerModel.setPassword(customerPassword);
				CustomerModel.setAddress(customerAddress);
				CustomerModel.setPostcode(customerPostcode);
				CustomerModel.setBank_acct(customerBank_acct);
				CustomerModel.setBalance(customerBalance);
				CustomerModel.setVerified(customerVerified);
				
				System.out.println(cusDAO);
				
				cusDAO.Update(cusModel);
				
				response.sendRedirect(request.getContextPath() + "/User.do");
				
			} else {
				response.sendRedirect(request.getContextPath() + "/Login.do");
			}

		} catch (Exception e) {
			;
		}
	}
	
}
