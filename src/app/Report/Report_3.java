package app.Report;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import app.DAO.GoodDAO;
import app.DAO.SupplierGoodDAO;
import app.Database.connect;
import app.Model.GoodModel;
import app.Model.Supplier_goodModel;

/**
 * Servlet implementation class Report_3
 */
@WebServlet("/Report_3.do")
public class Report_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Report_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		try {

			if (session.getAttribute("username") != null || session.getAttribute("password") != null) {
				System.out.println(" PAGE Report 1_2_3 Yes !!");
				
				connect db = new connect();
				
				db = new connect();
				System.out.println("Page Report 1.2.3 Requested");
				SupplierGoodDAO  tablesupgood_repirtDAO = new SupplierGoodDAO(db);
				
				ArrayList<Supplier_goodModel> reportsupgList = tablesupgood_repirtDAO.FindAll();
				System.out.println("count : " + reportsupgList.size());
				
				System.out.println("\n" + "List supgoods :" + reportsupgList);
				request.setAttribute("reportList", reportsupgList );
					
				RequestDispatcher rd = request.getRequestDispatcher("/app/report/report1_2_3.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect(request.getContextPath() + "/Login.do");
			}

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}
	}

}
