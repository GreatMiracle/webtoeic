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
	<div id="myCarousel" class="carousel slide">
		<div class="carousel-inner">

			<div class="active item">
				<div class="container">
					<div class="row">

						<div class="span6">

							<div class="carousel-caption">
								<h1>Hướng Dẫn Phần Nghe, Đọc Toeic</h1>
								<p class="lead">Chúng tôi cung cấp cho các bạn những kiến
									thức tốt nhất</p>
								<a class="btn btn-large btn-primary" href="#">Hãy tham gia
									ngay</a>
							</div>

						</div>

						<div class="span6">
						
							<img src="Template/Frontend/img/slide/unnamed (1).jpg" width="100%"/>
<!-- 							<img src="Template/Frontend/img/slide/du_hoc_uc.jpg" width="100%"/> -->
								
						</div>

					</div>
				</div>
			</div>

			<c:forEach var="lsSlide" items="${lsSlide}">

				<div class="item">

					<div class="container">
						<div class="row">

							<div class="span6">

								<div class="carousel-caption">
									<h1>${lsSlide.slidename}</h1>
									<p class="lead">${lsSlide.slidecontent}</p>
									<a class="btn btn-large btn-primary" href="#">Hãy tham gia
										ngay</a>
								</div>

							</div>

							<!--                 <div class="span6"> <img src="Template/Frontend/img/slide/slide2.jpg" height="350px" width="350px"></div> -->
							<div class="span6">
								<img src="Template/Frontend/img/slide/${lsSlide.slideimage}"
									height="350px" width="350px">
							</div>
						</div>
					</div>

				</div>
			</c:forEach>




		</div>
		<!-- Carousel nav -->
		<a class="carousel-control left " href="#myCarousel" data-slide="prev"><i
			class="icon-chevron-left"></i></a> <a class="carousel-control right"
			href="#myCarousel" data-slide="next"><i
			class="icon-chevron-right"></i></a>
		<!-- /.Carousel nav -->

	</div>
</body>
</html>