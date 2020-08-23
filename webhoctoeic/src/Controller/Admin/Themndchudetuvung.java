package Controller.Admin;

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
import DAO.QuanlydethiDAO;
import DAO.QuanlyhdtuvungDAO;
import DB.DBConnection;

@WebServlet("/Themndchudetuvung")
public class Themndchudetuvung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Themndchudetuvung() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("vocabularyguidelineid", request.getParameter("vocabularyguidelineid"));

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themndchudetuvung.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		try {
			
			int vocabularyguidelineid = Integer.parseInt(request.getParameter("vocabularyguidelineid"));

			String testUpload = QuanlyhdtuvungDAO.Uploadndchudetuvung(request, response, conn, vocabularyguidelineid);

			if (testUpload.equals("Success")) {
				
				QuanlyhdtuvungDAO.Kiemtrandchudetuvung(request, conn, 1, vocabularyguidelineid);
				
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlytuvung?pageid=1");
				rd.forward(request, response);

			} else {

				request.setAttribute("msgUpLoadVocabContent", testUpload);
				request.setAttribute("vocabularyguidelineid", vocabularyguidelineid);

				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Themndchudetuvung.jsp");
				rd.forward(request, response);  
			}
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
