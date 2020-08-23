<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="lsCmt" items="${listcommentgrammar}">
							<div class="media">
								<a href="#" class="pull-left"><img
									src="Template/Frontend/img/img-60x60.jpg" class="media-object"
									alt='' /></a>
								<div class="media-body">
									<h4 class="media-heading">${lsCmt.name}</h4>
									${lsCmt.cmtgrammarcontent}
								</div>
							</div>
						</c:forEach>
</body>
</html>