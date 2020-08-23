package Controller.Web;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Examination;
import DAO.BaihdnguphapDAO;
import DAO.LambaithiDAO;
import DB.DBConnection;

@WebServlet("/Hienthidsdethi")
public class Hienthidsdethi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hienthidsdethi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection conn = DBConnection.CreateConnection();

		int pageid = Integer.parseInt(request.getParameter("pageid"));

		int count = 2;

		if (pageid == 1) {

		} else {

			pageid = (pageid - 1) * count + 1;
		}

		List<Examination> listTest = LambaithiDAO.Hienthidsdethi(request, pageid, count, conn);
		int maxpageid = (int) (Math.ceil((double) (LambaithiDAO.Countrow(conn)) / count));

		request.setAttribute("listTest", listTest);
		request.setAttribute("maxpageid", maxpageid);
		request.setAttribute("numberpage", Integer.parseInt(request.getParameter("pageid")));

		
		RequestDispatcher rd = request.getRequestDispatcher("View/Dsdethitoeic.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
