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
-- Table structure for table `readquestion`
--

DROP TABLE IF EXISTS `readquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `readquestion` (
  `readquestionid` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(11) DEFAULT NULL,
  `paragraph` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `question` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option1` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option2` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option3` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `option4` text CHARACTER SET utf8 COLLATE utf8_swedish_ci,
  `correctanswer` varchar(45) CHARACTER SET utf8 COLLATE utf8_swedish_ci DEFAULT NULL,
  `readexeriseid` int(11) DEFAULT NULL,
  PRIMARY KEY (`readquestionid`),
  KEY `FK_REQU_REEX_idx` (`readexeriseid`),
  CONSTRAINT `FK_REQU_REEX` FOREIGN KEY (`readexeriseid`) REFERENCES `readexercise` (`readexeriseid`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `readquestion`
--

LOCK TABLES `readquestion` WRITE;
/*!40000 ALTER TABLE `readquestion` DISABLE KEYS */;
INSERT INTO `readquestion` VALUES (70,1,'','I don\'t think he will remember the appointment …… you remind him.','A. so','B. if','C. unless','D. lest','D',42),(71,2,'','The river has overflowed his banks ……. it has been raining continuously for several days.','A. still','B.  Yet','C. when','D. as','B',42),(72,3,'','Those village folk are poor ……. they always seem so contented.','A. though','B. since','C. yet','D. or','A',42),(73,4,'','…….. he was not interested in music, he agreed to go to the concert.','A.  Thought','B. while','C. for','D. since','D',42),(74,2,'Did you know that a typical business uses over 2,000 ink cartridges per year? The environmental consequences of this are important for us to consider. Bold Ink, Inc. would like to minimize the amount of waste produced by local businesses. We urge our customers to recycle used ink cartridges (54) ------- possible, because as a company we are committed to reducing environmental pollution.   It is easy to recycle used ink cartridges. You can deposit them in recycling bins labeled “Bold Ink” at any office supply store that sells our products. Store employees (55) ------ the cartridges to us so that we can process them. When you recycle a cartridge, you receive a discount on your next cartridge purchase. To get further (56) ------- about the discount program, log on to our homepage at www.boldink.com.','Please fill in the blanks on the paragraph','A. some','B.  whenever','C. altogether',' D. meanwhile','A',43),(75,3,'','The river has overflowed his banks ……. it has been raining continuously for several days.','A. still','B.  Yet','C. when','D. as','B',43),(76,4,'','Those village folk are poor ……. they always seem so contented.','A. though','B. since','C. yet','D. or','A',43),(77,5,'','…….. he was not interested in music, he agreed to go to the concert.','A.  Thought','B. while','C. for','D. since','D',43),(78,6,'Read the passage and choose the correct answer: Passage 1: MOSS RESIDENTIAL TECH                                                             Staff Expense Form Name: Bill Sweet Reason for expense: Client meetings and product demonstrations in Indianapolis, Indiana with Davies Home Distribution Corporation Dates of trip: May 12-18   Expense Amount paid ($) Details Plane ticket 600 Round trip - Economy class Hotel room 0 Complimentary - Bonus card Food and Beverage 400   Taxi/ airport limo 100 The airport is far from the site Misc. 150 Alcohol for the clients Total 1,250     Employee signature: Bill Sweet Manager signature: Elsa Wagner                         Comments: All of the receipts from my business trip have been attached via staple to this form. I am sorry that I missed the submissions deadline of 2 weeks after returning. I was overwhelmed by the response from the clients to my product demonstration as I had an 80% increase in sales. I am hoping that this increase in sales is a valid excuse for my tardiness. I would appreciate it if you could reimburse me as soon as possible, as I have to make another trip soon. My manager and I will be in the office today if you have any questions. Thanks in advance. *********** Passage 2:   Date: May 28, 11:20 a.m. To: Bill Sweet From: Samuel Wilson <s-wilson@mossrtech.com> Cc: Payton Maroney <p-maroney@mossrtech.com> Subject: Expense report   Mr. Sweet,   Thanks for completing and submitting the proper forms for your reimbursement. Although, you missing the deadline we will be able to pay you back for the money you spent on your trip. Your supervisor has already informed me of your situation, and it is acceptable. I hope that you continue your good sales record, but if you could try and submit your forms on time, it would make my job easier.   After reading your report I noticed that you expensed drinks for clients. I am sorry to say that we don’t cover that type of expense, so we will not be able to reimburse you for that. If you have any questions about what is covered, you should refer to the employee manual. Additionally, next time you attach your receipts, can you please put them in the order you have written them on the form? This will speed processing time and reduce errors.   I will be out of town starting tomorrow. I am going on a short vacation and I will be out of reach. If you have any questions, please contact my assistant Payton at extension 6859. I have carbon copied this e-mail to him, so he is aware of the details.   Sincerely, Samuel Wilson Accounting Division',' Why did Mr. Sweet submit the report?','A. to list the things he spent his money on','B. to ask for permission to take a business trip','C. airfare','D. to request that he be paid back for his expenses','D',43);
/*!40000 ALTER TABLE `readquestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 23:06:04
