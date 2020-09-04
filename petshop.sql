-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: petshop_db
-- ------------------------------------------------------
-- Server version	5.7.28-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer_dtl`
--

DROP TABLE IF EXISTS `customer_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_dtl` (
  `customer_id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_dtl`
--

LOCK TABLES `customer_dtl` WRITE;
/*!40000 ALTER TABLE `customer_dtl` DISABLE KEYS */;
INSERT INTO `customer_dtl` VALUES (1,'Madappattu house,Thekkumthara PO','hari'),(5,'string','string'),(6,'safa','asda');
/*!40000 ALTER TABLE `customer_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (7),(7),(7),(7);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_dtl`
--

DROP TABLE IF EXISTS `order_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_dtl` (
  `od_id` bigint(20) NOT NULL,
  `oh_id` bigint(20) DEFAULT NULL,
  `pet_id` bigint(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`od_id`),
  KEY `FKa9280ik6x74xyqxn7575tme0l` (`oh_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_dtl`
--

LOCK TABLES `order_dtl` WRITE;
/*!40000 ALTER TABLE `order_dtl` DISABLE KEYS */;
INSERT INTO `order_dtl` VALUES (4,3,1,10000);
/*!40000 ALTER TABLE `order_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_hdr`
--

DROP TABLE IF EXISTS `order_hdr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_hdr` (
  `oh_id` bigint(20) NOT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `total_price` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`oh_id`),
  KEY `FKh4eb3fx0swb4pql48l0q8x83f` (`customer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_hdr`
--

LOCK TABLES `order_hdr` WRITE;
/*!40000 ALTER TABLE `order_hdr` DISABLE KEYS */;
INSERT INTO `order_hdr` VALUES (3,'1','10000');
/*!40000 ALTER TABLE `order_hdr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pet_detail`
--

DROP TABLE IF EXISTS `pet_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pet_detail` (
  `pet_id` bigint(20) NOT NULL,
  `age` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `is_sold` double DEFAULT NULL,
  `pet_type` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`pet_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pet_detail`
--

LOCK TABLES `pet_detail` WRITE;
/*!40000 ALTER TABLE `pet_detail` DISABLE KEYS */;
INSERT INTO `pet_detail` VALUES (2,'3','Black',0,'Dog',20000);
/*!40000 ALTER TABLE `pet_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-04 22:18:14
