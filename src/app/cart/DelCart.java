package app.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import app.Model.Cart;

/**
 * Servlet implementation class DelCart
 */
@WebServlet("/DelCart.do")
public class DelCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		try (PrintWriter out = response.getWriter()) {

			if (session.getAttribute("username") != null) {
				System.out.println("Delete Cart  ID := " + request.getParameter("index"));

				// get ค่าที่ได้มาจาก input index
				int index = Integer.parseInt(request.getParameter("index"));
				
				// get session cartList
				ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
				
				// ลบค่า index
				cartList.remove(index);
				
				// ถ้า cartList size ทั้งหมเน้อยกว่า เท่ากับ 0 ให้เช็ตที่ค่าว่าง
				if (cartList.size() <= 0) {
					session.setAttribute("cartList", null);
				}

				session.setAttribute("cartList", cartList);

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
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
