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

import BEAN.Listenquestion;
import DAO.QuanlybtngheDAO;
import DB.DBConnection;

@WebServlet("/Lambainghe")
public class Lambainghe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Lambainghe() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);
		int listenexerciseid = Integer.parseInt(request.getParameter("listenexerciseid"));

		int count = 1;

		if (pageid == 1) {

		} else {

			pageid = (pageid - 1) * count + 1;
		}

		try {
			int maxpageid = (int) (Math.ceil((double) (QuanlybtngheDAO.CountrowDetail(conn, listenexerciseid)) / count));

			List<Listenquestion> lsAllQuesListening = QuanlybtngheDAO.DetaiListenQuestions(request, pageid, count, conn, listenexerciseid);
			 
			String listenName = QuanlybtngheDAO.ListenExName(request, conn, listenexerciseid);
			
			request.setAttribute("lsAllQuesListening", lsAllQuesListening);
			request.setAttribute("listenName", listenName);
			request.setAttribute("listenexerciseid", listenexerciseid);
			request.setAttribute("maxpageid", maxpageid);
			request.setAttribute("numberpage", pageidStr);

			RequestDispatcher rd = request.getRequestDispatcher("View/Lambtphannghe.jsp");
			rd.forward(request, response);

			conn.close();

		} catch (SQLException e) {
			request.setAttribute("msglambtphandoc", e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kq = request.getParameter("kq");

		Connection conn = DBConnection.CreateConnection();

		int listenexerciseid = Integer.parseInt(request.getParameter("listenexerciseid"));

		int num = Integer.parseInt(request.getParameter("num"));

		if (kq == "") {
			request.setAttribute("msglambt", "Bạn phải trả lời câu hỏi trước khi xem đáp án");

			RequestDispatcher rd = request.getRequestDispatcher("View/Thongbaoloibt.jsp");
			rd.forward(request, response);
		} else {
			 List<Listenquestion> list = QuanlybtngheDAO.Xuatdapanbtnghe(request, conn, listenexerciseid, num);

			request.setAttribute("dapandungbtnghe", list);
			request.setAttribute("kq", kq);

			RequestDispatcher rd = request.getRequestDispatcher("View/Ketquabtnghe.jsp");
			rd.forward(request, response);
		}

	}

}
