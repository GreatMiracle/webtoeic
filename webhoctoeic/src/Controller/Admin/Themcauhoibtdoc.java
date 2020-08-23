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

import DAO.QuanlybtdocDAO;
import DB.DBConnection;

@WebServlet("/Themcauhoibtdoc")
public class Themcauhoibtdoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Themcauhoibtdoc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String readexeriseid = request.getParameter("readexeriseid");
		request.setAttribute("readexeriseid", readexeriseid);

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themcauhoibtdoc.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		try {

			int readexeriseid = Integer.parseInt(request.getParameter("readexeriseid"));

			String testUpload = QuanlybtdocDAO.Uploadcauhoibtdoc(conn, request, response, readexeriseid);

			if (testUpload.equals("Success")) {

				QuanlybtdocDAO.Kiemtracauhoibtdoc(request, conn, 1, readexeriseid);
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsbtdoc?pageid=1");
				rd.forward(request, response);

			} else {

				request.setAttribute("msgquanlydsbtdoc", testUpload);
				request.setAttribute("readexeriseid", readexeriseid);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themcauhoibtdoc.jsp");
				rd.forward(request, response);
			}

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
