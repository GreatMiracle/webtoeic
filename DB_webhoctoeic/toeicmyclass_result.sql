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
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `result` (
  `resultid` int(11) NOT NULL AUTO_INCREMENT,
  `correctanswernum` int(11) DEFAULT NULL,
  `incorrectanswernum` int(11) DEFAULT NULL,
  `time` varchar(50) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `examinationid` int(11) DEFAULT NULL,
  `memberid` int(11) DEFAULT NULL,
  `correctanswerread` int(11) DEFAULT NULL,
  `correctanswerlisten` int(11) DEFAULT NULL,
  PRIMARY KEY (`resultid`),
  KEY `FK_EX_RE_idx` (`memberid`),
  KEY `FK_EX_RE_idx1` (`examinationid`),
  CONSTRAINT `FK_EX_RE` FOREIGN KEY (`examinationid`) REFERENCES `examination` (`examinationid`),
  CONSTRAINT `FK_MEM_RE` FOREIGN KEY (`memberid`) REFERENCES `member` (`memberid`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES (79,0,10,'Sat Nov 05 11:56:44 ICT 2016',26,15,NULL,NULL),(80,3,7,'Sat Nov 05 12:09:30 ICT 2016',26,15,NULL,NULL),(81,2,8,'Sat Nov 05 12:10:13 ICT 2016',26,15,NULL,NULL),(82,6,4,'Sat Nov 05 12:28:45 ICT 2016',26,15,NULL,NULL),(83,5,5,'Sat Nov 05 12:33:58 ICT 2016',26,15,NULL,NULL),(84,5,5,'Sat Nov 05 13:00:13 ICT 2016',26,15,2,3),(85,5,5,'Sat Nov 05 13:00:47 ICT 2016',26,15,2,3),(86,3,7,'Sat Nov 05 22:27:55 ICT 2016',26,15,0,3),(87,4,6,'Thu Aug 06 18:14:08 ICT 2020',29,15,4,0),(88,1,9,'Thu Aug 06 22:32:15 ICT 2020',29,17,0,1);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 23:06:05
