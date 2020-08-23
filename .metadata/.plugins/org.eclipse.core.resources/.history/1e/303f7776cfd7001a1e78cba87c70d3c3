<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<% 
		
			if (request.getAttribute("msg_notFind")!=null)
			{
		%>
			<div class="row">
				<div class="span6">			
								<div class="media" style="color: red;">
									<%=request.getAttribute("msg_notFind") %>
								</div>
				</div>
			</div>
		<%
		}
		else
		{
		%>
		
		
		<div class="row">
			<c:forEach var="searchVocab" items="${searchVocab}">
				<div class="span6">
					<div class="media">
						<a href="#" class="pull-left"><img
							src="Imageaudiohdtuvung/${searchVocab.image}" class="media-object"
							alt='' width="128px" height="128px" /></a>
						<div class="media-body">

							<p>Từ: ${searchVocab.vocabularycontentname}</p>
							<p>Phiên âm: ${searchVocab.transcribe}</p>
							<p>
								<audio controls>
									<source src="Imageaudiohdtuvung/${searchVocab.audiogg}"
										type="audio/ogg">
									<source src="Imageaudiohdtuvung/${searchVocab.audiomp3}"
										type="audio/mpeg">
								</audio>
							</p>
							<p>Nghĩa và từ loại: ${searchVocab.mean}</p>

						</div>
					</div>
				</div>
			</c:forEach>

		</div>
		
		<%
			}
		%>

</body>
</html>