package Controller.Web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Member;
import DAO.RegisterDAO;
import DB.DBConnection;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		
		Member member = new Member();
		member.setName(request.getParameter("name"));
		member.setMembername(request.getParameter("membername"));
		member.setMemberpass(request.getParameter("memberpass"));
		
		
		boolean Reg = RegisterDAO.InsertAccount(request, conn, member);
		
		if (Reg) {
			request.setAttribute("msgregister","Đăng ký thành công");
			RequestDispatcher rd = request.getRequestDispatcher("LoginController");
			rd.forward(request,response);
		}else {
			request.setAttribute("msgregister","Đăng ký không thành công");
			RequestDispatcher rd = request.getRequestDispatcher("LoginController");
			rd.forward(request,response);
		}
		
		
	}

}
