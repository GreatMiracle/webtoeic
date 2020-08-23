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
-- Table structure for table `cmtvocabulary`
--

DROP TABLE IF EXISTS `cmtvocabulary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cmtvocabulary` (
  `cmtvocabularyid` int(11) NOT NULL AUTO_INCREMENT,
  `cmtvocabularycontent` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `memberid` int(11) DEFAULT NULL,
  `vocabularyguidelineid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cmtvocabularyid`),
  KEY `FK_CMTVO_MEM_idx` (`memberid`),
  KEY `FK_CMTVO_VOGU_idx` (`vocabularyguidelineid`),
  CONSTRAINT `FK_CMTVO_MEM` FOREIGN KEY (`memberid`) REFERENCES `member` (`memberid`),
  CONSTRAINT `FK_CMTVO_VOGU` FOREIGN KEY (`vocabularyguidelineid`) REFERENCES `vocabularyguideline` (`vocabularyguidelineid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cmtvocabulary`
--

LOCK TABLES `cmtvocabulary` WRITE;
/*!40000 ALTER TABLE `cmtvocabulary` DISABLE KEYS */;
/*!40000 ALTER TABLE `cmtvocabulary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 23:06:07
