package Controller.Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Grammarguideline;
import DAO.BaihdnguphapDAO;
import DAO.GrammarguidelinemanageDAO;
import DB.DBConnection;

@WebServlet("/Listgrammarguidelinemanage")
public class Listgrammarguidelinemanage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Listgrammarguidelinemanage() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);

		int count = 4;

		if (pageid == 1) {
			
		} else {

			pageid = (pageid - 1) * count + 1;
		}

		Connection conn = DBConnection.CreateConnection();

		int maxpageid = (int) (Math.ceil((double) (BaihdnguphapDAO.Countrow(conn)) / count));

		List<Grammarguideline> lsGmgl = GrammarguidelinemanageDAO.Displaysgrammarguidelinemanage(request, pageid, count, conn);
//		List<Grammarguideline> lsGmgl = GrammarguidelinemanageDAO.Displaysgrammarguidelinemanage1(request, conn);

		request.setAttribute("listgrammarguidelinemanage", lsGmgl);
		request.setAttribute("maxpageid", maxpageid);
		request.setAttribute("numberpage", pageidStr);

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Listgrammarguidelinemanage.jsp");

		rd.forward(request, response);

		try {
			conn.close();

		} catch (SQLException e) {
			request.setAttribute("msglistgrammarguidelinemanage", e.getMessage());
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
