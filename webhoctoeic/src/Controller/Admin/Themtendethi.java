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

import BEAN.Examination;
import BEAN.Grammarguideline;
import DAO.GrammarguidelinemanageDAO;
import DAO.QuanlydethiDAO;
import DB.DBConnection;

@WebServlet("/Themtendethi")
public class Themtendethi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Themtendethi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();		

		try {
			Examination exam = new Examination();
			exam.setExaminationame(request.getParameter("examinationame"));
			
			boolean kt = QuanlydethiDAO.Themtendethi(request, conn, exam);
			if (kt) {
				
				int examID = QuanlydethiDAO.Xuatmadethi(request, conn, exam);
				request.setAttribute("examinationid", examID);
				
				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themhinhdethi.jsp");
				rd.forward(request,response);
				
			}else
			{
				request.setAttribute("msgquanlydethi","Thêm không thành công");
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlydethi?pageid=1");
				rd.forward(request,response);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			
			request.setAttribute("msgquanlydethi",e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlydethi?pageid=1");
			rd.forward(request,response);
		}
	}

}
