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

import DAO.QuanlybtngheDAO;
import DB.DBConnection;

@WebServlet("/Themaudiohinhanhbtnghe")
public class Themaudiohinhanhbtnghe extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Themaudiohinhanhbtnghe() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themaudiohinhanhbtnghe.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		try {
			
			String testUpload = QuanlybtngheDAO.Themaudiohinhanhbtnghe(conn, request, response);
			
			if (testUpload.equals("Success")) {
				
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlybtnghe?pageid=1");
				rd.forward(request, response);

			} else {

				request.setAttribute("msgthemaudiohinhanhbtnghe", testUpload);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themaudiohinhanhtuvung.jsp");
				rd.forward(request, response);  
			}
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
