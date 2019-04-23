/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50173
Source Host           : 192.168.0.205:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2019-04-24 01:13:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(10) NOT NULL AUTO_INCREMENT,
  `sname` varchar(32) DEFAULT NULL,
  `spassword` varchar(32) DEFAULT NULL,
  `ssex` char(2) DEFAULT NULL,
  `sage` int(2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'zs', '123', '男', '20');
INSERT INTO `student` VALUES ('2', 'ls', '123', '女', '30');
INSERT INTO `student` VALUES ('3', 'ww', '123', '男', '22');
INSERT INTO `student` VALUES ('4', 'zl', '123', '女', '33');
