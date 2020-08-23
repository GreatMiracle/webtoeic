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

import BEAN.Readexercise;
import DAO.QuanlybtdocDAO;
import DB.DBConnection;

@WebServlet("/Themtenbtdoc")
public class Themtenbtdoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Themtenbtdoc() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();		

		try {
			Readexercise readEx = new Readexercise();
			readEx.setReadname(request.getParameter("readname"));
			
			
			
			boolean kt = QuanlybtdocDAO.Themtenbtdoc(request, conn, readEx);
			if (kt) {
				
				int readId = QuanlybtdocDAO.Xuatmabtdoc(request, conn, readEx);
				
				QuanlybtdocDAO.Kiemtracauhoibtdoc(request, conn, 0, readId);
				
				request.setAttribute("readexeriseid", readId);
				
				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themhinhbtdoc.jsp");
				rd.forward(request,response);
				
			}else
			{
				request.setAttribute("msgquanlydsbtdoc","Thêm không thành công");
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsbtdoc?pageid=1");
				rd.forward(request,response);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			
			request.setAttribute("msgquanlydsbtdoc",e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsbtdoc?pageid=1");
			rd.forward(request,response);
		}
	}

}
