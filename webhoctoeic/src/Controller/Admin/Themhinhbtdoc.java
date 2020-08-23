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
import DAO.QuanlydethiDAO;
import DB.DBConnection;

@WebServlet("/Themhinhbtdoc")
public class Themhinhbtdoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Themhinhbtdoc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		
		try {
			int readexeriseid = Integer.parseInt(request.getParameter("readexeriseid"));

			String testUpload = QuanlybtdocDAO.Themhinhbtdoc(conn, request, response, readexeriseid);
			if (testUpload.equals("Success")) {

				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlydethi?pageid=1");
				rd.forward(request, response);

			} else {

				request.setAttribute("msgquanlydsbtdoc", testUpload);
				request.setAttribute("readexeriseid", readexeriseid);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themhinhbtdoc.jsp");
				rd.forward(request, response);
			}

			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
