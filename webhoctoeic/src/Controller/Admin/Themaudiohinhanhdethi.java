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

@WebServlet("/Themaudiohinhanhdethi")
public class Themaudiohinhanhdethi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Themaudiohinhanhdethi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themaudiohinhanhdethi.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		String testUpload = QuanlydethiDAO.Themaudiohinhanhdethi(conn, request, response);

		if (testUpload.equals("Success")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlydethi?pageid=1");
			rd.forward(request, response);

		} else {

			request.setAttribute("msgthemaudiohinhanhdethi", testUpload);

			RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themaudiohinhanhdethi.jsp");
			rd.forward(request, response);  
		}

		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	
	}

}
