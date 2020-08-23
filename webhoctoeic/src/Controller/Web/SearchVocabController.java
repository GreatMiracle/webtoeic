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

import BEAN.Grammarguideline;
import BEAN.Vocabularycontent;
import DAO.SearchDAO;
import DB.DBConnection;

@WebServlet("/SearchVocabController")
public class SearchVocabController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchVocabController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		String nameSearch = request.getParameter("vocabularycontentname");

		List<Vocabularycontent> searchVocab = SearchDAO.DisplayVocabresult(request, conn, nameSearch);
		request.setAttribute("searchVocab", searchVocab);

		RequestDispatcher rd = request.getRequestDispatcher("View/SearchVocab.jsp");
		rd.forward(request, response);
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
