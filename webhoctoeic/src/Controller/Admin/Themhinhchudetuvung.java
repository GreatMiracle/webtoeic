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

import DAO.QuanlyhdtuvungDAO;
import DB.DBConnection;

@WebServlet("/Themhinhchudetuvung")
public class Themhinhchudetuvung extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Themhinhchudetuvung() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		try {
			
			int vocabularyguidelineid = Integer.parseInt(request.getParameter("vocabularyguidelineid"));

			String testUpoad = QuanlyhdtuvungDAO.Themhinhchudetuvung(request, response, conn, vocabularyguidelineid);
			

			if (testUpoad.equals("Success")) {
//				response.sendRedirect("Hienthidsquanlytuvung?pageid=1");

				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlytuvung?pageid=1");
				rd.forward(request,response);
				
			} else {

				request.setAttribute("msgdstuvung", testUpoad);
				request.setAttribute("vocabularyguidelineid", vocabularyguidelineid);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/themhinhchudetuvung.jsp");
				rd.forward(request, response);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
