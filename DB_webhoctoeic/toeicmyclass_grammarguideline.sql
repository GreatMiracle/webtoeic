-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: toeicmyclass
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `grammarguideline`
--

DROP TABLE IF EXISTS `grammarguideline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `grammarguideline` (
  `grammarguidelineid` int(11) NOT NULL AUTO_INCREMENT,
  `grammarname` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `grammarimage` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  PRIMARY KEY (`grammarguidelineid`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grammarguideline`
--

LOCK TABLES `grammarguideline` WRITE;
/*!40000 ALTER TABLE `grammarguideline` DISABLE KEYS */;
INSERT INTO `grammarguideline` VALUES (48,'HƯỚNG DẪN CÁCH TƯ DUY MỘT SỐ LOẠI CÂU HỎI THÚ VỊ TRONG TOEIC READING ','gramma1.jpg','Thật là mệt mỏi khi làm bài tập TOEIC Reading mà phải ngồi dịch từng câu đúng không các em? Từ vựng Tiếng Anh là một kho tàng không bao giờ hết, nên cô chưa bao giờ khuyến khích học viên của mình dịch nghĩa một câu để có thể chọn được đáp án đúng. Lúc nào cũng thế, cô muốn các bạn thử dùng ngữ pháp để giải quyết vấn đề trước tiên. Hôm nay cô trò mình cùng tư duy một số loại câu hỏi thú vị trong đề thi TOEIC nhé các em.\r\n\r\n1. The team members have the same opinions on the matter ….they shared the same information\r\na. following\r\nb. more than\r\nc. because\r\nd. unless\r\nCác em chú ý nhé, đáp án cần điền là đáp án có thể nối hai mệnh đề với nhau, ngay lập tức cô loại A và B. Lúc này cô cân nhắc hai đáp án C và D. Cần dịch chưa nhỉ? Chưa đâu em nhé :)\r\n\r\nUnless tức là If not đúng không các em? Chúng ta nhớ lại kiến thức câu điều kiện xem. Không có câu điều kiện nào mệnh đề If chia thì quá khứ đơn (shared) trong khi mệnh đề chính chia hiện tại đơn (have ) cả, nên đáp án câu này là C đúng không nào?													'),(49,'Lộ trình 990 TOEIC dành cho người mất gốc','gramma2.png',NULL),(52,'Present tense','avata.jpg','1. Định nghĩa thì Hiện Tại Đơn\r\nThì hiện tại đơn (Simple Present hoặc Present Simple) là một thì trong ngữ pháp tiếng Anh nói chung. Thì hiện tại đơn diễn tả một hành động hay sự việc mang tính chất chung chung, tổng quát lặp đi lặp lại nhiều lần hoặc một sự thật hiển nhiên hay một hành động diễn ra trong thời gian ở hiện tại.\r\n														\r\n2. Cách dùng thì Hiện Tại Đơn\r\na. Thì hiện tại đơn diễn đạt một thói quen hay hành động lặp đi lặp lại trong thời điểm hiện tại\r\n    My brother usually goes to bed at 10 p.m. (Em trai tôi thường đi ngủ vào lúc 10 giờ tối)\r\n    My father always gets up early. (Bố tôi luôn luôn thức dậy sớm)\r\n\r\nb. Thì hiện tại đơn diễn tả 1 chân lý, 1 sự thật hiển nhiên  \r\n   The sun rises in the East and sets in the West. (Mặt Trời mọc ở đằng Đông và lặn ở đằng Tây)\r\n   The earth moves around the Sun. (Trái Đất quay xung quanh Mặt Trời)\r\n\r\n3. Diễn tả 1 sự việc xảy ra theo thời gian biểu cụ thể, như giờ tàu, máy bay chạy hay một lịnh trình nào đó.\r\n    The plane takes off at 11a.m. this morning. (Chiếc máy bay cất cánh lúc 11 giờ sáng nay)\r\n    The bus leaves at 9 am tomorrow. (Xe khởi hành lúc 9 giờ sáng mai.)\r\n															\r\n													'),(54,'Past Simple Tense','egg.jfif','#1. KHÁI NIỆM\r\nThì quá khứ đơn (Past simple) dùng để diễn tả hành động sự vật đã xảy ra trong quá khứ hoặc vừa mới kết thúc.\r\n\r\nVí dụ: \r\nWe went shopping yesterday. (Ngày hôm qua chúng tôi đã đi mua sắm)\r\nHe didn’t come to school last week. (Tuần trước cậu ta không đến trường.)\r\n\r\n#2. CÔNG THỨC\r\nThể Khẳng định\r\n\r\nCông thức: S + was/ were + O\r\n\r\nS = I/ He/ She/ It (số ít) + was\r\n\r\nS= We/ You/ They (số nhiều) + were\r\n\r\nVí dụ 1: My computer was broken yesterday. (máy tính của tôi đã bị hỏng hôm qua)\r\n\r\nVí dụ 2: They were in Paris on their summer holiday last year. (Họ ở Paris vào kỳ nghỉ hè năm ngoái.)\r\n\r\n Công thức: S + V-ed/ VQK (bất quy tắc) + O\r\n\r\nKhi chia động từ có quy tắc ở thì quá khứ, ta chỉ cần thêm hậu tố \"-ed\" vào cuối động từ\r\n\r\nCó một số động từ khi sử dụng ở thì quá khứ không theo qui tắc thêm “-ed”. Những động từ này ta cần học thuộc.\r\n\r\nVí dụ 1: She watched this film yesterday. (Cô ấy đã xem bộ phim này hôm qua.)\r\n\r\nVí dụ 2: I went to sleep at 11p.m last night. (Tôi đi ngủ 11 tối qua)\r\n\r\nS + was/were not + Object/Adj\r\nĐối với câu phủ định ta chỉ cần thêm “not” vào sau động từ “to be”.\r\n\r\nCHÚ Ý:\r\n– was not = wasn’t\r\n\r\n– were not = weren’t\r\n\r\nVí dụ:\r\n\r\n– She wasn’t very happy last night because of having lost money. (Tối qua cô ấy không vui vì mất tiền)\r\n\r\n-We weren’t at home yesterday. (Hôm qua chúng tôi không ở nhà.)\r\n\r\nS + did not + V (nguyên thể)\r\n\r\nTrong thì quá khứ đơn câu phủ định ta mượn trợ động từ “did + not” (viết tắt là “didn’t), động từ theo sau ở dạng nguyên thể.)\r\n\r\nVí dụ 1: He didn’t play football last Sunday. (Anh ấy đã không chơi bóng đá vào chủ nhật tuần trước.)\r\n\r\nVí dụ 1: We didn’t see him at the cinema last night. (Chúng tôi không trông thấy anh ta tại rạp chiếu phim tối hôm qua.)\r\n\r\nNghi vấn\r\n\r\nCâu hỏi: Was/Were+ S + Object/Adj?\r\n\r\nTrả lời: Yes, I/ he/ she/ it + was.\r\n\r\n– No, I/ he/ she/ it + wasn’t\r\n\r\nYes, we/ you/ they + were.\r\n\r\n– No, we/ you/ they + weren’t.\r\n\r\nCâu hỏi ta chỉ cần đảo động từ “to be” lên trước chủ ngữ.\r\n\r\n \r\n\r\nVí dụ 1: Was she tired of hearing her customer’s complaint yesterday? (Cô ấy có bị mệt vì nghe khách hàng phàn nàn ngày hôm qua không?)\r\n\r\nYes, she was./ No, she wasn’t. (Có, cô ấy có./ Không, cô ấy không.)\r\n\r\nVí dụ 2: Were they at work yesterday? (Hôm qua họ có làm việc không?)\r\n\r\nYes, they were./ No, they weren’t. (Có, họ có./ Không, họ không.)\r\n\r\nCâu hỏi: Did + S + V(nguyên thể)?\r\n\r\nTrong thì quá khứ đơn với câu hỏi ta mượn trợ động từ “did” đảo lên trước chủ ngữ, động từ theo sau ở dạng nguyên thể.\r\n\r\n \r\n\r\nVí dụ 1: Did you visit Ha Noi Museum with your class last weekend? (Bạn có đi thăm bảo tàng Hà Nội với lớp của bạn cuối tuần trước hay không?)\r\n\r\nYes, I did./ No, I didn’t. (Có, mình có./ Không, mình không.)\r\n\r\nVí dụ 2: Did she miss the train yesterday? (Cô ta có lỡ chuyến tàu ngày hôm qua hay không?)\r\n\r\nYes, She did./ No, She didn’t. (Có, cậu ta có./ Không, cậu ta không.)\r\n\r\n\r\n														\r\n															\r\n													');
/*!40000 ALTER TABLE `grammarguideline` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 23:06:06
