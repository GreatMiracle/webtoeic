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
-- Table structure for table `vocabularycontent`
--

DROP TABLE IF EXISTS `vocabularycontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vocabularycontent` (
  `vocabularycontentid` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(11) DEFAULT NULL,
  `vocabularycontentname` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `transcribe` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `image` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `audiomp3` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `audiogg` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `mean` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `vocabularyguidelineid` int(11) DEFAULT NULL,
  PRIMARY KEY (`vocabularycontentid`),
  KEY `FK_VOCO_VOGU_idx` (`vocabularyguidelineid`),
  CONSTRAINT `FK_VOCO_VOGU` FOREIGN KEY (`vocabularyguidelineid`) REFERENCES `vocabularyguideline` (`vocabularyguidelineid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vocabularycontent`
--

LOCK TABLES `vocabularycontent` WRITE;
/*!40000 ALTER TABLE `vocabularycontent` DISABLE KEYS */;
INSERT INTO `vocabularycontent` VALUES (13,1,'abide by','/ə\'baid/','abide_by.jpg','abide_by.mp3','abide_by.ogg','(v): tôn trọng, tuân theo, giữ (lời)',3),(14,2,'agreement','/ə\'gri:mənt/','agreement.jpg','agreement.mp3','agreement.ogg','(n): hợp đồng, giao kèo, sự đồng ý/thỏa thuận với nhau',3),(15,3,'assurance','/ə\'ʃuərəns/','assurance.jpg','assurance.mp3','assurance.ogg','(n): sự cam đoan, bảo đảm, chắc chắn; sự tin chắc, tự tin',3),(16,4,'cancellation','/,kænse\'leiʃn/','cancellation.jpg','cancellation.mp3','cancellation.ogg','(n): sự bãi bỏ, hủy bỏ',3),(17,1,'attract ',' /ə\'trækt/','attract.jpg','attract.mp3','attract.ogg','(v): hấp dẫn, lôi cuốn, thu hút',4),(18,2,'competition ','/kɔmpi\'tiʃn/','competition.jpg','competition.mp3','competition.ogg','(v): ‹sự/cuộc› cạnh tranh, tranh giành, thi đấu',4),(19,3,'compare ','/kəm\'peə/','compare.jpg','compare.mp3','compare.ogg','(v): so sánh, đối chiếu',4),(20,4,'consume ','/kən\'sju:m/','consume.jpg','consume.mp3','consume.ogg','(v): tiêu thụ, tiêu dùng',4),(21,5,'convince ','/kən\'vins/','convince.jpg','convince.mp3','convince.ogg','(v): Thuyết phục',4);
/*!40000 ALTER TABLE `vocabularycontent` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 23:06:10
