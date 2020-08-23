package Controller.Web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BEAN.Answeruser;
import BEAN.Examinationquestion;
import BEAN.Result;
import DAO.LambaithiDAO;
import DB.DBConnection;

@WebServlet("/Lambaithitoeic")
public class Lambaithitoeic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Lambaithitoeic() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();

		String examinationidstr = request.getParameter("examinationid");
		int examinationid = Integer.parseInt(examinationidstr);

		HttpSession session = request.getSession(true);
		if ((session.getAttribute("sesUser")) != null) {

			int memberid = (int) session.getAttribute("sessionmemberid");

			List<Examinationquestion> lsAllQuestion = LambaithiDAO.Hienthicauhoidethi(conn, examinationid);
			int totalQuestion = LambaithiDAO.Demsocauhoidethi(conn, examinationid);
			String nameTest = LambaithiDAO.NameTest(conn, examinationid);

			request.setAttribute("kitutrongdatabase", "\n");
			request.setAttribute("kitutronghtml", "<br/>");

			request.setAttribute("lsAllQuestion", lsAllQuestion);
			request.setAttribute("totalQuestion", totalQuestion);
			request.setAttribute("nameTest", nameTest);
			request.setAttribute("examinationid", examinationidstr);
			request.setAttribute("memberid", memberid);

			RequestDispatcher rd = request.getRequestDispatcher("View/Lambaithitoeic.jsp");
			rd.forward(request, response);
		} else {

			request.setAttribute("msgloidnlambai", "Đăng nhập trước khi làm bài thi");

			RequestDispatcher rd = request.getRequestDispatcher("Hienthidsdethi?pageid=1");
			rd.forward(request, response);
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection conn = DBConnection.CreateConnection();

		int examinationid = Integer.parseInt(request.getParameter("examinationid"));
		int memberid = Integer.parseInt(request.getParameter("memberid"));

		List<Examinationquestion> listcorrectanswer = LambaithiDAO.Xuatdapandungdethi(conn, examinationid);

		int countrow = LambaithiDAO.Demsocauhoidethi(conn, examinationid);

		ArrayList<Answeruser> lsAnswer = new ArrayList<Answeruser>();

		int socaudung = 0;
		int socaudungphannghe=0;
		int socaudungphandoc=0;
		
		for (int i = 1; i <= countrow; i++) {
			String answer = request.getParameter("ans[" + i + "]");

			if (answer != null) {
				Answeruser answeruser = new Answeruser();
				answeruser.setNum(i);
				answeruser.setAnswer(answer);

				lsAnswer.add(answeruser);

				String dapandung = LambaithiDAO.Dapancua1cauhoi(conn, examinationid, i);
				
				// phần nghe: từ câu 1 -> câu 4(chia ra vì cách tính điểm mỗi câu phần nghe khác phần đọc)
				if (i<=4)
				{
					if (answer.equals(dapandung))
					{
						socaudung++;
						socaudungphannghe++;
					}
				}
				// phần đọc: từ câu 5 -> hết(chia ra vì cách tính điểm phần nghe khác phần đọc)
				else 
				{
					if (i>=5)
					{
						if (answer.equals(dapandung))
						{
							socaudung++;
							socaudungphandoc++;
						}
					}
				}

			} else {
				Answeruser au = new Answeruser();
				au.setNum(i);
				au.setAnswer("Không chọn");
				lsAnswer.add(au);
			}

		}

		int socausai = countrow - socaudung;

		Date date = new Date();
		
		String timeTest = date.toString();
		
		Result result = new Result();

		
		result.setCorrectanswernum(socaudung);
		result.setIncorrectanswernum(socausai);
		result.setTime(timeTest);
		result.setExaminationid(examinationid);
		result.setMemberid(memberid);
		result.setCorrectanswerlisten(socaudungphannghe);
		result.setCorrectanswerread(socaudungphandoc);

		LambaithiDAO.Luuketquathi(conn, result);
		
		List<Result> lsResultTest = LambaithiDAO.Xuatketquathi(conn, timeTest, examinationid, memberid);
		int totalQuestion = LambaithiDAO.Demsocauhoidethi(conn, examinationid);
		request.setAttribute("totalQuestion", totalQuestion);
		
		request.setAttribute("listcorrectanswer", listcorrectanswer);
		request.setAttribute("listansweruser", lsAnswer);
		request.setAttribute("ketquathi", lsResultTest);
		
		RequestDispatcher rd = request.getRequestDispatcher("View/Ketquathi.jsp");
		rd.forward(request, response);
	}

}
