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

import BEAN.Listenexercise;
import DAO.QuanlybtngheDAO;
import DB.DBConnection;

@WebServlet("/Hienthidsquanlybtnghe")
public class Hienthidsquanlybtnghe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hienthidsquanlybtnghe() {
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
		
		try {
			int maxpageid = (int) (Math.ceil((double) (QuanlybtngheDAO.Countrow(conn)) / count));

			List<Listenexercise> lsAllExListening = QuanlybtngheDAO.Hienthidsbtnghe(request, pageid, count, conn);

			request.setAttribute("lsAllExListening", lsAllExListening);
			request.setAttribute("maxpageid", maxpageid);
			request.setAttribute("numberpage", pageidStr);

			RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Quanlylambtnghe.jsp");
			
			
			
			rd.forward(request, response);

			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
