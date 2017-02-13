/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50612
 Source Host           : localhost
 Source Database       : spring

 Target Server Type    : MySQL
 Target Server Version : 50612
 File Encoding         : utf-8

 Date: 02/13/2017 23:12:44 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `spring_user`
-- ----------------------------
DROP TABLE IF EXISTS `spring_user`;
CREATE TABLE `spring_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '注册邮箱',
  `created` datetime NOT NULL,
  `updated` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  UNIQUE KEY `phone` (`phone`) USING BTREE,
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
--  Records of `spring_user`
-- ----------------------------
BEGIN;
INSERT INTO `spring_user` VALUES ('1', 'spring', 'spring', '123456', 'afa', '2017-02-06 23:08:05', '2017-02-13 23:08:13');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
