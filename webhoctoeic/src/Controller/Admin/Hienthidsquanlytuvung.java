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

import BEAN.Vocabularyguideline;
import DAO.QuanlyhdtuvungDAO;
import DB.DBConnection;

@WebServlet("/Hienthidsquanlytuvung")
public class Hienthidsquanlytuvung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hienthidsquanlytuvung() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);

		int count = 1;

		if (pageid == 1) {
			
		} else {

			pageid = (pageid - 1) * count + 1;
		}

		Connection conn = DBConnection.CreateConnection();

		int maxpageid = (int) (Math.ceil((double) (QuanlyhdtuvungDAO.Countrow(conn)) / count));

		List<Vocabularyguideline> lsVocab = QuanlyhdtuvungDAO.Hienthidstuvung(request, pageid, count, conn);

		request.setAttribute("lsVocab", lsVocab);
		request.setAttribute("maxpageid", maxpageid);
		request.setAttribute("numberpage", pageidStr);

		RequestDispatcher rd = request.getRequestDispatcher("View/Admin/Dsbaihdtuvung.jsp");
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
