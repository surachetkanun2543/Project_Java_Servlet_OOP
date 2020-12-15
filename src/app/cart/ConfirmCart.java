package app.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import app.Model.Cart;
import app.Model.CustomerModel;
import app.Model.InvoiceModel;
import app.Model.Invoice_detModel;
import app.Model.GoodModel;
import app.Model.Supplier_goodModel;
import app.DAO.GoodDAO;
import app.DAO.InvoiceDAO;
import app.DAO.Invoice_detDAO;
import app.DAO.SupplierGoodDAO;
import app.DAO.SupplierDAO;
import app.Database.connect;

/**
 * Servlet implementation class ConfirmCart
 */
@WebServlet("/ConfirmCart.do")
public class ConfirmCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		try (PrintWriter out = response.getWriter()) {

			if (session.getAttribute("username") != null) {
				System.out.println("Comfirm Cart!");

				response.sendRedirect(request.getContextPath() + "/Sell.do");

			} else {
				response.sendRedirect(request.getContextPath() + "/Login.do");

			}

		} catch (Exception e) {
			e.getStackTrace();

		}
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
