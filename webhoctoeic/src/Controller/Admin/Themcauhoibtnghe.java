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
import DAO.QuanlybtngheDAO;
import DB.DBConnection;


@WebServlet("/Themcauhoibtnghe")
public class Themcauhoibtnghe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Themcauhoibtnghe() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String listenexerciseid = request.getParameter("listenexerciseid");
		request.setAttribute("listenexerciseid", listenexerciseid);

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themcauhoibtnghe.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		try {

			int listenexerciseid = Integer.parseInt(request.getParameter("listenexerciseid"));

			String testUpload = QuanlybtngheDAO.Uploadcauhoibtnghe(conn, request, response, listenexerciseid);

			if (testUpload.equals("Success")) {

				QuanlybtngheDAO.Kiemtracauhoibtnghe(request, conn, 1, listenexerciseid);
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlybtnghe?pageid=1");
				rd.forward(request, response);

			} else {

				request.setAttribute("msgquanlydsbtnghe", testUpload);
				request.setAttribute("listenexerciseid", listenexerciseid);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themcauhoibtnghe.jsp");
				rd.forward(request, response);
			}

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
