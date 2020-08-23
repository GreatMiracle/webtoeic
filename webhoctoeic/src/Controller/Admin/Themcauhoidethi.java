package Controller.Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.QuanlydethiDAO;
import DB.DBConnection;

@WebServlet("/Themcauhoidethi")
public class Themcauhoidethi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Themcauhoidethi() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String examinationid = request.getParameter("examinationid");
		request.setAttribute("examinationid", examinationid);

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themcauhoidethi.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		int examinationid = Integer.parseInt(request.getParameter("examinationid"));

		String testUpload = QuanlydethiDAO.Uploadcauhoidethi(conn, request, response, examinationid);

		if (testUpload.equals("Success")) {
			
			QuanlydethiDAO.Kiemtracauhoidethi(request, conn, 1, examinationid);
			
			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlydethi?pageid=1");
			rd.forward(request, response);

		} else {

			request.setAttribute("msgUpLoadExaminationImage", testUpload);
			request.setAttribute("examinationid", examinationid);

			RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themcauhoidethi.jsp");
			rd.forward(request, response);  
		}

		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
