<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách tất cả từ trong chủ đề</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">


<link href="Template/Frontend/css/bootstrap.min.css" rel="stylesheet">
<link href="Template/Frontend/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="Template/Frontend/css/style.css" rel="stylesheet">

<!-- SCRIPT 
    ============================================================-->
<script src="http://code.jquery.com/jquery.js"></script>
<script src="Template/Frontend/js/bootstrap.min.js"></script>
<style type="text/css">
#para10 {
	padding-top: 50px;
}
</style>

<script type="text/javascript">
	function Search() {
		var xhttp;
		var vocabularycontentname = document.myform.vocabularycontentname.value;
		if (vocabularycontentname != "") {

			var url = "SearchVocabController?vocabularycontentname=" + vocabularycontentname;

			if (window.XMLHttpRequest) {
				xhttp = new XMLHttpRequest();

			} else {
				xhttp = new ActiveXObject("Microsoft.XMLHTTP")
			}

			xhttp.onreadystatechange = function() {
				if (xhttp.readyState == 4) {
					var data = xhttp.responseText;
					document.getElementById("searchvocabresult").innerHTML = data;
				}
			}

			xhttp.open("POST", url, true);
			xhttp.send();
		} else {
			document.getElementById("searchvocabresult").innerHTML = "Nhập để tiếp tục tìm kiếm hoặc nhấn Enter để thoát chế độ tìm kiếm";
		}

	}
</script>


</head>
<body>
	<!--HEADER ROW-->
	<jsp:include page="Header.jsp"></jsp:include>
	<!-- /HEADER ROW -->

	<!-- begin search -->
	<div class="container">
		<div class="row">

			<div class="span6">

				<div id="size">
					<form name="myform" method="POST">
						<input type="text" class="form-control" placeholder="Tìm kiếm"
							style="width: 500px" name="vocabularycontentname" onkeyup="Search()">
					</form>
				</div>

			</div>
		</div>
	</div>
	<!-- end search -->
<div class="container" id="searchvocabresult">


<!-- 	<div class="container" id="searchresult"> -->

		<div class="container">
			<!--PAGE TITLE-->

			<div class="row">
				<div class="span12">
					<div class="page-header">
						<h3>Các từ trong: ${vocabularyname}</h3>
						
						 
						<p style="color:red">
								<%=request.getAttribute("msglsVocab")!=null?request.getAttribute("msglsVocab"):" "%> 
							</p>
					</div>
				</div>

			</div>

			<!-- /. PAGE TITLE-->
			<div class="row">
				<c:forEach var="lsVocab" items="${lsVocab}">
					<div class="span6">
						<div class="media">
									 <a href="#" class="pull-left"><img src="Imageaudiohdtuvung/${lsVocab.image}" class="media-object" alt='' width="128px" height="128px"/></a>
									<div class="media-body">
										 
										<p>
											 Từ:<span style="color: blue;">${lsVocab.vocabularycontentname}</span>
										</p>
										<p>
											Phiên âm: <span style="color: red;">${lsVocab.transcribe}</span>
										</p>
										<p>
												<audio controls>
														<source src="Imageaudiohdtuvung/${lsVocab.audiogg}" type="audio/ogg">
														<source src="Imageaudiohdtuvung/${lsVocab.audiomp3}" type="audio/mpeg">
												</audio>
										</p>
										<p>
											Nghĩa và từ loại: ${lsVocab.mean}
										</p>
									</div>
								</div>		
					</div>
				</c:forEach>

			</div>
			<!-- /. PAGE TITLE-->

			<!--Pagination-->
			<div class="pagination">
				<ul>
					<c:if test="${numberpage == 1}">
						<li class="disabled"><a href="#">&laquo; Prev</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage}</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage+1}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage+1}</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage+1}&vocabularyguidelineid=${vocabularyguidelineid}">Next
								&raquo;</a></li>
					</c:if>
					<c:if test="${numberpage == maxpageid}">
						<li><a href="VocabInOneTitle?pageid=${numberpage-1}&vocabularyguidelineid=${vocabularyguidelineid}">&laquo;Prev</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage-1}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage-1}</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage}</a></li>
						<li class="disabled"><a href="#">Next &raquo;</a></li>
					</c:if>

					<c:if test="${numberpage > 1 && numberpage < maxpageid}">
						<li><a href="VocabInOneTitle?pageid=${numberpage-1}&vocabularyguidelineid=${vocabularyguidelineid}">&laquo;Prev</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage-1}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage-1}</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage}</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage+1}&vocabularyguidelineid=${vocabularyguidelineid}">${numberpage+1}</a></li>
						<li><a href="VocabInOneTitle?pageid=${numberpage+1}&vocabularyguidelineid=${vocabularyguidelineid}">Next
								&raquo;</a></li>
					</c:if>
				</ul>
			</div>

			<!--/.Pagination-->

		</div>
		
		<a href="Hienthidshdtuvung?pageid=1" class="pull-left"><p><<< Quay lại trang các chủ đề từ vựng</p> </a>
	</div>	
	
		<div id="para1" >
			<jsp:include page="Footer.jsp"></jsp:include>
		</div>


</body>
</html>