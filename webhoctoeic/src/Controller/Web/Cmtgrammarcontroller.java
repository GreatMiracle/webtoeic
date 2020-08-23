package Controller.Web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Cmtgrammar;
import DAO.CommentgrammarDAO;
import DB.DBConnection;

@WebServlet("/Cmtgrammarcontroller")
public class Cmtgrammarcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cmtgrammarcontroller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getCharacterEncoding()!= null)
		{
			request.setCharacterEncoding("UTF-8");
		}
		
		Connection conn = DBConnection.CreateConnection();
		
		try {
			String cmtgrammarcontent = request.getParameter("cmtgrammarcontent");
			int grammarguidelineid = Integer.parseInt(request.getParameter("grammarguidelineid"));
			int memberid = Integer.parseInt(request.getParameter("memberid"));
			
			Cmtgrammar cmt = new Cmtgrammar();
			cmt.setCmtgrammarcontent(cmtgrammarcontent);
			cmt.setGrammarguidelineid(grammarguidelineid);
			cmt.setMemberid(memberid);
			
			CommentgrammarDAO.Insertcmtgrammar(request, conn, cmt);
//			List<Cmtgrammar> lsDisplaycmtgrammar = CommentgrammarDAO.Displaycmtgrammar(conn, grammarguidelineid);

//			request.setAttribute("listcommentgrammar", lsDisplaycmtgrammar);

			
			RequestDispatcher rd = request.getRequestDispatcher("View/Listcmtgrammarguide.jsp");
//			RequestDispatcher rd = request.getRequestDispatcher("Chitietbaihdnguphapforward?mabaihdnguphap=77");
			rd.forward(request,response);
			
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
