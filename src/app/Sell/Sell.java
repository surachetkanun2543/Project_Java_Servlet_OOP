package app.Sell;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import app.DAO.GoodDAO;
import app.Database.connect;
import app.Model.GoodModel;


/**
 * Servlet implementation class Sell
 */
@WebServlet("/Sell.do")
public class Sell extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sell() {
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
		try (PrintWriter out = response.getWriter()) {

			connect db = new connect();
			//System.out.println("Page ShowGood Requested");
			GoodDAO tablegoodDAO = new GoodDAO(db);
			
			ArrayList<GoodModel> goodList = tablegoodDAO.FindAll();
			//System.out.println("count : " + goodList.size());
			
			//System.out.println("\n" + "List Good :" + goodList);
			request.setAttribute("goodList", goodList);

			RequestDispatcher rd = request.getRequestDispatcher("/app/sell/sell.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			;
		}

	}
}
