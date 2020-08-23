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

import BEAN.Examination;
import DAO.BaihdnguphapDAO;
import DAO.QuanlydethiDAO;
import DB.DBConnection;

@WebServlet("/Hienthidsquanlydethi")
public class Hienthidsquanlydethi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hienthidsquanlydethi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);

		int count = 1;

		if (pageid == 1) {
			
		} else {

			pageid = (pageid - 1) * count + 1;
		}

//		int maxpageid = (int) (Math.ceil((double) (QuanlydethiDAO.Countrow(conn)) / count));
		
//		List<Examination> lsAllDethi = QuanlydethiDAO.Hienthidsdethi(request, conn);
		List<Examination> lsAllDethi = QuanlydethiDAO.Hienthidsdethi(request, pageid, count, conn);
		
		request.setAttribute("lsAllDethi", lsAllDethi);
		request.setAttribute("maxpageid", (int) (Math.ceil((double) (QuanlydethiDAO.Countrow(conn)) / count)));
		request.setAttribute("numberpage", pageidStr);
 		
		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Quanlydethi.jsp");
		rd.forward(request,response);
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
