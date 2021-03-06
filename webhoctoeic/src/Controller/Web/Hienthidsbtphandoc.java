package Controller.Web;

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

import BEAN.Readexercise;
import DAO.QuanlybtdocDAO;
import DB.DBConnection;

@WebServlet("/Hienthidsbtphandoc")
public class Hienthidsbtphandoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hienthidsbtphandoc() {
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
			int maxpageid = (int) (Math.ceil((double) (QuanlybtdocDAO.Countrow(conn)) / count));

			List<Readexercise> lsAllExReading = QuanlybtdocDAO.Hienthidsbtdoc(request, pageid, count, conn);

			request.setAttribute("lsAllExReading", lsAllExReading);
			request.setAttribute("maxpageid", maxpageid);
			request.setAttribute("numberpage", pageidStr);

			RequestDispatcher rd = request.getRequestDispatcher("View/Dsbtdoc.jsp");
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
