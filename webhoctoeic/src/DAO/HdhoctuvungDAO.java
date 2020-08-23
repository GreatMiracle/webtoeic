package DAO;

import java.sql.*;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import BEAN.Vocabularyguideline;

public class HdhoctuvungDAO {
	static PreparedStatement ptmt = null;
	static ResultSet rs = null;

	
	// hien thi danh sach de thi va phan trang
	public static List<Vocabularyguideline> Hienthidstuvung(HttpServletRequest request, int start, int count,
			Connection conn) {
		List<Vocabularyguideline> list = new ArrayList<Vocabularyguideline>();

		String sql = "select * from vocabularyguideline limit " + (start - 1) + ", " + count + "";
		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Vocabularyguideline vocabularyguideline = new Vocabularyguideline();

					int vocabularyguidelineid = rs.getInt("vocabularyguidelineid");
					String vocabularyname = rs.getString("vocabularyname");
					String vocabularyimage = rs.getString("vocabularyimage");
					int checknoidung = rs.getInt("checknoidung");

					vocabularyguideline.setVocabularyguidelineid(vocabularyguidelineid);
					vocabularyguideline.setVocabularyname(vocabularyname);
					vocabularyguideline.setVocabularyimage(vocabularyimage);
					vocabularyguideline.setChecknoidung(checknoidung);

					list.add(vocabularyguideline);
				}
			} else {
				request.setAttribute("msgdschudetuvung", "Không có tiêu đề bài từ vựng nào");
			}

		} catch (SQLException e) {
			request.setAttribute("msgdschudetuvung", e.getMessage());
		}

		return list;
	}

	// dem so hang cua 1 bang
	public static int Countrow(Connection conn) {
		int count = 0;

		String sql = "select count(*) from vocabularyguideline";

		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			rs.next();

			count = rs.getInt(1);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return count;
	}
}
