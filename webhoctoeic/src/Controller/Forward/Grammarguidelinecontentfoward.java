package Controller.Forward;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Grammarguideline;
import DAO.GrammarguidelinemanageDAO;
import DB.DBConnection;


@WebServlet("/Grammarguidelinecontentfoward")
public class Grammarguidelinecontentfoward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Grammarguidelinecontentfoward() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		Connection conn = DBConnection.CreateConnection();		
		
		try {
			String grammarguidelineid = request.getParameter("id");
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			String contentStr = GrammarguidelinemanageDAO.Retrievecontentgrammarguideline(request, conn, id) ;
			
			request.setAttribute("contentStr", contentStr);
			request.setAttribute("grammarguidelineid",grammarguidelineid);
			
			RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Insertgrammarguidelinecontent.jsp");
			rd.forward(request,response);
			
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
