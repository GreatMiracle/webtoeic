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

import BEAN.Listenquestion;
import DAO.QuanlybtngheDAO;
import DB.DBConnection;

@WebServlet("/DetailListening")
public class DetailListening extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailListening() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		int listenexerciseid = Integer.parseInt(request.getParameter("listenexerciseid"));
 

		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);

		int count = 100;

		if (pageid == 1) {
			
		} else {

			pageid = (pageid - 1) * count + 1;
		}

		Connection conn = DBConnection.CreateConnection();

		int maxpageid = (int) (Math.ceil((double) (QuanlybtngheDAO.CountrowDetail(conn, listenexerciseid)) / count));

		List<Listenquestion> detailListening = QuanlybtngheDAO.DetaiListenQuestions(request, pageid, count, conn, listenexerciseid);

		request.setAttribute("detailListening", detailListening);
		request.setAttribute("maxpageid", maxpageid);
		request.setAttribute("numberpage", pageidStr);
		request.setAttribute("listenexerciseid", listenexerciseid);

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/DetailListening.jsp");
		rd.forward(request, response);
		
		try {
			conn.close();

		} catch (SQLException e) {
			request.setAttribute("msgDetailListening", e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
