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

import BEAN.Cmtgrammar;
import DAO.BaihdnguphapDAO;
import DAO.CommentgrammarDAO;
import DAO.GrammarguidelinemanageDAO;
import DB.DBConnection;

@WebServlet("/Chitietbaihdnguphapforward")
public class Chitietbaihdnguphapforward extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Chitietbaihdnguphapforward() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int mabaihdnguphap = Integer.parseInt(request.getParameter("mabaihdnguphap"));
		
		Connection conn = DBConnection.CreateConnection();

		try {
			String ImgStr = BaihdnguphapDAO.ImageName(request, conn, mabaihdnguphap);

			String GmglName = BaihdnguphapDAO.GmglName(request, conn, mabaihdnguphap);
			String contentDetail = GrammarguidelinemanageDAO.Retrievecontentgrammarguideline(request, conn, mabaihdnguphap);

			request.setAttribute("mabaihdnguphap", mabaihdnguphap);
			request.setAttribute("GmglNameTitle", GmglName);
			request.setAttribute("ImgGmgl", ImgStr);
			request.setAttribute("contentDetail", contentDetail);


			request.setAttribute("kitutrongdatabase", "\n");
			request.setAttribute("kitutronghtml", "<br/>");

			int countCmt = CommentgrammarDAO.Countrow(conn, mabaihdnguphap);
			request.setAttribute("countCmt", countCmt);
			
			List<Cmtgrammar> list = BaihdnguphapDAO.Displaycmtgrammar(conn, mabaihdnguphap);			
			request.setAttribute("listcommentgrammar",list);
			
			RequestDispatcher rd = request.getRequestDispatcher("View/Chitietbaihdnguphap.jsp");
			rd.forward(request, response);
			
			conn.close();
		} catch (SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
