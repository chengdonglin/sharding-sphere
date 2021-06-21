CREATE DATABASE `order_db_1` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
use order_db_1;
DROP TABLE IF EXISTS `order_1`;
CREATE TABLE `order_1` (
                                     `order_id` bigint(20) NOT NULL COMMENT '订单id',
                                     `price` decimal(10, 2) NOT NULL COMMENT '订单价格',
                                     `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
                                     `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
                                     PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
DROP TABLE IF EXISTS `order_2`;
CREATE TABLE `order_2` (
                                     `order_id` bigint(20) NOT NULL COMMENT '订单id',
                                     `price` decimal(10, 2) NOT NULL COMMENT '订单价格',
                                     `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
                                     `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
                                     PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


CREATE DATABASE `order_db_2` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
use order_db_2;
DROP TABLE IF EXISTS `order_1`;
CREATE TABLE `order_1` (
                                     `order_id` bigint(20) NOT NULL COMMENT '订单id',
                                     `price` decimal(10, 2) NOT NULL COMMENT '订单价格',
                                     `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
                                     `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
                                     PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
DROP TABLE IF EXISTS `order_2`;
CREATE TABLE `order_2` (
                                     `order_id` bigint(20) NOT NULL COMMENT '订单id',
                                     `price` decimal(10, 2) NOT NULL COMMENT '订单价格',
                                     `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
                                     `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
                                     PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;