
CREATE DATABASE `test` ;

USE `test`;

DROP TABLE IF EXISTS `tb_ftp_file`;

CREATE TABLE `tb_ftp_file` (
  `id` varchar(64) NOT NULL,
  `file_name` varchar(200) DEFAULT NULL COMMENT '文件名称',
  `location` varchar(500) DEFAULT NULL COMMENT '路径',
  `status` tinyint(3) DEFAULT NULL COMMENT '0:未处理 1:处理中 2:处理成功 3:处理失败',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `start_time` timestamp NULL DEFAULT NULL COMMENT '处理开始时间',
  `end_time` timestamp NULL DEFAULT NULL COMMENT '处理结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

