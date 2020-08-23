<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kết quả bài nghe</title>
</head>
<body>
	<c:forEach items="${dapandungbtnghe}" var="listcorrectanswer">
		<c:if test="${listcorrectanswer.correctanswer == 'A'}">
			<c:if test="${kq == 'A'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/correct.png">
					${listcorrectanswer.option1}

				</p>
				<p>${listcorrectanswer.option2}</p>
				<p>${listcorrectanswer.option3}</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'B'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object"
					alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option1}
				</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
				</p>
				<p>${listcorrectanswer.option3}</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'C'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option1}
				</p>
								  ${listcorrectanswer.option2}
								<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
				</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'D'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option1}
				</p>
				<p>${listcorrectanswer.option2}</p>
				<p>${listcorrectanswer.option3}</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
				</p>>
							</c:if>

		</c:if>

		<c:if test="${listcorrectanswer.correctanswer == 'B'}">
			<c:if test="${kq == 'A'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
				</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option2}
				</p>
				<p>${listcorrectanswer.option3}</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'B'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option2}
				</p>
				<p>${listcorrectanswer.option3}</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'C'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option2}
				</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
				</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'D'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option2}
				</p>
				<p>${listcorrectanswer.option3}</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
				</p>
			</c:if>
		</c:if>


		<c:if test="${listcorrectanswer.correctanswer == 'C'}">
			<c:if test="${kq == 'A'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
				</p>
				<p>${listcorrectanswer.option2}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option3}
				</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'B'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
				</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option3}
				</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'C'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>${listcorrectanswer.option2}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option3}
				</p>
				<p>${listcorrectanswer.option4}</p>
			</c:if>

			<c:if test="${kq == 'D'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>${listcorrectanswer.option2}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option3}
				</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
				</p>
			</c:if>
		</c:if>

		<c:if test="${listcorrectanswer.correctanswer == 'D'}">
			<c:if test="${kq == 'A'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
				</p>
				<p>${listcorrectanswer.option2}</p>
				<p>${listcorrectanswer.option3}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option4}
				</p>
			</c:if>

			<c:if test="${kq == 'B'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
				</p>
				<p>${listcorrectanswer.option3}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option4}
				</p>
			</c:if>

			<c:if test="${kq == 'C'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>${listcorrectanswer.option2}</p>
				<p>
					<img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
				</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option4}
				</p>
			</c:if>

			<c:if test="${kq == 'D'}">
				<img src="Filebtphannghe/${listcorrectanswer.imagename}" class="media-object" alt='' width="300px" height="200px" />
				<audio controls> <source
					src="Filebtphannghe/${listcorrectanswer.audiomp3}"
					type="audio/mpeg"></audio>
				<p><b>Câu ${listcorrectanswer.num}.${listcorrectanswer.question}</b></p>
				<p>${listcorrectanswer.option1}</p>
				<p>${listcorrectanswer.option2}</p>
				<p>${listcorrectanswer.option3}</p>
				<p>
					<img alt="" src="Image/correct.png">${listcorrectanswer.option4}
				</p>
			</c:if>
		</c:if>
	</c:forEach>
</body>
</html>