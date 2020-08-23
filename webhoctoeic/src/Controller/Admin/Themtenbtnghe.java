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

import BEAN.Listenexercise;
import DAO.QuanlybtngheDAO;
import DB.DBConnection;


@WebServlet("/Themtenbtnghe")
public class Themtenbtnghe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Themtenbtnghe() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();		

		try {
			Listenexercise listenEx = new Listenexercise();
			listenEx.setListenexercisename(request.getParameter("listenexercisename"));
			
			
			
			boolean kt = QuanlybtngheDAO.Themtenbtnghe(request, conn, listenEx);
			if (kt) {
				
				int listId = QuanlybtngheDAO.Xuatmabtnghe(request, conn, listenEx);
				
				QuanlybtngheDAO.Kiemtracauhoibtnghe(request, conn, 1, listId);;
				
				request.setAttribute("listenexerciseid", listId);
				
				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themhinhbtnghe.jsp");
				rd.forward(request,response);
				
			}else
			{
				request.setAttribute("msgquanlydsbtnghe","Thêm không thành công");
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlybtnghe?pageid=1");
				rd.forward(request,response);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			
			request.setAttribute("msgquanlydsbtnghe",e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlybtnghe?pageid=1");
			rd.forward(request,response);
		}
	}

}
