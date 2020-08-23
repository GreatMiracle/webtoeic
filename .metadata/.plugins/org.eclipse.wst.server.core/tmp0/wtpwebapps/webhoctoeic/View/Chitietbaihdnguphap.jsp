<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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

<script type="text/javascript">
function Binhluan()
{
	var xhttp;
	
	var cmtgrammarcontent = document.formbinhluan.cmtgrammarcontent.value;
	var memberid = "<%=session.getAttribute("sessionmemberid")%>";
	var grammarguidelineid = "<%=request.getAttribute("mabaihdnguphap")%>";
	
	var url = "Cmtgrammarcontroller?cmtgrammarcontent=" + cmtgrammarcontent + "&memberid=" + memberid + "&grammarguidelineid=" + grammarguidelineid;
		if (window.XMLHttpRequest) {
			xhttp = new XMLHttpRequest();
		} else {
			xhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		xhttp.onreadystatechange = function() {
			if (xhttp.readyState == 4) {
				var data = xhttp.responseText;
				document.getElementById("listcomment").innerHTML = data;
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

		<div class="row">

			<div class="span9">
				<!--Blog Post-->
				<div class="blog-post">
					<h2>
						<c:out value="${GmglNameTitle}" />
					</h2>

					<div class="postmetadata">
						<ul>
							<li><i class="icon-user"></i> <a href="#">Nguyễn Trung
									Kiên</a></li>

							<li><i class="icon-calendar"></i>September 16th, 1998</li>

							<li><i class="icon-comment"></i><a href="#"><c:out value="${countCmt}" />
									Comments</a></li>
							<li><i class="icon-tags"></i> <a href="#">Themes</a>, <a
								href="#">Template</a></li>
						</ul>
					</div>

					<img src="Imageupload/<c:out value="${ImgGmgl}"/>" width="800px"
						height="400px" />
						
					<p>
						<c:set var="contentAfterReplace"
							value="${fn:replace(contentDetail,kitutrongdatabase,kitutronghtml)}" />
						<c:out value="${contentAfterReplace}" escapeXml="false" />
					</p>
					
				</div>
				<!--/.Blog Post-->

				<!--Comments-->

				<h2>Comments</h2>

				<div class="comments">
<div class="reading_description" style="overflow: auto; height: 400px" >
					<div id="listcomment">

						<c:forEach var="lsCmt" items="${listcommentgrammar}">
							<div class="media">
								<a href="#" class="pull-left"><img
									src="Template/Frontend/img/img-60x60.jpg" class="media-object"
									alt='' /></a>
								<div class="media-body">
									<h4 class="media-heading">${lsCmt.name}</h4>
										<p style="background-color: powderblue; height: 50px" 
  								class="input-xxlarge">${lsCmt.cmtgrammarcontent}</p>
																		
								</div>
							</div>
						</c:forEach>
					</div>
</div>
					<!--Post Comments-->
					
				  	<h2>Post Comments</h2>
					<c:if test="${not empty sesUser}">
						
						<form name="formbinhluan">
							<textarea class="span8" rows="10" name="cmtgrammarcontent"
								placeholder="Comment...">
					 
					 </textarea>
							<button type="submit" class="btn btn-large btn-primary"
								onclick="Binhluan()">Đăng Bình Luận</button>
<!-- 						<input type="submit" class="btn btn-large btn-primary"  -->
<!--  								onclick="Binhluan()" value="Đăng Bình Luận"/> -->


						</form>
					</c:if>

					<c:if test="${empty sesUser}">

						<form>
							<textarea class="span8" rows="10" placeholder="" disabled
								style="color: red">
							 	Hãy đăng nhập để comment!
							 </textarea>
							<button type="submit" class="btn btn-large btn-danger"
								disabled="disabled">Đăng Bình Luận</button>

						</form>
					</c:if>
					<!--/.Post Comments-->

				</div>

				<!--/.Comments-->

			</div>



			<div class="span3">
				<div class="side-bar">

					<h3>Categories</h3>
					<ul class="nav nav-list">
						<li><a href="#">Web Design</a></li>
						<li><a href="#">Typography</a></li>
						<li><a href="#">Inspiration</a></li>
						<li><a href="#">Business</a></li>
					</ul>

				</div>


				<div class="side-bar">
					<h3>Tags</h3>

					<a href="#">cras</a>, <a href="#">sit</a>, <a href="#">amet</a>, <a
						href="#">nibh</a>, <a href="#">libero</a>, <a href="#">gravida</a>,
					<a href="#">nulla</a>
				</div>


				<div class="side-bar">
					<h3>Recent Post</h3>

					<ul class="recent-post">
						<li><a href=""><strong>The standard chunk of
									Lorem Ipsum used since </strong></a> <small><i class="icon-user"></i>
								<a href="#">Author Name</a>, <i class="icon-calendar"></i>Jul
								20th, 2013</small></li>

						<li><a href=""><strong>The standard chunk of
									Lorem Ipsum used since </strong></a> <small><i class="icon-user"></i>
								<a href="#">Author Name</a>, <i class="icon-calendar"></i>Jul
								20th, 2013</small></li>

						<li><a href=""><strong>The standard chunk of
									Lorem Ipsum used since </strong></a> <small><i class="icon-user"></i>
								<a href="#">Author Name</a>, <i class="icon-calendar"></i>Jul
								20th, 2013</small></li>


					</ul>






				</div>


			</div>


			<!--==================-->
		</div>
	</div>





	<!--Footer
==========================-->

	<div id="para1">
		<jsp:include page="Footer.jsp"></jsp:include>
	</div>
	<!--/.Footer-->
</body>
</html>