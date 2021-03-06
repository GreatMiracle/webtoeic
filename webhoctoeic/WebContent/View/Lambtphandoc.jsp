<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Làm bài đọc</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">




<link href="Template/Frontend/css/bootstrap.min.css" rel="stylesheet">
<link href="Template/Frontend/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="Template/Frontend/css/style.css" rel="stylesheet">


<link rel="stylesheet" type="text/css" href="JqueryPaging/css/style.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="JqueryPaging/css/mystyle1.css" media="screen" />

<!-- SCRIPT 
    ============================================================-->
<script src="http://code.jquery.com/jquery.js"></script>
<script src="Template/Frontend/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function Xuatketqua() {

		var xhttp;
		var kq = document.myform.radio.value;

		var url = "Lambaidoc?kq=" + kq + "&num="
				+
<%=request.getAttribute("numberpage")%>
	+ "&readexeriseid="
				+
<%=request.getAttribute("readexeriseid")%>
	;

		if (window.XMLHttpRequest) {
			xhttp = new XMLHttpRequest();
		}

		xhttp.onreadystatechange = function() {
			if (xhttp.readyState == 4) {
				var data = xhttp.responseText;
				document.getElementById("ketqualambtdoc").innerHTML = data;
			}

		}

		xhttp.open("POST", url, true);
		xhttp.send();
	}
</script>


</head>

<body>

	<!--HEADER ROW-->
	<jsp:include page="Header.jsp"></jsp:include>

	<!-- /HEADER ROW -->

	<div class="container">

		<!--PAGE TITLE-->

		<div class="row">
			<div>
				<!-- 				<div class="page-header" style="display: flex;"> -->
				<div class="span8" style="display: flex;">
					<img src="Template/Image/reading.jpg" alt=""
						style="width: 65px; height: 50px;" />
					<h1>
						<c:out value="${readName}" />
						:
					</h1>
					<div class="span4" style="position: absolute; right: 0px;">
						<!-- START COUNTDOWN -->


					</div>
				</div>

			</div>
		</div>

		<!-- /. PAGE TITLE-->

		<br />

		<div class="row">
			<div class="span12">
				<ul class="thumbnails">
					<li class="span12">
						<div class="thumbnail">
							<form name="myform" id="ketqualambtdoc">
								<c:forEach items="${lsAllQuesReading}" var="list">
									<p>
										${list.paragraph}
									</p>
									
									<p>
										<b>Câu ${list.num}. ${list.question}</b>
									</p>
									<p>
										<input type="radio" name="radio" value="A" /> ${list.option1}
									</p>
									<p>
										<input type="radio" name="radio" value="B" /> ${list.option2}
									</p>
									<p>
										<input type="radio" name="radio" value="C" /> ${list.option3}
									</p>
									<p>
										<input type="radio" name="radio" value="D" /> ${list.option4}
									</p>
								</c:forEach>
							</form>
						</div>
					</li>
				</ul>
			</div>
		</div>


		<!--Pagination-->
		<div class="pagination">
			<ul class="pagination">
				<c:if test="${numberpage == 1}">
						<li class="disabled"><a href="#">&laquo; Prev</a></li>
						<li><input type="button" value="Đáp án" class="btn btn-info"
						onclick="Xuatketqua()" /></li>
						<a href = "Lambtdoc?pageid=${numberpage}&readexeriseid=<%=request.getAttribute("readexeriseid")%>" class="btn btn-info">Làm lại</a>
						<li><a href="Lambaidoc?pageid=${numberpage+1}&readexeriseid=${readexeriseid}">Next
								&raquo;</a></li>
								
					</c:if>
					<c:if test="${numberpage == maxpageid}">
						<li><a href="Lambaidoc?pageid=${numberpage-1}&readexeriseid=${readexeriseid}">&laquo;Prev</a></li>
						<li class="disabled"><a href="#">Next &raquo;</a></li>
						<input type="button" value="Đáp án" class="btn btn-info"
						onclick="Xuatketqua()" />
						<a href = "Lambaidoc?pageid=${numberpage}&readexeriseid=<%=request.getAttribute("readexeriseid")%>" class="btn btn-info">Làm lại</a>
					</c:if>


				<c:if test="${numberpage > 1 && numberpage < maxpageid}">
					<li><a href="Lambaidoc?pageid=${numberpage-1}&readexeriseid=${readexeriseid}">Prev</a></li>
					<li><a href="Lambaidoc?pageid=${numberpage+1}&readexeriseid=${readexeriseid}">Next</a></li>
					<input type="button" value="Đáp án" class="btn btn-info"
						onclick="Xuatketqua()" />
						<a href = "Lambaidoc?pageid=${numberpage}&readexeriseid=<%=request.getAttribute("readexeriseid")%>" class="btn btn-info">Làm lại</a>
				</c:if>
			</ul>
		</div>

		<!--/.Pagination-->


	</div>


	<div class="hr-divider"></div>


	<!--Footer
==========================-->

	<jsp:include page="Footer.jsp"></jsp:include>


</body>
</html>