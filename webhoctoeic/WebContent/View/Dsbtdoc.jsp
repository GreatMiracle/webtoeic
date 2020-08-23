<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
		var grammarname = document.myform.grammarname.value;
		if (grammarname != "") {

			var url = "SearchController?grammarname=" + grammarname;

			if (window.XMLHttpRequest) {
				xhttp = new XMLHttpRequest();

			} else {
				xhttp = new ActiveXObject("Microsoft.XMLHTTP")
			}

			xhttp.onreadystatechange = function() {
				if (xhttp.readyState == 4) {
					var data = xhttp.responseText;
					document.getElementById("searchresult").innerHTML = data;
				}
			}

			xhttp.open("POST", url, true);
			xhttp.send();
		} else {
			document.getElementById("searchresult").innerHTML = "Nhập để tiếp tục tìm kiếm hoặc nhấn Enter để thoát chế độ tìm kiếm";
		}

	}
</script>


</head>
<body>
	<!--HEADER ROW-->
	<jsp:include page="Header.jsp"></jsp:include>
	<!-- /HEADER ROW -->

	<!-- begin search -->
<!-- 	<div class="container"> -->
<!-- 		<div class="row"> -->

<!-- 			<div class="span6"> -->

<!-- 				<div id="size"> -->
<!-- 					<form name="myform" method="POST"> -->
<!-- 						<input type="text" class="form-control" placeholder="Tìm kiếm" -->
<!-- 							style="width: 500px" name="grammarname" onkeyup="Search()"> -->
<!-- 					</form> -->
<!-- 				</div> -->

<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->	
	<!-- end search -->

	<div class="container" id="searchresult">

		<div class="container">
			<!--PAGE TITLE-->

			<div class="row">
				<div class="span12">
					<div class="page-header">
						<h3>Tổng hợp các bài đọc</h3>
<!-- 						<p style="color:red"> -->
<%-- 								<%=request.getAttribute("msgloidnlambai")!=null?request.getAttribute("msgloidnlambai"):" "%>  --%>
<!-- 							</p> -->
					</div>
				</div>

			</div>

			<!-- /. PAGE TITLE-->
			<div class="row">
				<c:forEach var="list" items="${lsAllExReading}">
					<div class="span6">
						<div class="media">
							<a href="#" class="pull-left"><img
								src="Imageandfilebtdoc/${list.readimage}" class="media-object"
								alt='' width="128px" height="128px" /></a>
							<div class="media-body">

								<p>${list.readname}</p>
								<a
									href="Lambaidoc?pageid=1&readexeriseid=${list.readexeriseid}"
									class="btn">Làm bài đọc</a>
							</div>
						</div>
					</div>
				</c:forEach>

			</div>
			<!-- /. PAGE TITLE-->

			<!--Pagination-->
			<div class="pagination">
				<%-- <ul>
					<c:if test="${numberpage == 1}">
						<li class="disabled"><a href="#">&laquo; Prev</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage}">${numberpage}</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage+1}">${numberpage+1}</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage+1}">Next
								&raquo;</a></li>
					</c:if>
					<c:if test="${numberpage == maxpageid}">
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage-1}">&laquo;Prev</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage-1}">${numberpage-1}</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage}">${numberpage}</a></li>
						<li class="disabled"><a href="#">Next &raquo;</a></li>
					</c:if>

					<c:if test="${numberpage > 1 && numberpage < maxpageid}">
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage-1}">&laquo;Prev</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage-1}">${numberpage-1}</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage}">${numberpage}</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage+1}">${numberpage+1}</a></li>
						<li><a href="Hienthidsbtphandoc?pageid=${numberpage+1}">Next
								&raquo;</a></li>
					</c:if>
				</ul> --%>
				<ul class="pagination">
					<c:if test="${numberpage == 1}">
						<li class="disabled"><a href="#">Prev</a></li>
						<li class="active"><a
							href="Hienthidsbtphandoc?pageid=${numberpage}">${numberpage}</a></li>
						<c:if test="${numberpage == 1 && numberpage < maxpageid}">
							<li><a
								href="Hienthidsbtphandoc?pageid=${numberpage+1}">${numberpage+1}</a></li>
							<li><a
								href="Hienthidsbtphandoc?pageid=${numberpage+1}">Next</a></li>
						</c:if>
						<c:if test="${numberpage == 1 && numberpage == maxpageid}">
							<li class="disabled"><a class="disabled" href="#">Next</a></li>
						</c:if>

					</c:if>

					<c:if test="${numberpage > 1 && numberpage == maxpageid}">
						<li><a
							href="Hienthidsbtphandoc?pageid=${numberpage-1}">Prev</a></li>
							
						<li><a
							href="Hienthidsbtphandoc?pageid=${numberpage-1}">${numberpage-1}</a></li>
						<li class="active"><a
							href="Hienthidsbtphandoc?pageid=${numberpage}">${numberpage}</a></li>
						<li class="disabled"><a href="#">Next</a></li>
					</c:if>

					<c:if test="${numberpage > 1 && numberpage < maxpageid}">
						<li><a
							href="Hienthidsbtphandoc?pageid=${numberpage-1}">Prev</a></li>
						<li><a
							href="Hienthidsbtphandoc?pageid=${numberpage-1}">${numberpage-1}</a></li>
						<li class="active"><a class="active"
							href="Hienthidsbtphandoc?pageid=${numberpage}">${numberpage}</a></li>
						<li><a
							href="Hienthidsbtphandoc?pageid=${numberpage+1}">${numberpage+1}</a></li>
						<li><a
							href="Hienthidsbtphandoc?pageid=${numberpage+1}">Next</a></li>
					</c:if>
				</ul>
			</div>

			<!--/.Pagination-->

		</div>
	
	</div>	
	
		<div id="para1" >
			<jsp:include page="Footer.jsp"></jsp:include>
		</div>


</body>
</html>