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
import javax.servlet.http.HttpSession;

import BEAN.Member;
import DAO.LoginDAO;
import DAO.RegisterDAO;
import DB.DBConnection;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("View/Login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		
		Member member = new Member();
	
		member.setMembername(request.getParameter("membername"));
		member.setMemberpass(request.getParameter("memberpass"));
		 
		
		String authen = LoginDAO.Authenticationmember(request, conn, member);
		
		int autho = LoginDAO.Authorizationmember(request, conn, member);
		
		String sesName = LoginDAO.Exportnamemember(request, conn, member);
		
		int memberid = LoginDAO.Exportmemberid(request, conn, member);
		
		if (authen.equals("success")) {
			
			if (autho == 1) {
				HttpSession session = request.getSession();
				
				session.setAttribute("sesUser",sesName);
				session.setAttribute("sessionmemberid",memberid);
				
				RequestDispatcher rd = request.getRequestDispatcher("HomeForward");
				rd.forward(request,response);
				
			}else if (autho == 2){
				HttpSession session = request.getSession(true);
				
				session.setAttribute("sesAdmin",sesName);
				
				RequestDispatcher rd = request.getRequestDispatcher("Adminforward");
				rd.forward(request,response);
			}
			
			
		}else {
			if (authen.equals("fail"))
			{
				request.setAttribute("msgregister","Đăng nhập không thành công");
				RequestDispatcher rd = request.getRequestDispatcher("LoginForward");
				rd.forward(request,response);
			}
			
			
			
		}
		
		
	}

}
