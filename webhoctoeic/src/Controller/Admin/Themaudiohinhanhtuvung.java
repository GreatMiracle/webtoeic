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
import DAO.QuanlyhdtuvungDAO;
import DB.DBConnection;

@WebServlet("/Themaudiohinhanhtuvung")
public class Themaudiohinhanhtuvung extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Themaudiohinhanhtuvung() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themaudiohinhanhtuvung.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		try {
			
			String testUpload = QuanlyhdtuvungDAO.Themaudiohinhanhtuvung(conn, request, response);
			
			if (testUpload.equals("Success")) {
				
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlytuvung?pageid=1");
				rd.forward(request, response);

			} else {

				request.setAttribute("msgthemaudiohinhanhtuvung", testUpload);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themaudiohinhanhtuvung.jsp");
				rd.forward(request, response);  
			}
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
