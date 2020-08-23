package Controller.Forward;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Grammarguideline;
import DAO.BaihdnguphapDAO;
import DB.DBConnection;

@WebServlet("/Dsbaihdnguphapforward")
public class Dsbaihdnguphapforward extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dsbaihdnguphapforward() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		int pageid = Integer.parseInt(request.getParameter("pageid"));

		int count = 2;

		if (pageid == 1) {
			// ko phan trang
		} else {
			// page khac 1 thi phan trang

			pageid = (pageid - 1) * count + 1;
		}

		List<Grammarguideline> listGmgl = BaihdnguphapDAO.Displaygrammarguideline(pageid, count, conn);
		int maxpageid = (int) (Math.ceil((double) (BaihdnguphapDAO.Countrow(conn)) / count));

//		int sumrow = HomeDAO.countRow(conn);
//		int maxpageid = (sumrow/count)+1;

		request.setAttribute("listGmgl", listGmgl);
		request.setAttribute("maxpageid", maxpageid);
		request.setAttribute("numberpage", Integer.parseInt(request.getParameter("pageid")));

		RequestDispatcher rd = request.getRequestDispatcher("View/Dsbaihdnguphap.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
