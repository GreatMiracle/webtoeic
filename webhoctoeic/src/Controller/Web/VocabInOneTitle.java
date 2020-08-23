package Controller.Web;

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

import BEAN.Vocabularycontent;
import DAO.QuanlyhdtuvungDAO;
import DAO.SearchDAO;
import DB.DBConnection;

@WebServlet("/VocabInOneTitle")
public class VocabInOneTitle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VocabInOneTitle() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int vocabularyguidelineid = Integer.parseInt(request.getParameter("vocabularyguidelineid"));
		 

		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}
		
		String nameSearch = request.getParameter("searchvocabresult");

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);

		int count = 3;

		if (pageid == 1) {
			
		} else {

			pageid = (pageid - 1) * count + 1;
		}

		Connection conn = DBConnection.CreateConnection();

		int maxpageid = (int) (Math.ceil((double) (QuanlyhdtuvungDAO.CountrowInTitle(conn, vocabularyguidelineid)) / count));

		List<Vocabularycontent> lsVocab =QuanlyhdtuvungDAO.Hienthidschitiettuvung(request, pageid, count, conn, vocabularyguidelineid);

		String vocabularyname = QuanlyhdtuvungDAO.VocabularyName(conn, vocabularyguidelineid);
		
		
		
		request.setAttribute("lsVocab", lsVocab);
		request.setAttribute("vocabularyname", vocabularyname);
		
		request.setAttribute("maxpageid", maxpageid);
		request.setAttribute("numberpage", pageidStr);
		request.setAttribute("vocabularyguidelineid", vocabularyguidelineid);

		RequestDispatcher rd = request.getRequestDispatcher("View/VocabInOneTitle.jsp");
		rd.forward(request, response);
		
		try {
			conn.close();

		} catch (SQLException e) {
			request.setAttribute("msglsVocab", e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
