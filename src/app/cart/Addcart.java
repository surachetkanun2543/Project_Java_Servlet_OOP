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

import app.Database.connect;
import app.Model.Cart;



/**
 * Servlet implementation class Addcart
 */
@WebServlet("/Addcart.do")
public class Addcart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Addcart() {
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

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		try (PrintWriter out = response.getWriter()) {
				connect db = new connect();
			if(session.getAttribute("username") != null)  {

				
				int id = Integer.parseInt(request.getParameter("goodId")); 
				double price = Double.parseDouble(request.getParameter("goodPrice")); 
				int qty = Integer.parseInt(request.getParameter("qty")); 
				String goodName = request.getParameter("goodName");

				System.out.println("id: " + id + "Name: " + goodName + "price: " + price + "qty: " + qty + "amout: "
						+ qty * price);

				Cart cart = new Cart();
				cart.setId(id);
				cart.setPrice(price);
				cart.setQty(qty);
				cart.setGoodName(goodName);

				db = new connect();
				if (session.getAttribute("cartList") == null) {
					ArrayList<Cart> cartList = new ArrayList<Cart>();
					cartList.add(cart);
					session.setAttribute("cartList", cartList);

				} else {

					ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
					cartList.add(cart);
					session.setAttribute("cartList", cartList);

				}
					System.out.println("------Cart------");
					ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
				
				for (Cart cart2 : cartList) {
					System.out.println("id: " + cart2.getId() + ", price: " + cart2.getPrice() + ", QTY: " + cart2.getQty());
				}
				
					System.out.println("------------------");
					response.sendRedirect(request.getContextPath() + "/Sell.do");

				}
			
				 else {
					 
					 out.print(" <center><h1>กรุณาเข้าสู่ระบบเพื่อทำการสั่งซื้อสินค้า</h1><center>");
					 out.print(" <h1><a href='http://localhost:8080/Project-web/Login.do'>เข้าสู่ระบบ</a></h1>");
			}
			
		} catch (Exception e) {
			e.getStackTrace();

		}
	}
}
