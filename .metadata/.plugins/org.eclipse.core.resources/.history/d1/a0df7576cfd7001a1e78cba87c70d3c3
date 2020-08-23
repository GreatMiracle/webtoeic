<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Làm bài thi toeic</title>
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
        
        		function auto_submit()
        		{
        			document.form.submit();
        		}
        			
        		function auto_submit1()
        		{
        			setTimeout("auto_submit()",(1000 * 7200));
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
<!-- 				<div class="page-header" style="display: flex;"> -->
				<div class="span8" style="display: flex;">
					<img src= "Template/Image/butchi.png" alt="" style="width:65px;height:50px;"/>
					<h1><c:out value="${nameTest}"/>:</h1>
					<div class="span4" style="position: absolute;
    right:0px;">
					<!-- START COUNTDOWN -->


<script>

function doneHandler(result) {
	
	// Result is a javascript Date object, containing the deadline time.
	//
	// 		NOTES on the javascript Date object:
	// 			- months are 0-11, not 1-12
	// 			- "day" is day of the week (0-6) representing sunday-saturday
	// 			- "date" is the day of the month (0-31)
	
	var year = result.getFullYear();
	var month = result.getMonth() + 1; // bump by 1 for humans
	var day = result.getDate();
	var h = result.getHours();
	var m = result.getMinutes();
	var s = result.getSeconds();
	
	var UTC = result.toString();
	
	var output = UTC + "\n";
	output += "year: " + year + "\n";
	output += "month: " + month + "\n";
	output += "day: " + day + "\n";
	output += "h: " + h + "\n";
	output += "m: " + m + "\n";
	output += "s: " + s + "\n";
	
// 	alert(output);
}

var myCountdownTest = new Countdown({
// 								 	time: 5400,
								 	time: 7200,
									width	: 300, 
									height	: 50,
									onComplete : doneHandler
									});



</script>
<!-- END COUNTDOWN -->
</div>
				</div>

			</div>
		</div>

		<!-- /. PAGE TITLE-->
		<div class="row">
			<div class="span8">
				<h2 style="color: blue;">Câu hỏi: </h2>
				<div class="reading_description"
					style="overflow: auto; height: 500px; border: 1px solid #BDBDBD">


					<div id="paginationdemo" class="container demo" style="padding-left:30px">
						
							
							<div id="p1" class="pagedemo _current" style="">
								<h2 style="color: red">
								=====>Nhấn page 2 để bắt đầu làm đề thi. <br>Chúc bạn thi tốt nhé!
								</h2>
								
								<img src= "Template/Image/anhchucthitot.jpg" alt="" style="width:500px;height:300px;" />
								</div>

							<c:forEach items="${lsAllQuestion}" var ="list">
								<c:if test="${(list.imagequestion!='')&&(list.audiogg!='')&&(list.audiomp3!='')}">
									<div id="p${list.num+1}" style="display:none;">
																	
											<img src= "Imageaudiodethi/${list.imagequestion}" alt="" style="width:350px;height:200px;"/>
											<br/>
											<br/>
											<p>
												<audio controls>
														<source src="Imageaudiodethi/${list.audiogg}" type="audio/ogg">
														<source src="Imageaudiodethi/${list.audiomp3}" type="audio/mpeg">
												</audio>
											</p>
											
											<b>Câu ${list.num}. ${list.question}</b>
											<p>${list.option1}</p>
											<p>${list.option2}</p>
											<p>${list.option3}</p>
											<p>${list.option4}</p>							
									</div>
								</c:if>
								
								<c:if test="${(list.imagequestion=='')&&(list.audiogg!='')&&(list.audiomp3!='')}">
									<div id="p${list.num+1}" style="display:none;">
																				
											<br/>
											<br/>
											<p>
												<audio controls>
														<source src="Imageaudiodethi/${list.audiogg}" type="audio/ogg">
														<source src="Imageaudiodethi/${list.audiomp3}" type="audio/mpeg">
												</audio>
											</p>
											<b>Câu ${list.num}. ${list.question}</b>
											<p>${list.option1}</p>
											<p>${list.option2}</p>
											<p>${list.option3}</p>
											<p>${list.option4}</p>							
									</div>
								</c:if>
								
								<c:if test="${(list.imagequestion=='')&&(list.audiogg=='')&&(list.audiomp3=='')}">
									<div id="p${list.num+1}" style="display:none;">
																
											<p>		
												<c:set var ="kq" value="${fn:replace(list.paragraph,kitutrongdatabase,kitutronghtml)}" />
												<c:out value= "${kq}" escapeXml="false"/>		
											</p>
											<b>Câu ${list.num}. ${list.question}</b>
											<p>${list.option1}</p>
											<p>${list.option2}</p>
											<p>${list.option3}</p>
											<p>${list.option4}</p>							
									</div>
								</c:if>
							</c:forEach>
							
							
						</div>
						
					</div>
					<br>
<div id="demo5"></div>
				</div>



				<div class="span4">
				<h2 style="color: blue;">Câu trả lời:</h2>
				<form name="form" action="Lambaithitoeic?examinationid=${examinationid}&memberid=${memberid}" method="POST">
					
					<div class="reading_description"
						style="overflow: auto; height: 500px; border: 1px solid #BDBDBD" >
						<br>

						<c:forEach items = "${lsAllQuestion}" var = "list">		
									&nbsp;
									
									<div class="span1">
										${list.num}:
									</div>
									
									A. <input type="radio" name="ans[${list.num}]" value="A"> 
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									B. <input type="radio" name="ans[${list.num}]" value="B"> 
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									C. <input type="radio" name="ans[${list.num}]" value="C"> 
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									D. <input type="radio" name="ans[${list.num}]" value="D"> 
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<br/>
									<br/>
									
								</c:forEach>		


					</div>
					<br/>
					<input type="submit" class="btn btn-primary" value="Nộp bài"/>
					</form>
				</div>

			</div>

		</div>
		

		<div class="hr-divider"></div>


		<!--Footer
==========================-->

		<jsp:include page="Footer.jsp"></jsp:include>

		<!--/.Footer-->
		<script type="text/javascript" src="JqueryPaging/jquery-1.3.2.js"></script>
		<script src="JqueryPaging/jquery.paginate.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function() {
				$("#demo5").paginate(
						{
							count : (<%=request.getAttribute("totalQuestion")%>+1),
// 							count : 11,
							start : 1,
							display : 5,
							border : true,
							border_color : '#fff',
							text_color : '#fff',
							background_color : 'black',
							border_hover_color : '#ccc',
							text_hover_color : '#000',
							background_hover_color : '#fff',
							images : false,
							mouse : 'press',
							onChange : function(page) {
								$('._current', '#paginationdemo').removeClass(
										'_current').hide();
								$('#p' + page).addClass('_current').show();
							}
						});
			});
		</script>
</body>
</html>