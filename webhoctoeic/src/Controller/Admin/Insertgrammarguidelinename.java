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

import BEAN.Grammarguideline;
import DAO.GrammarguidelinemanageDAO;
import DB.DBConnection;

@WebServlet("/Insertgrammarguidelinename")
public class Insertgrammarguidelinename extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Insertgrammarguidelinename() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();		

		try {
			Grammarguideline gmgl = new Grammarguideline();
			gmgl.setGrammarname(request.getParameter("grammarname"));
			
			boolean kt = GrammarguidelinemanageDAO.Insertgrammarguidelinename(request, conn, gmgl);
			if (kt) {
				
				int gmglId = GrammarguidelinemanageDAO.Retrieveidgrammarguideline(request, conn, gmgl);
				request.setAttribute("grammarguidelineid", gmglId);
				
				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Insertgrammarguidelineimage.jsp");
				rd.forward(request,response);
				
			}else
			{
				request.setAttribute("msglistgrammarguidelinemanage","Thêm không thành công");
				RequestDispatcher rd = request.getRequestDispatcher("Listgrammarguidelinemanage?pageid=1");
				rd.forward(request,response);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			
			request.setAttribute("msglistgrammarguidelinemanage",e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("Listgrammarguidelinemanage?pageid=1");
			rd.forward(request,response);
		}
	}

}
