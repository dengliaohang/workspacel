/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.28 : Database - test
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `country` */

DROP TABLE IF EXISTS `country`;

CREATE TABLE `country` (
  `country_id` int(20) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`country_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `country` */

insert  into `country`(`country_id`,`country_name`) values (1,'美国'),(2,'英国'),(3,'印度'),(4,'墨西哥'),(5,'法国'),(6,'德国');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`id`,`name`) values (1,'肾五国内国际二部');

/*Table structure for table `patient_resource` */

DROP TABLE IF EXISTS `patient_resource`;

CREATE TABLE `patient_resource` (
  `patient_id` int(20) NOT NULL AUTO_INCREMENT,
  `sys_user_id` int(20) DEFAULT NULL,
  `patient_name` varchar(20) DEFAULT NULL,
  `patient_age` int(5) DEFAULT NULL,
  `patient_sex` varchar(5) DEFAULT NULL,
  `patient_consultation_name` varchar(20) DEFAULT NULL,
  `patient_consultation_country` varchar(20) DEFAULT NULL,
  `patient_consultation_phone` int(20) DEFAULT NULL,
  `patient_sysptom` varchar(20) DEFAULT NULL,
  `patient_entity` varchar(20) DEFAULT NULL,
  `patient_intention_level` int(20) DEFAULT NULL,
  `patient_report_state` varchar(20) DEFAULT NULL,
  `patient_passport_state` varchar(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `patient_address` varchar(20) DEFAULT NULL,
  `patient_consultation_relation` varchar(20) DEFAULT NULL,
  `consultation_address` varchar(20) DEFAULT NULL,
  `consultation_email` varchar(20) DEFAULT NULL,
  `critical_state` varchar(20) DEFAULT NULL,
  `resource_state` varchar(20) DEFAULT NULL,
  `hospital_state` varchar(20) DEFAULT NULL,
  `report_date` date DEFAULT NULL,
  `patient_isDel` int(10) DEFAULT NULL,
  `ue` varchar(50) DEFAULT NULL,
  `report_user_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `patient_resource` */

insert  into `patient_resource`(`patient_id`,`sys_user_id`,`patient_name`,`patient_age`,`patient_sex`,`patient_consultation_name`,`patient_consultation_country`,`patient_consultation_phone`,`patient_sysptom`,`patient_entity`,`patient_intention_level`,`patient_report_state`,`patient_passport_state`,`remark`,`patient_address`,`patient_consultation_relation`,`consultation_address`,`consultation_email`,`critical_state`,`resource_state`,`hospital_state`,`report_date`,`patient_isDel`,`ue`,`report_user_id`) values (30,1,'1122',1,'woman','1','1',1,'1','肾囊肿',4,'no','no','213','1','1','1','1','no','no','no','2017-07-03',0,'F:/text/b65f58d5-2865-43fa-bb30-afab2cd024ed.txt',1),(31,1,'王婉婉',15,'man','','美国',123456789,'肾疼','肾炎',5,'yes','yes','','美国华尔街','','','101@qq。com','yes','yes','yes','2017-07-14',0,'F:/text/2b7bc86b-606e-403b-8fe3-891f08721ed3.txt',1),(32,1,'程可儿',22,'woman','','韩国',133344455,'肿块','肾囊肿',4,'yes','yes','','韩国','','','111@qq.com','yes','yes','yes','2017-07-13',0,'F:/text/b37890f1-55e5-42d2-af17-b73e7d3bdfef.txt',1);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `sys_user_id` int(20) NOT NULL AUTO_INCREMENT,
  `sys_user_name` varchar(50) NOT NULL,
  `sys_user_password` varchar(50) DEFAULT NULL,
  `sys_user_state` int(10) DEFAULT NULL,
  `sys_user_Cname` varchar(50) DEFAULT NULL,
  `sys_user_isDel` int(10) DEFAULT NULL,
  `sys_user_able` int(10) NOT NULL,
  `job_id` int(20) DEFAULT NULL,
  `department_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`sys_user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`sys_user_id`,`sys_user_name`,`sys_user_password`,`sys_user_state`,`sys_user_Cname`,`sys_user_isDel`,`sys_user_able`,`job_id`,`department_id`) values (1,'admin','admin',1,'郑郑',1,1,1,1),(2,'test1','123',0,'测试',1,1,1,1),(3,'t2','123',0,'测试2',1,1,1,1),(4,'test3','123',0,'测试3',1,1,2,1);

/*Table structure for table `user_job` */

DROP TABLE IF EXISTS `user_job`;

CREATE TABLE `user_job` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user_job` */

insert  into `user_job`(`id`,`name`) values (1,'医生'),(2,'客服');

/* Function  structure for function  `func_currval` */

/*!50003 DROP FUNCTION IF EXISTS `func_currval` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `func_currval`(seq_name varchar(50)) RETURNS int(11)
begin
 declare value integer;
 set value = 0;
 select current_value into value
 from sys_sequence
 where name = seq_name;
 return value;
end */$$
DELIMITER ;

/* Function  structure for function  `func_nextval` */

/*!50003 DROP FUNCTION IF EXISTS `func_nextval` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `func_nextval`(seq_name varchar(50)) RETURNS int(11)
begin
 update sys_sequence
 set current_value = current_value + increment_value
 where name = seq_name;
 return func_currval(seq_name);
end */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
