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

import BEAN.Readquestion;
import DAO.LambtphandocDAO;
import DB.DBConnection;

@WebServlet("/Lambaidoc")
public class Lambaidoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Lambaidoc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		String pageidStr = request.getParameter("pageid");
		int pageid = Integer.parseInt(pageidStr);
		int readexeriseid = Integer.parseInt(request.getParameter("readexeriseid"));

		int count = 1;

		if (pageid == 1) {

		} else {

			pageid = (pageid - 1) * count + 1;
		}

		try {
			int maxpageid = (int) (Math.ceil((double) (LambtphandocDAO.Demcauhoitheoma(conn, readexeriseid)) / count));

			List<Readquestion> lsAllQuesReading = LambtphandocDAO.Hienthicauhoibtdoc(request, pageid, count, conn,
					readexeriseid);
			String readName = LambtphandocDAO.ReadExName(request, conn, readexeriseid);
			
			request.setAttribute("lsAllQuesReading", lsAllQuesReading);
			request.setAttribute("readName", readName);
			request.setAttribute("readexeriseid", readexeriseid);
			request.setAttribute("maxpageid", maxpageid);
			request.setAttribute("numberpage", pageidStr);

			RequestDispatcher rd = request.getRequestDispatcher("View/Lambtphandoc.jsp");
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

		String readexeriseidstr = request.getParameter("readexeriseid");
		int readexeriseid = Integer.parseInt(readexeriseidstr);

		String numstr = request.getParameter("num");
		int num = Integer.parseInt(numstr);

		if (kq == "") {
			request.setAttribute("msglambt", "Bạn phải trả lời câu hỏi trước khi xem đáp án");

			RequestDispatcher rd = request.getRequestDispatcher("View/Thongbaoloibt.jsp");
			rd.forward(request, response);
		} else {
			List<Readquestion> list = LambtphandocDAO.Xuatdapanbtdoc(request, conn, readexeriseid, num);

			request.setAttribute("dapandungbtdoc", list);
			request.setAttribute("kq", kq);

			RequestDispatcher rd = request.getRequestDispatcher("View/Ketquabtdoc.jsp");
			rd.forward(request, response);
		}

	}

}
