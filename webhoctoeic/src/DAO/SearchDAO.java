package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import BEAN.Grammarguideline;
import BEAN.Vocabularycontent;

public class SearchDAO {
	static PreparedStatement ptmt = null;
	static ResultSet rs = null;
	
	public static  List<Grammarguideline> Displayresult (HttpServletRequest request, Connection conn, String nameSearch) {
		List<Grammarguideline> lsGrammarguidelines = new ArrayList<Grammarguideline>();
		
		String sql = "select * from grammarguideline where grammarname like '%"+nameSearch+"%'";
		
		try {
			ptmt = conn.prepareStatement(sql);
			
			rs = ptmt.executeQuery();
			
			if (!rs.isBeforeFirst()) {
				request.setAttribute("msg_notFind", "Không tìm thấy kết quả nào!");
			} else {
				while (rs.next()) {
					Grammarguideline gmgl = new Grammarguideline();

					gmgl.setGrammarguidelineid(rs.getInt("grammarguidelineid"));
					gmgl.setGrammarname(rs.getString("grammarname"));
					gmgl.setGrammarimage(rs.getString("grammarimage"));
					gmgl.setContent(rs.getString("content"));

					lsGrammarguidelines.add(gmgl);
					
				}
			}
						
		} catch (SQLException e) {
			
			request.setAttribute("msg_notFind", e.getMessage());
		}
		
		return lsGrammarguidelines;
		
	}
	
	public static  List<Vocabularycontent> DisplayVocabresult (HttpServletRequest request, Connection conn, String nameSearch) {
		List<Vocabularycontent> Vocabularycontent = new ArrayList<Vocabularycontent>();
		
		String sql = "select * from vocabularycontent where vocabularycontentname like '%"+nameSearch+"%'";
		
		try {
			ptmt = conn.prepareStatement(sql);
			
			rs = ptmt.executeQuery();
			
			if (!rs.isBeforeFirst()) {
				request.setAttribute("msg_notFind", "Không tìm thấy kết quả nào!");
			} else {
				while (rs.next()) {
					Vocabularycontent vocabContent = new Vocabularycontent();

					int num = rs.getInt("num");
					String vocabularycontentname = rs.getString("vocabularycontentname");
					String transcribe = rs.getString("transcribe");
					String image = rs.getString("image");
					String audiomp3 = rs.getString("audiomp3");
					String audiogg = rs.getString("audiogg");
					String mean = rs.getString("mean");

					vocabContent.setNum(num);
					vocabContent.setVocabularycontentname(vocabularycontentname);
					vocabContent.setTranscribe(transcribe);
					vocabContent.setImage(image);
					vocabContent.setAudiomp3(audiomp3);
					vocabContent.setAudiogg(audiogg);
					vocabContent.setMean(mean);

					Vocabularycontent.add(vocabContent);
				}
			}
						
		} catch (SQLException e) {
			
			request.setAttribute("msg_notFind", e.getMessage());
		}
		
		return Vocabularycontent;
		
	}
}
