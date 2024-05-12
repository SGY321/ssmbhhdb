-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmbhhdb
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `biaobaiguangchang`
--

-- 删除原有数据库ssmbhhdb，创建数据库ssmbhhdb
DROP DATABASE IF EXISTS ssmbhhdb;
CREATE DATABASE ssmbhhdb;

DROP TABLE IF EXISTS `biaobaiguangchang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `biaobaiguangchang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `biaobaineirong` longtext COMMENT '表白内容',
  `biaobaiduixiang` varchar(200) DEFAULT NULL COMMENT '表白对象',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='表白广场';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biaobaiguangchang`
--

LOCK TABLES `biaobaiguangchang` WRITE;
/*!40000 ALTER TABLE `biaobaiguangchang` DISABLE KEYS */;
INSERT INTO `biaobaiguangchang` VALUES (51,'2024-04-15 11:03:31','标题1','表白内容1','表白对象1','发布人1','2024-04-15','备注1','http://localhost:8080/ssmbhhdb/upload/biaobaiguangchang_tupian1.jpg',1,1,'2024-04-15 19:03:31'),(52,'2024-04-15 11:03:31','标题2','表白内容2','表白对象2','发布人2','2024-04-15','备注2','http://localhost:8080/ssmbhhdb/upload/biaobaiguangchang_tupian2.jpg',2,2,'2024-04-15 19:03:31'),(53,'2024-04-15 11:03:31','标题3','表白内容3','表白对象3','发布人3','2024-04-15','备注3','http://localhost:8080/ssmbhhdb/upload/biaobaiguangchang_tupian3.jpg',3,3,'2024-04-15 19:03:31'),(54,'2024-04-15 11:03:31','标题4','表白内容4','表白对象4','发布人4','2024-04-15','备注4','http://localhost:8080/ssmbhhdb/upload/biaobaiguangchang_tupian4.jpg',4,4,'2024-04-18 13:40:23'),(55,'2024-04-15 11:03:31','标题5','表白内容5','表白对象5','发布人5','2024-04-15','备注5','http://localhost:8080/ssmbhhdb/upload/biaobaiguangchang_tupian5.jpg',5,5,'2024-04-15 19:03:31'),(56,'2024-04-15 11:03:31','标题6','表白内容6','表白对象6','发布人6','2024-04-15','备注6','http://localhost:8080/ssmbhhdb/upload/biaobaiguangchang_tupian6.jpg',6,6,'2024-04-15 19:03:31');
/*!40000 ALTER TABLE `biaobaiguangchang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='客服中心';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (101,'2024-04-15 11:03:31',1,1,'提问1','回复1',1),(102,'2024-04-15 11:03:31',2,2,'提问2','回复2',2),(103,'2024-04-15 11:03:31',3,3,'提问3','回复3',3),(104,'2024-04-15 11:03:31',4,4,'提问4','回复4',4),(105,'2024-04-15 11:03:31',5,5,'提问5','回复5',5),(106,'2024-04-15 11:03:31',6,6,'提问6','回复6',6);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmbhhdb/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmbhhdb/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmbhhdb/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussbiaobaiguangchang`
--

DROP TABLE IF EXISTS `discussbiaobaiguangchang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussbiaobaiguangchang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='表白广场评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussbiaobaiguangchang`
--

LOCK TABLES `discussbiaobaiguangchang` WRITE;
/*!40000 ALTER TABLE `discussbiaobaiguangchang` DISABLE KEYS */;
INSERT INTO `discussbiaobaiguangchang` VALUES (141,'2024-04-15 11:03:31',1,1,'用户名1','评论内容1','回复内容1'),(142,'2024-04-15 11:03:31',2,2,'用户名2','评论内容2','回复内容2'),(143,'2024-04-15 11:03:31',3,3,'用户名3','评论内容3','回复内容3'),(144,'2024-04-15 11:03:31',4,4,'用户名4','评论内容4','回复内容4'),(145,'2024-04-15 11:03:31',5,5,'用户名5','评论内容5','回复内容5'),(146,'2024-04-15 11:03:31',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussbiaobaiguangchang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussershoujiaoyi`
--

DROP TABLE IF EXISTS `discussershoujiaoyi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussershoujiaoyi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='二手交易评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussershoujiaoyi`
--

LOCK TABLES `discussershoujiaoyi` WRITE;
/*!40000 ALTER TABLE `discussershoujiaoyi` DISABLE KEYS */;
INSERT INTO `discussershoujiaoyi` VALUES (161,'2024-04-15 11:03:31',1,1,'用户名1','评论内容1','回复内容1'),(162,'2024-04-15 11:03:31',2,2,'用户名2','评论内容2','回复内容2'),(163,'2024-04-15 11:03:31',3,3,'用户名3','评论内容3','回复内容3'),(164,'2024-04-15 11:03:31',4,4,'用户名4','评论内容4','回复内容4'),(165,'2024-04-15 11:03:31',5,5,'用户名5','评论内容5','回复内容5'),(166,'2024-04-15 11:03:31',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussershoujiaoyi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusspinchechuxing`
--

DROP TABLE IF EXISTS `discusspinchechuxing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusspinchechuxing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='拼车出行评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusspinchechuxing`
--

LOCK TABLES `discusspinchechuxing` WRITE;
/*!40000 ALTER TABLE `discusspinchechuxing` DISABLE KEYS */;
INSERT INTO `discusspinchechuxing` VALUES (171,'2024-04-15 11:03:31',1,1,'用户名1','评论内容1','回复内容1'),(172,'2024-04-15 11:03:31',2,2,'用户名2','评论内容2','回复内容2'),(173,'2024-04-15 11:03:31',3,3,'用户名3','评论内容3','回复内容3'),(174,'2024-04-15 11:03:31',4,4,'用户名4','评论内容4','回复内容4'),(175,'2024-04-15 11:03:31',5,5,'用户名5','评论内容5','回复内容5'),(176,'2024-04-15 11:03:31',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusspinchechuxing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussshiwuzhaoling`
--

DROP TABLE IF EXISTS `discussshiwuzhaoling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussshiwuzhaoling` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='失物招领评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussshiwuzhaoling`
--

LOCK TABLES `discussshiwuzhaoling` WRITE;
/*!40000 ALTER TABLE `discussshiwuzhaoling` DISABLE KEYS */;
INSERT INTO `discussshiwuzhaoling` VALUES (131,'2024-04-15 11:03:31',1,1,'用户名1','评论内容1','回复内容1'),(132,'2024-04-15 11:03:31',2,2,'用户名2','评论内容2','回复内容2'),(133,'2024-04-15 11:03:31',3,3,'用户名3','评论内容3','回复内容3'),(134,'2024-04-15 11:03:31',4,4,'用户名4','评论内容4','回复内容4'),(135,'2024-04-15 11:03:31',5,5,'用户名5','评论内容5','回复内容5'),(136,'2024-04-15 11:03:31',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussshiwuzhaoling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusstucaodahui`
--

DROP TABLE IF EXISTS `discusstucaodahui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusstucaodahui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='吐槽大会评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusstucaodahui`
--

LOCK TABLES `discusstucaodahui` WRITE;
/*!40000 ALTER TABLE `discusstucaodahui` DISABLE KEYS */;
INSERT INTO `discusstucaodahui` VALUES (151,'2024-04-15 11:03:31',1,1,'用户名1','评论内容1','回复内容1'),(152,'2024-04-15 11:03:31',2,2,'用户名2','评论内容2','回复内容2'),(153,'2024-04-15 11:03:31',3,3,'用户名3','评论内容3','回复内容3'),(154,'2024-04-15 11:03:31',4,4,'用户名4','评论内容4','回复内容4'),(155,'2024-04-15 11:03:31',5,5,'用户名5','评论内容5','回复内容5'),(156,'2024-04-15 11:03:31',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusstucaodahui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussxunwuqishi`
--

DROP TABLE IF EXISTS `discussxunwuqishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussxunwuqishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='寻物启事评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussxunwuqishi`
--

LOCK TABLES `discussxunwuqishi` WRITE;
/*!40000 ALTER TABLE `discussxunwuqishi` DISABLE KEYS */;
INSERT INTO `discussxunwuqishi` VALUES (121,'2024-04-15 11:03:31',1,1,'用户名1','评论内容1','回复内容1'),(122,'2024-04-15 11:03:31',2,2,'用户名2','评论内容2','回复内容2'),(123,'2024-04-15 11:03:31',3,3,'用户名3','评论内容3','回复内容3'),(124,'2024-04-15 11:03:31',4,4,'用户名4','评论内容4','回复内容4'),(125,'2024-04-15 11:03:31',5,5,'用户名5','评论内容5','回复内容5'),(126,'2024-04-15 11:03:31',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussxunwuqishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ershoujiaoyi`
--

DROP TABLE IF EXISTS `ershoujiaoyi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ershoujiaoyi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `jiaoyixiangqing` longtext COMMENT '交易详情',
  `jiaoyileixing` varchar(200) DEFAULT NULL COMMENT '交易类型',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `lianxiren` varchar(200) DEFAULT NULL COMMENT '联系人',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='二手交易';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ershoujiaoyi`
--

LOCK TABLES `ershoujiaoyi` WRITE;
/*!40000 ALTER TABLE `ershoujiaoyi` DISABLE KEYS */;
INSERT INTO `ershoujiaoyi` VALUES (71,'2024-04-15 11:03:31','标题1','物品名称1','交易详情1','交易类型1','价格1','','http://localhost:8080/ssmbhhdb/upload/ershoujiaoyi_tupian1.jpg','2024-04-15 19:03:31','联系人1','13823888881','2024-04-15 19:03:31'),(72,'2024-04-15 11:03:31','标题2','物品名称2','交易详情2','交易类型2','价格2','','http://localhost:8080/ssmbhhdb/upload/ershoujiaoyi_tupian2.jpg','2024-04-15 19:03:31','联系人2','13823888882','2024-04-15 19:03:31'),(73,'2024-04-15 11:03:31','标题3','物品名称3','交易详情3','交易类型3','价格3','','http://localhost:8080/ssmbhhdb/upload/ershoujiaoyi_tupian3.jpg','2024-04-15 19:03:31','联系人3','13823888883','2024-04-15 19:03:31'),(74,'2024-04-15 11:03:31','标题4','物品名称4','交易详情4','交易类型4','价格4','','http://localhost:8080/ssmbhhdb/upload/ershoujiaoyi_tupian4.jpg','2024-04-15 19:03:31','联系人4','13823888884','2024-04-15 19:03:31'),(75,'2024-04-15 11:03:31','标题5','物品名称5','交易详情5','交易类型5','价格5','','http://localhost:8080/ssmbhhdb/upload/ershoujiaoyi_tupian5.jpg','2024-04-15 19:03:31','联系人5','13823888885','2024-04-15 19:03:31'),(76,'2024-04-15 11:03:31','标题6','物品名称6','交易详情6','交易类型6','价格6','','http://localhost:8080/ssmbhhdb/upload/ershoujiaoyi_tupian6.jpg','2024-04-15 19:03:31','联系人6','13823888886','2024-04-15 19:03:31');
/*!40000 ALTER TABLE `ershoujiaoyi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoyileixing`
--

DROP TABLE IF EXISTS `jiaoyileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoyileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoyileixing` varchar(200) DEFAULT NULL COMMENT '交易类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='交易类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoyileixing`
--

LOCK TABLES `jiaoyileixing` WRITE;
/*!40000 ALTER TABLE `jiaoyileixing` DISABLE KEYS */;
INSERT INTO `jiaoyileixing` VALUES (81,'2024-04-15 11:03:31','交易类型1'),(82,'2024-04-15 11:03:31','交易类型2'),(83,'2024-04-15 11:03:31','交易类型3'),(84,'2024-04-15 11:03:31','交易类型4'),(85,'2024-04-15 11:03:31','交易类型5'),(86,'2024-04-15 11:03:31','交易类型6');
/*!40000 ALTER TABLE `jiaoyileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pinchechuxing`
--

DROP TABLE IF EXISTS `pinchechuxing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pinchechuxing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `kongweizhishu` varchar(200) DEFAULT NULL COMMENT '空位置数',
  `chufashijian` varchar(200) DEFAULT NULL COMMENT '出发时间',
  `chufadidian` varchar(200) DEFAULT NULL COMMENT '出发地点',
  `renjunjiage` varchar(200) DEFAULT NULL COMMENT '人均价格',
  `faqiren` varchar(200) DEFAULT NULL COMMENT '发起人',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `longitude` float DEFAULT NULL COMMENT '经度',
  `latitude` float DEFAULT NULL COMMENT '纬度',
  `fulladdress` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='拼车出行';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pinchechuxing`
--

LOCK TABLES `pinchechuxing` WRITE;
/*!40000 ALTER TABLE `pinchechuxing` DISABLE KEYS */;
INSERT INTO `pinchechuxing` VALUES (91,'2024-04-15 11:03:31','标题1','空位置数1','出发时间1','出发地点1','人均价格1','发起人1','13823888881','2024-04-15 19:03:31','备注1','http://localhost:8080/ssmbhhdb/upload/pinchechuxing_tupian1.jpg','2024-04-15 19:03:31',1,1,1,'宇宙银河系地球1号'),(92,'2024-04-15 11:03:31','标题2','空位置数2','出发时间2','出发地点2','人均价格2','发起人2','13823888882','2024-04-15 19:03:31','备注2','http://localhost:8080/ssmbhhdb/upload/pinchechuxing_tupian2.jpg','2024-04-15 19:03:31',2,2,2,'宇宙银河系地球2号'),(93,'2024-04-15 11:03:31','标题3','空位置数3','出发时间3','出发地点3','人均价格3','发起人3','13823888883','2024-04-15 19:03:31','备注3','http://localhost:8080/ssmbhhdb/upload/pinchechuxing_tupian3.jpg','2024-04-15 19:03:31',3,3,3,'宇宙银河系地球3号'),(94,'2024-04-15 11:03:31','标题4','空位置数4','出发时间4','出发地点4','人均价格4','发起人4','13823888884','2024-04-15 19:03:31','备注4','http://localhost:8080/ssmbhhdb/upload/pinchechuxing_tupian4.jpg','2024-04-15 19:03:31',4,4,4,'宇宙银河系地球4号'),(95,'2024-04-15 11:03:31','标题5','空位置数5','出发时间5','出发地点5','人均价格5','发起人5','13823888885','2024-04-15 19:03:31','备注5','http://localhost:8080/ssmbhhdb/upload/pinchechuxing_tupian5.jpg','2024-04-15 19:03:31',5,5,5,'宇宙银河系地球5号'),(96,'2024-04-15 11:03:31','标题6','空位置数6','出发时间6','出发地点6','人均价格6','发起人6','13823888886','2024-04-15 19:03:31','备注6','http://localhost:8080/ssmbhhdb/upload/pinchechuxing_tupian6.jpg','2024-04-15 19:03:31',6,6,6,'宇宙银河系地球6号');
/*!40000 ALTER TABLE `pinchechuxing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiwuzhaoling`
--

DROP TABLE IF EXISTS `shiwuzhaoling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiwuzhaoling` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinfenlei` varchar(200) DEFAULT NULL COMMENT '物品分类',
  `shuliang` varchar(200) DEFAULT NULL COMMENT '数量',
  `shidedizhi` varchar(200) DEFAULT NULL COMMENT '拾得地址',
  `shideshijian` datetime DEFAULT NULL COMMENT '拾得时间',
  `renlingdizhi` varchar(200) DEFAULT NULL COMMENT '认领地址',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `xiangqing` longtext COMMENT '详情',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `lianxiren` varchar(200) DEFAULT NULL COMMENT '联系人',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='失物招领';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiwuzhaoling`
--

LOCK TABLES `shiwuzhaoling` WRITE;
/*!40000 ALTER TABLE `shiwuzhaoling` DISABLE KEYS */;
INSERT INTO `shiwuzhaoling` VALUES (41,'2024-04-15 11:03:31','物品名称1','物品分类1','数量1','拾得地址1','2024-04-15 19:03:31','认领地址1','2024-04-15 19:03:31','已认领','详情1','http://localhost:8080/ssmbhhdb/upload/shiwuzhaoling_tupian1.jpg','联系人1','13823888881','2024-04-15 19:03:31',1),(42,'2024-04-15 11:03:31','物品名称2','物品分类2','数量2','拾得地址2','2024-04-15 19:03:31','认领地址2','2024-04-15 19:03:31','已认领','详情2','http://localhost:8080/ssmbhhdb/upload/shiwuzhaoling_tupian2.jpg','联系人2','13823888882','2024-04-15 19:03:31',2),(43,'2024-04-15 11:03:31','物品名称3','物品分类3','数量3','拾得地址3','2024-04-15 19:03:31','认领地址3','2024-04-15 19:03:31','已认领','详情3','http://localhost:8080/ssmbhhdb/upload/shiwuzhaoling_tupian3.jpg','联系人3','13823888883','2024-04-15 19:03:31',3),(44,'2024-04-15 11:03:31','物品名称4','物品分类4','数量4','拾得地址4','2024-04-15 19:03:31','认领地址4','2024-04-15 19:03:31','已认领','详情4','http://localhost:8080/ssmbhhdb/upload/shiwuzhaoling_tupian4.jpg','联系人4','13823888884','2024-04-15 19:03:31',4),(45,'2024-04-15 11:03:31','物品名称5','物品分类5','数量5','拾得地址5','2024-04-15 19:03:31','认领地址5','2024-04-15 19:03:31','已认领','详情5','http://localhost:8080/ssmbhhdb/upload/shiwuzhaoling_tupian5.jpg','联系人5','13823888885','2024-04-15 19:03:31',5),(46,'2024-04-15 11:03:31','物品名称6','物品分类6','数量6','拾得地址6','2024-04-15 19:03:31','认领地址6','2024-04-15 19:03:31','已认领','详情6','http://localhost:8080/ssmbhhdb/upload/shiwuzhaoling_tupian6.jpg','联系人6','13823888886','2024-04-18 13:40:12',7);
/*!40000 ALTER TABLE `shiwuzhaoling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1618724384233,'1','yonghu','用户','eawgm9ryjkdd2rn39075qtxak0gw5slq','2024-04-18 05:39:51','2024-04-18 06:39:52');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tucaodahui`
--

DROP TABLE IF EXISTS `tucaodahui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tucaodahui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `tucaoneirong` longtext COMMENT '吐槽内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `beizhu` longtext COMMENT '备注',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='吐槽大会';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tucaodahui`
--

LOCK TABLES `tucaodahui` WRITE;
/*!40000 ALTER TABLE `tucaodahui` DISABLE KEYS */;
INSERT INTO `tucaodahui` VALUES (61,'2024-04-15 11:03:31','标题1','吐槽内容1','2024-04-15 19:03:31','','http://localhost:8080/ssmbhhdb/upload/tucaodahui_tupian1.jpg','备注1','2024-04-15 19:03:31'),(62,'2024-04-15 11:03:31','标题2','吐槽内容2','2024-04-15 19:03:31','','http://localhost:8080/ssmbhhdb/upload/tucaodahui_tupian2.jpg','备注2','2024-04-15 19:03:31'),(63,'2024-04-15 11:03:31','标题3','吐槽内容3','2024-04-15 19:03:31','','http://localhost:8080/ssmbhhdb/upload/tucaodahui_tupian3.jpg','备注3','2024-04-15 19:03:31'),(64,'2024-04-15 11:03:31','标题4','吐槽内容4','2024-04-15 19:03:31','','http://localhost:8080/ssmbhhdb/upload/tucaodahui_tupian4.jpg','备注4','2024-04-15 19:03:31'),(65,'2024-04-15 11:03:31','标题5','吐槽内容5','2024-04-15 19:03:31','','http://localhost:8080/ssmbhhdb/upload/tucaodahui_tupian5.jpg','备注5','2024-04-15 19:03:31'),(66,'2024-04-15 11:03:31','标题6','吐槽内容6','2024-04-15 19:03:31','','http://localhost:8080/ssmbhhdb/upload/tucaodahui_tupian6.jpg','备注6','2024-04-15 19:03:31');
/*!40000 ALTER TABLE `tucaodahui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2024-04-15 11:03:31');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wupinfenlei`
--

DROP TABLE IF EXISTS `wupinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wupinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinfenlei` varchar(200) DEFAULT NULL COMMENT '物品分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='物品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wupinfenlei`
--

LOCK TABLES `wupinfenlei` WRITE;
/*!40000 ALTER TABLE `wupinfenlei` DISABLE KEYS */;
INSERT INTO `wupinfenlei` VALUES (31,'2024-04-15 11:03:31','物品分类1'),(32,'2024-04-15 11:03:31','物品分类2'),(33,'2024-04-15 11:03:31','物品分类3'),(34,'2024-04-15 11:03:31','物品分类4'),(35,'2024-04-15 11:03:31','物品分类5'),(36,'2024-04-15 11:03:31','物品分类6');
/*!40000 ALTER TABLE `wupinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xunwuqishi`
--

DROP TABLE IF EXISTS `xunwuqishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xunwuqishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinmingcheng` varchar(200) NOT NULL COMMENT '物品名称',
  `wupinfenlei` varchar(200) DEFAULT NULL COMMENT '物品分类',
  `wupintupian` varchar(200) DEFAULT NULL COMMENT '物品图片',
  `yishididian` varchar(200) NOT NULL COMMENT '遗失地点',
  `yishishijian` datetime DEFAULT NULL COMMENT '遗失时间',
  `wupinmiaoshu` longtext COMMENT '物品描述',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `lianxiren` varchar(200) DEFAULT NULL COMMENT '联系人',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='寻物启事';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xunwuqishi`
--

LOCK TABLES `xunwuqishi` WRITE;
/*!40000 ALTER TABLE `xunwuqishi` DISABLE KEYS */;
INSERT INTO `xunwuqishi` VALUES (21,'2024-04-15 11:03:31','物品名称1','物品分类1','http://localhost:8080/ssmbhhdb/upload/xunwuqishi_wupintupian1.jpg','遗失地点1','2024-04-15 19:03:31','物品描述1','2024-04-15 19:03:31','联系人1','13823888881','2024-04-15 19:03:31',1),(22,'2024-04-15 11:03:31','物品名称2','物品分类2','http://localhost:8080/ssmbhhdb/upload/xunwuqishi_wupintupian2.jpg','遗失地点2','2024-04-15 19:03:31','物品描述2','2024-04-15 19:03:31','联系人2','13823888882','2024-04-15 19:03:31',2),(23,'2024-04-15 11:03:31','物品名称3','物品分类3','http://localhost:8080/ssmbhhdb/upload/xunwuqishi_wupintupian3.jpg','遗失地点3','2024-04-15 19:03:31','物品描述3','2024-04-15 19:03:31','联系人3','13823888883','2024-04-15 19:03:31',3),(24,'2024-04-15 11:03:31','物品名称4','物品分类4','http://localhost:8080/ssmbhhdb/upload/xunwuqishi_wupintupian4.jpg','遗失地点4','2024-04-15 19:03:31','物品描述4','2024-04-15 19:03:31','联系人4','13823888884','2024-04-15 19:03:31',4),(25,'2024-04-15 11:03:31','物品名称5','物品分类5','http://localhost:8080/ssmbhhdb/upload/xunwuqishi_wupintupian5.jpg','遗失地点5','2024-04-15 19:03:31','物品描述5','2024-04-15 19:03:31','联系人5','13823888885','2024-04-15 19:03:31',5),(26,'2024-04-15 11:03:31','物品名称6','物品分类6','http://localhost:8080/ssmbhhdb/upload/xunwuqishi_wupintupian6.jpg','遗失地点6','2024-04-15 19:03:31','物品描述6','2024-04-15 19:03:31','联系人6','13823888886','2024-04-15 19:03:31',6);
/*!40000 ALTER TABLE `xunwuqishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1618724384234 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2024-04-15 11:03:31','用户1','123456','姓名1','男','学院1','专业1','班级1','440300199101010001','13823888881','773890001@qq.com','http://localhost:8080/ssmbhhdb/upload/yonghu_zhaopian1.jpg'),(12,'2024-04-15 11:03:31','用户2','123456','姓名2','男','学院2','专业2','班级2','440300199202020002','13823888882','773890002@qq.com','http://localhost:8080/ssmbhhdb/upload/yonghu_zhaopian2.jpg'),(13,'2024-04-15 11:03:31','用户3','123456','姓名3','男','学院3','专业3','班级3','440300199303030003','13823888883','773890003@qq.com','http://localhost:8080/ssmbhhdb/upload/yonghu_zhaopian3.jpg'),(14,'2024-04-15 11:03:31','用户4','123456','姓名4','男','学院4','专业4','班级4','440300199404040004','13823888884','773890004@qq.com','http://localhost:8080/ssmbhhdb/upload/yonghu_zhaopian4.jpg'),(15,'2024-04-15 11:03:31','用户5','123456','姓名5','男','学院5','专业5','班级5','440300199505050005','13823888885','773890005@qq.com','http://localhost:8080/ssmbhhdb/upload/yonghu_zhaopian5.jpg'),(16,'2024-04-15 11:03:31','用户6','123456','姓名6','男','学院6','专业6','班级6','440300199606060006','13823888886','773890006@qq.com','http://localhost:8080/ssmbhhdb/upload/yonghu_zhaopian6.jpg'),(1618724384233,'2024-04-18 05:39:44','1','1',NULL,'男',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-02 14:45:51
