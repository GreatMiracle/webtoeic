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

@WebServlet("/Grammarguidelinecontentcontroller")
public class Grammarguidelinecontentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Grammarguidelinecontentcontroller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		
		try {
			if (request.getCharacterEncoding() == null) {
				request.setCharacterEncoding("UTF-8");
			}

			String txtContent = request.getParameter("content");
			Grammarguideline gmgl = new Grammarguideline();
			gmgl.setContent(txtContent);

			int id = Integer.parseInt(request.getParameter("grammarguidelineid"));

			boolean kt = GrammarguidelinemanageDAO.Insertgrammarguidelinecontent(request, conn, id, gmgl);

			if (kt) {

//				RequestDispatcher rd = request.getRequestDispatcher("Listgrammarguidelinemanage?grammarguidelineid="+id);
//				rd.forward(request, response);
				response.sendRedirect("Listgrammarguidelinemanage?pageid=1"); 
			} else {

				request.setAttribute("msggrammarguidelinecontent", "Thêm nội dung không thành công");
				request.setAttribute("grammarguidelineid", id);
				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Insertgrammarguidelinecontent.jsp");
				rd.forward(request, response);
			}

			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
