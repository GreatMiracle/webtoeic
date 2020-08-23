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
-- Table structure for table `listenquestion`
--

DROP TABLE IF EXISTS `listenquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `listenquestion` (
  `listenquestionid` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(11) DEFAULT NULL,
  `imagename` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `audiomp3` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `audiogg` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `question` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option1` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option2` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option3` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option4` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `correctanswer` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `listenexerciseid` int(11) DEFAULT NULL,
  PRIMARY KEY (`listenquestionid`),
  KEY `FK_LIQU_LIEX_idx` (`listenexerciseid`),
  CONSTRAINT `FK_LIQU_LIEX` FOREIGN KEY (`listenexerciseid`) REFERENCES `listenexercise` (`listenexerciseid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listenquestion`
--

LOCK TABLES `listenquestion` WRITE;
/*!40000 ALTER TABLE `listenquestion` DISABLE KEYS */;
INSERT INTO `listenquestion` VALUES (5,1,'hinh1_1.jpg','audio1_1.mp3','audio1_1.ogg','Look at the picture and listen to the sentences. Choose the sentence that best describes the picture:','A.','B.','C.','D.','B',2),(6,2,'hinh1_2.jpg','audio1_2.mp3','audio1_2.ogg','Look at the picture and listen to the sentences. Choose the sentence that best describes the picture:','A.','B.','C.','D.','C',2),(7,3,'hinh1_3.jpg','audio1_3.mp3','audio1_3.ogg','Listen to the question and the three responses. Choose the response that best answers the question:','A.','B.','C.','D.','A',2),(8,4,'hinh1_4.jpg','audio1_4.mp3','audio1_4.ogg','Listen to the question and the three responses. Choose the response that best answers the question:','A.','B.','C.','D.','A',2),(9,1,'hinh2_1.jpg','audio2_2.ogg','audio2_2.mp3','Look at the picture and listen to the sentences. Choose the sentence that best describes the picture:','A','B','C','D','A',2),(10,2,'hinh2_2.jpg','audio2_1.ogg','audio2_1.mp4','Look at the picture and listen to the sentences. Choose the sentence that best describes the picture:','A','B','C','D','C',2),(11,3,'hinh2_3.jpg','audio2_3.ogg','audio2_3.mp3','Listen to the question and the three responses. Choose the response that best answers the question:','A','B','C','D','D',2),(12,4,'hinh2_4.jpg','audio2_4.ogg','audio2_4.mp3','Listen to the question and the three responses. Choose the response that best answers the question:','A','B','C','D','B',2);
/*!40000 ALTER TABLE `listenquestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 23:06:11
