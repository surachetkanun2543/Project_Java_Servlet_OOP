package app.Register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.DAO.CustomerDAO;
import app.Database.connect;
import app.Model.CustomerModel;

/**
 * Servlet implementation class Addregister
 */
@WebServlet("/Addregister.do")
public class Addregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addregister() {
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
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			
		connect db  = new connect();
    	CustomerDAO cusDAO = new CustomerDAO(db);
    	CustomerModel cusModel = new CustomerModel();
	
		CustomerModel.setId(Integer.parseInt(request.getParameter("cus_id")));
		CustomerModel.setName(request.getParameter("cus_name"));
		CustomerModel.setSurname(request.getParameter("cus_surname"));
		CustomerModel.setUsername(request.getParameter("cus_username"));
		CustomerModel.setPassword(Integer.parseInt(request.getParameter("cus_password")));
		CustomerModel.setAddress(Integer.parseInt(request.getParameter("cus_address")));
		CustomerModel.setPostcode(Integer.parseInt(request.getParameter("cus_postcode")));
		CustomerModel.setBank_acct(Integer.parseInt(request.getParameter("cus_bank")));
		CustomerModel.setBalance(Double.parseDouble(request.getParameter("cus_balance")));
		CustomerModel.setVerified(Integer.parseInt(request.getParameter("cus_ver")));
		
		System.out.println("cusModel:" + cusModel.toString());
		
		int ret = cusDAO.Add(cusModel);

		if(ret >= 0) {
			request.setAttribute("ret_status", true);
		}else {
			request.setAttribute("ret_status", false);
		}
			
			RequestDispatcher rd = request.getRequestDispatcher("/app/register/addregister.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			;
		}
	}

}
