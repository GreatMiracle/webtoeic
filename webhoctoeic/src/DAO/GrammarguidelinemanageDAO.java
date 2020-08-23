package DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import BEAN.Grammarguideline;

public class GrammarguidelinemanageDAO {
	static PreparedStatement ptmt = null;
	static ResultSet rs = null;

	public static List<Grammarguideline> Displaysgrammarguidelinemanage(HttpServletRequest request,int start, int count, Connection conn) {

		List<Grammarguideline> list = new ArrayList<Grammarguideline>();

		String sql = "select * from grammarguideline limit " + (start - 1) + ", " + count + "";

		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Grammarguideline gmgl = new Grammarguideline();

					gmgl.setGrammarguidelineid(rs.getInt("grammarguidelineid"));
					gmgl.setGrammarname(rs.getString("grammarname"));
					gmgl.setGrammarimage(rs.getString("grammarimage"));
					gmgl.setContent(rs.getString("content"));

					list.add(gmgl);

				}
			} else {
				request.setAttribute("msglistgrammarguidelinemanage", "Không có bài hướng dẫn nào trong danh sách");
			}

		} catch (SQLException e) {

			request.setAttribute("msglistgrammarguidelinemanage", e.getMessage());
		}

		return list;
	}

	public static List<Grammarguideline> Displaysgrammarguidelinemanage1(HttpServletRequest request, Connection conn) {
		List<Grammarguideline> lsGrammarguidelines = new ArrayList<Grammarguideline>();

		String sql = "select * from grammarguideline";

		try {
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Grammarguideline gmgl = new Grammarguideline();

					gmgl.setGrammarguidelineid(rs.getInt("grammarguidelineid"));
					gmgl.setGrammarname(rs.getString("grammarname"));
					gmgl.setGrammarimage(rs.getString("grammarimage"));
					gmgl.setContent(rs.getString("content"));

					lsGrammarguidelines.add(gmgl);

				}
			} else {
				request.setAttribute("msglistgrammarguidelinemanage", "Không có bài hướng dẫn nào trong danh sách");
			}
		} catch (SQLException e) {
			request.setAttribute("msglistgrammarguidelinemanage", e.getMessage());
		}

		return lsGrammarguidelines;

	}

	public static boolean Insertgrammarguidelinename(HttpServletRequest request, Connection conn,
			Grammarguideline gmgl) {

		String sql = "insert into grammarguideline(grammarname) values (?)";

		try {
			ptmt = conn.prepareStatement(sql);

			ptmt.setString(1, gmgl.getGrammarname());

			int kt = ptmt.executeUpdate();

			if (kt != 0) {
				return true;
			}

			ptmt.close();
		} catch (SQLException e) {
			request.setAttribute("msglistgrammarguidelinemanage", e.getMessage());
		}

		return false;

	}

	// xuat id cua bai huong dan ngu phap
	public static int Retrieveidgrammarguideline(HttpServletRequest request, Connection conn, Grammarguideline gmgl) {
		int grammarguidelineid = 0;

		String sql = "select grammarguidelineid from grammarguideline where grammarname='" + gmgl.getGrammarname()
				+ "'";

		try {
			ptmt = conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				grammarguidelineid = rs.getInt("grammarguidelineid");
			}

			ptmt.close();
			rs.close();
		} catch (SQLException e) {
			request.setAttribute("msgrammarguidelineimage", e.getMessage());
		}

		return grammarguidelineid;
	}

	public static String Uploadimagegrammerguideline(HttpServletRequest request, HttpServletResponse response,
			Connection conn, int grammarguidelineid) {
		String testUpload = "";

//			final String address = "F:\\testUploadFile"; 

		ServletContext context = request.getServletContext();
		response.setContentType("text/html; charset=UTF-8");

		final String Address = context.getRealPath("Imageupload/");

		final int MaxMemorySize = 1024 * 1024 * 3; // 3MB
		final int MaxRequestSize = 1024 * 1024 * 50; // 50 MB

		// Check that we have a file upload request
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (!isMultipart) {
			testUpload = "Thiếu multipart/form-data trong form";
		}

		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Set factory constraints
		factory.setSizeThreshold(MaxMemorySize);

		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Set overall request size constraint
		upload.setSizeMax(MaxRequestSize);

		try {
			// Parse the request
			List<FileItem> items = upload.parseRequest(request);

			// Process the uploaded items
			Iterator<FileItem> iter = items.iterator();

			while (iter.hasNext()) {
				FileItem item = iter.next();

				if (!item.isFormField()) {
					String fileName = item.getName();

					// pathFile: vị trí mà chúng ta muốn upload file vào
					// gửi cho server

					String pathFile = Address + File.separator + fileName;

					File uploadedFile = new File(pathFile);

					boolean kt = uploadedFile.exists();

					try {

						if (kt == true) {

							testUpload = "Tên file tồn tại. Yêu cầu đổi tên file";

						} else {
							item.write(uploadedFile);
							GrammarguidelinemanageDAO.Insertgrammarimage(request, conn, fileName, grammarguidelineid);
							testUpload = "Success";
						}

					} catch (Exception e) {
						testUpload = e.getMessage();
					}
				} else {
					testUpload = "thêm file thất bại";
				}
			}

		} catch (FileUploadException e) {
			testUpload = e.getMessage();
		}

		return testUpload;
	}

	// update ten hinh cho bai huong dan dua theo id cua bai huong dan
	public static void Insertgrammarimage(HttpServletRequest request, Connection conn, String image,
			int grammarguidelineid) {
		String sql = "update grammarguideline set grammarimage=? where grammarguidelineid=" + grammarguidelineid;

		try {
			ptmt = conn.prepareStatement(sql);

			ptmt.setString(1, image);
			ptmt.executeUpdate();

			ptmt.close();
		} catch (SQLException e) {
			request.setAttribute("msglistgrammarguidelinemanage", e.getMessage());
		}

	}

	// them noi dung vao bai huong dan
	public static boolean Insertgrammarguidelinecontent(HttpServletRequest request, Connection conn, int id,
			Grammarguideline gmgl) {

		String sql = "update grammarguideline set content=? where grammarguidelineid=" + id;

		try {
			ptmt = conn.prepareStatement(sql);

			String content = gmgl.getContent();

			ptmt.setString(1, content);

			int kt = ptmt.executeUpdate();

			if (kt != 0) {
				return true;
			}

			ptmt.close();
		} catch (SQLException e) {
			request.setAttribute("msggrammarguidelinecontent", e.getMessage());
		}

		return false;
	}

	// xoa bai huong dan
	public static void Xoabaihdnguphap(Connection conn, int grammarguidelineid) {
		String sql = "delete from grammarguideline where grammarguidelineid=" + grammarguidelineid;
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);

			ptmt.executeUpdate();

			ptmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// xoa ma bai huong dan trong cmtgrammar
	public static void Xoamahdnguphaptrongcmtgrammar(Connection conn, int grammarguidelineid) {
		String sql = "delete from cmtgrammar where grammarguidelineid=" + grammarguidelineid;
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);

			ptmt.executeUpdate();

			ptmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	// xuat id cua bai huong dan ngu phap
		public static String Retrievecontentgrammarguideline(HttpServletRequest request, Connection conn, int  id) {
			String contentStr = ""; 
 
			String sql = "select content from grammarguideline where grammarguidelineid='" + id+ "'";

			try {
				ptmt = conn.prepareStatement(sql);

				rs = ptmt.executeQuery();

				while (rs.next()) {
					contentStr = rs.getString("content");
				}

				ptmt.close();
				rs.close();
			} catch (SQLException e) {
				request.setAttribute("msgrammarguidelineimage", e.getMessage());
			}

			return contentStr;
		}
}
