package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import BEAN.Cmtgrammar;
import BEAN.Grammarguideline;

public class BaihdnguphapDAO {
	static PreparedStatement ptmt = null;
	static ResultSet rs = null;

	public static List<Grammarguideline> Displaygrammarguideline(int start, int count, Connection conn) {

		List<Grammarguideline> list = new ArrayList<Grammarguideline>();

		String sql = "select * from grammarguideline limit " + (start - 1) + ", " + count + "";

		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			while (rs.next()) {
				Grammarguideline grammarguideline = new Grammarguideline();

				int grammarguidelineid = rs.getInt("grammarguidelineid");
				String grammarname = rs.getString("grammarname");
				String grammarimage = rs.getString("grammarimage");

				grammarguideline.setGrammarguidelineid(grammarguidelineid);
				grammarguideline.setGrammarname(grammarname);
				grammarguideline.setGrammarimage(grammarimage);

				list.add(grammarguideline);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

	public static int Countrow(Connection conn) {
		int count = 0;

		String sql = "select count(*) from grammarguideline";

		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			rs.next();

			count = rs.getInt(1);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return count;
	}

	// xuat ảnh theo id cua bai huong dan ngu phap
	public static String ImageName(HttpServletRequest request, Connection conn, int id) {
		String ImgStr = "";

		String sql = "select grammarimage from grammarguideline where grammarguidelineid='" + id + "'";

		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			while (rs.next()) {
				ImgStr = rs.getString("grammarimage");
			}

			ptmt.close();
			rs.close();
		} catch (SQLException e) {
			request.setAttribute("msgrammarguidelineimage", e.getMessage());
		}

		return ImgStr;
	}

	// xuat tên theo id cua bai huong dan ngu phap
	public static String GmglName(HttpServletRequest request, Connection conn, int id) {
		String GmglName = "";

		String sql = "select grammarname from grammarguideline where grammarguidelineid='" + id + "'";

		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			while (rs.next()) {
				GmglName = rs.getString("grammarname");
			}

			ptmt.close();
			rs.close();
		} catch (SQLException e) {
			request.setAttribute("msgrammarguidelineimage", e.getMessage());
		}

		return GmglName;
	}
	
	public static List<Cmtgrammar> Displaycmtgrammar (Connection conn, int grammarguidelineid)
	{
		List<Cmtgrammar> list = new ArrayList<Cmtgrammar>();
		
		String sql = "select * from cmtgrammar where grammarguidelineid="+grammarguidelineid;
		try 
		{
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ResultSet rs = ptmt.executeQuery();
			
			
			while (rs.next())
			{
				Cmtgrammar cmt = new Cmtgrammar();
				int memberid = rs.getInt("memberid");
				String cmtgrammarcontent = rs.getString("cmtgrammarcontent");
				
				String name = CommentgrammarDAO.Namemember(conn,memberid);
				
				
				cmt.setCmtgrammarcontent(cmtgrammarcontent);
				cmt.setName(name);
				
				list.add(cmt);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return list;
	}

}
