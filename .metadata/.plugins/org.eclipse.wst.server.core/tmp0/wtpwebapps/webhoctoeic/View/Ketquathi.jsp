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


<link rel="stylesheet" type="text/css" href="JqueryPaging/css/style.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="JqueryPaging/css/mystyle1.css" media="screen" />

<!-- SCRIPT 
    ============================================================-->
<script src="http://code.jquery.com/jquery.js"></script>
<script src="Template/Frontend/js/bootstrap.min.js"></script>
<script src="Countdown/countdown.js"></script>
<script type="text/javascript">
	function auto_submit() {
		document.form.submit();
	}

	function auto_submit1() {
		setTimeout("auto_submit()", (1000 * 7200));
	}
</script>

</head>

<body onLoad="auto_submit1();">

	<!--HEADER ROW-->

	<jsp:include page="Header.jsp"></jsp:include>
	<!-- /HEADER ROW -->

	<div class="container">

		<!--PAGE TITLE-->

		<div class="row">
			<div>

				<div class="span8" style="display: flex;">
					<img src="Template/Image/ket_qua_01.jpg" alt=""
						style="width: 65px; height: 50px;" />
					<h1>Kết Quả:
					<c:forEach items="${ketquathi}" var = "list">
					 ${list.correctanswernum} / <c:out value="${totalQuestion}"/>
					</c:forEach>
					
					</h1>
					<div class="span4" style="position: absolute; right: 0px;"></div>
				</div>

			</div>
		</div>

		<!-- /. PAGE TITLE-->
		<div class="row">
			<div class="span9">
								<h2 style="color: blue;">Đáp án đề thi:</h2>
				<div class="reading_description"
					style="overflow: auto; height: 500px; border: 1px solid #BDBDBD">


					<c:forEach items="${listcorrectanswer}" var="listcorrectanswer">

						<c:if
							test="${(listcorrectanswer.imagequestion!='')&&(listcorrectanswer.audiogg!='')&&(listcorrectanswer.audiomp3!='')}">
							<img src="Imageaudiodethi/${listcorrectanswer.imagequestion}"
								alt="" style="width: 250px; height: 150px;" />
							<br />
							<br />
							<p>
								<audio controls>
									<source src="Imageaudiodethi/${listcorrectanswer.audiogg}"
										type="audio/ogg">
									<source src="Imageaudiodethi/${listcorrectanswer.audiomp3}"
										type="audio/mpeg">
								</audio>
							</p>

							<c:if test="${listcorrectanswer.correctanswer == 'A'}">

								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án A
									đúng</p>
							</c:if>

							<c:if test="${listcorrectanswer.correctanswer == 'B'}">


								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án B
									đúng</p>


							</c:if>
							<c:if test="${listcorrectanswer.correctanswer == 'C'}">


								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án C
									đúng</p>


							</c:if>
							<c:if test="${listcorrectanswer.correctanswer == 'D'}">


								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án D
									đúng</p>

							</c:if>

						</c:if>

						<c:if
							test="${(listcorrectanswer.imagequestion=='')&&(listcorrectanswer.audiogg!='')&&(listcorrectanswer.audiomp3!='')}">

							<br />
							<br />
							<p>
								<audio controls>
									<source src="Imageaudiodethi/${listcorrectanswer.audiogg}"
										type="audio/ogg">
									<source src="Imageaudiodethi/${listcorrectanswer.audiomp3}"
										type="audio/mpeg">
								</audio>
							</p>

							<c:if test="${listcorrectanswer.correctanswer == 'A'}">

								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án A
									đúng</p>
							</c:if>

							<c:if test="${listcorrectanswer.correctanswer == 'B'}">


								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án B
									đúng</p>


							</c:if>
							<c:if test="${listcorrectanswer.correctanswer == 'C'}">


								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án C
									đúng</p>


							</c:if>
							<c:if test="${listcorrectanswer.correctanswer == 'D'}">


								<p style="color: red">Câu ${listcorrectanswer.num}. Đáp án D
									đúng</p>

							</c:if>

						</c:if>

						<c:if
							test="${(listcorrectanswer.imagequestion=='')&&(listcorrectanswer.audiogg=='')&&(listcorrectanswer.audiomp3=='')}">

							<c:if test="${listcorrectanswer.correctanswer == 'A'}">

								<p>${listcorrectanswer.num}.

									<c:set var="kq"
										value="${fn:replace(listcorrectanswer.paragraph,kitutrongdatabase,kitutronghtml)}" />
									<c:out value="${kq}" escapeXml="false" />
								</p>
								<p>${listcorrectanswer.question}</p>
								<img alt="" src="Image/correct.png"> ${listcorrectanswer.option1}
														<br>
								<br>
														  ${listcorrectanswer.option2}
														<br>
								<br>
														  ${listcorrectanswer.option3}
														<br>
								<br>
														  ${listcorrectanswer.option4}
														<br>
								<br>



							</c:if>

							<c:if test="${listcorrectanswer.correctanswer == 'B'}">



								<p>${listcorrectanswer.num}.
									<c:set var="kq"
										value="${fn:replace(listcorrectanswer.paragraph,kitutrongdatabase,kitutronghtml)}" />
									<c:out value="${kq}" escapeXml="false" />
								</p>
								<p>${listcorrectanswer.question}</p>
																  ${listcorrectanswer.option1}
																<br>
								<br>
								<img alt="" src="Image/correct.png">${listcorrectanswer.option2}
																<br>
								<br>
																  ${listcorrectanswer.option3}
																<br>
								<br>
																  ${listcorrectanswer.option4}
																<br>
								<br>


							</c:if>
							<c:if test="${listcorrectanswer.correctanswer == 'C'}">



								<p>${listcorrectanswer.num}.
									<c:set var="kq"
										value="${fn:replace(listcorrectanswer.paragraph,kitutrongdatabase,kitutronghtml)}" />
									<c:out value="${kq}" escapeXml="false" />
								</p>
								<p>${listcorrectanswer.question}</p>
																  ${listcorrectanswer.option1}
																<br>
								<br>
																  ${listcorrectanswer.option2}
																<br>
								<br>
								<img alt="" src="Image/correct.png">${listcorrectanswer.option3}
																<br>
								<br>
																  ${listcorrectanswer.option4}
																<br>
								<br>



							</c:if>
							<c:if test="${listcorrectanswer.correctanswer == 'D'}">




								<p>${listcorrectanswer.num}.
									<c:set var="kq"
										value="${fn:replace(listcorrectanswer.paragraph,kitutrongdatabase,kitutronghtml)}" />
									<c:out value="${kq}" escapeXml="false" />
								</p>
								<p>${listcorrectanswer.question}</p>
																  ${listcorrectanswer.option1}
																<br>
								<br>
																  ${listcorrectanswer.option2}
																<br>
								<br>
																  ${listcorrectanswer.option3}
																<br>
								<br>
								<img alt="" src="Image/correct.png">${listcorrectanswer.option4}
																<br>
								<br>



							</c:if>

						</c:if>


					</c:forEach>

				</div>
				<br>

			</div>


			
			<div class="span3">
				<h2 style="color: blue;">Đáp án của bạn</h2>
				<div class="thumbnail">
				
					<div class="reading_description"
						style="overflow: auto; height: 400px">
						<c:forEach items="${listansweruser}" var="list">
							<div class="span1">${list.num}.</div>
													
																
													${list.answer}
													
													<br />
						</c:forEach>
					</div>
				</div>
				<br /> <input type="button" class="btn btn-primary"
					value="Chi tiết kết quả thi" data-toggle="modal" data-target="#myModal" />
				<a href="Hienthidsdethi?pageid=1" role="button"
					class="btn btn-primary">Làm lại</a>


			</div>


		</div>

	</div>

	<!--Footer
==========================-->

	<jsp:include page="Footer.jsp"></jsp:include>

	<!--/.Footer-->
 <!-- start Modal -->
		  <div class="modal fade" id="myModal" role="dialog">
		    <div class="modal-dialog">
		    
		      <!-- Modal content-->
		      <div class="modal-content">
		        <div class="modal-header">
		          <button type="button" class="close" data-dismiss="modal">&times;</button>
		          <h4 class="modal-title">Kết quả thi của người dùng</h4>
		        </div>
		        <div class="modal-body">
	         			
	         		<c:forEach items="${ketquathi}" var = "list">
						<div class="media">
							
							<div class="media-body">
								<h4>
									Số câu đúng: ${list.correctanswernum}
									<br/>
										- Số câu đúng phần nghe: ${list.correctanswerlisten}
									<br/>
										- Số câu đúng phần đọc: ${list.correctanswerread}
								</h4> 					
							</div>
						</div>
					
			          	<div class="media">
							
							<div class="media-body">
								<h4>
									Số câu sai: ${list.incorrectanswernum}
								</h4> 					
							</div>
						</div>
						
					
					</c:forEach>
		        </div>
		        <div class="modal-footer">
		          <button type="button" class="btn btn-default" data-dismiss="modal">Thoát</button>
		        </div>
		      </div>
		      
		    </div>
		  </div>
		  <!-- end modal -->
</body>
</html>