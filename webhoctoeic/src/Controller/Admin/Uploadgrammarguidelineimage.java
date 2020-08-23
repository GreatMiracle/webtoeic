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

import DAO.GrammarguidelinemanageDAO;
import DB.DBConnection;

@WebServlet("/Uploadgrammarguidelineimage")
public class Uploadgrammarguidelineimage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Uploadgrammarguidelineimage() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		
		int grammarguidelineid = Integer.parseInt(request.getParameter("grammarguidelineid"));
		
		String testUpoad = GrammarguidelinemanageDAO.Uploadimagegrammerguideline(request, response, conn, grammarguidelineid);
		
		if (testUpoad.equals("Success")) {
			response.sendRedirect("Listgrammarguidelinemanage?pageid=1");
			
//			RequestDispatcher rd = request.getRequestDispatcher("Listgrammarguidelinemanage?pageid=1");
//			rd.forward(request,response);
//			
		}else {
			
			request.setAttribute("msgrammarguidelineimage", testUpoad);
			request.setAttribute("grammarguidelineid", grammarguidelineid);
			
			RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Insertgrammarguidelineimage.jsp");
			rd.forward(request,response);
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
