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
import BEAN.Vocabularyguideline;
import DAO.GrammarguidelinemanageDAO;
import DAO.QuanlyhdtuvungDAO;
import DB.DBConnection;

/**
 * Servlet implementation class Themchudetuvung
 */
@WebServlet("/Themchudetuvung")
public class Themchudetuvung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Themchudetuvung() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();		

		try {
			Vocabularyguideline vocab = new Vocabularyguideline();
			vocab.setVocabularyname(request.getParameter("vocabularyname"));
			
			
			
			boolean kt = QuanlyhdtuvungDAO.Themtenchudetuvung(request, conn, vocab);
			if (kt) {
				
				int vocabId = QuanlyhdtuvungDAO.Xuatmachudetuvung(request, conn, vocab);
				request.setAttribute("vocabularyguidelineid", vocabId);
				
				RequestDispatcher rd = request.getRequestDispatcher("View/Admin/themhinhchudetuvung.jsp");
				rd.forward(request,response);
				
			}else
			{
				request.setAttribute("msgdstuvung","Thêm chủ đề không thành công");
				RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlytuvung?pageid=1");
				rd.forward(request,response);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			
			request.setAttribute("msgdstuvung",e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsquanlytuvung?pageid=1");
			rd.forward(request,response);
		}
	 
	}

}
