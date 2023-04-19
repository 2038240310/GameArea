-- game_area_db.area_area definition

CREATE TABLE `area_area` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `area_name` varchar(32) NOT NULL COMMENT '分区域名',
  `area_pic_path` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '分区显示图表',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态 (0.启用 1.关闭 2.弃用)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='平台最高级分区表';


-- game_area_db.area_model_permissions definition

CREATE TABLE `area_model_permissions` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `user_id` varchar(12) NOT NULL COMMENT '关联人id',
  `model` varchar(2) NOT NULL COMMENT '管理模块 （1.论坛(bbs) 2.分享站(share) 3.资料站(lib) 4.公告资讯站(sign) ）',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态( 0.生效 1.撤销 2.待观察 )',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='平台模块权限分配表';


-- game_area_db.area_user definition

CREATE TABLE `area_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` int NOT NULL DEFAULT '0' COMMENT '状态',
  `user_permissions` int NOT NULL DEFAULT '0' COMMENT '用户权限 (0.游客 1.普通用户 97.模块管理员 98.平台管理员 99.king)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='平台用户表';


-- game_area_db.area_user_info definition

CREATE TABLE `area_user_info` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联用户id',
  `level` int NOT NULL DEFAULT '0' COMMENT '用户等级',
  `message` tinytext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '用户简讯',
  `avatar_path` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户头像资源路径',
  `nickname` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称 (初始化为用户账号)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='平台用户信息表';


-- game_area_db.bbs_block definition

CREATE TABLE `bbs_block` (
  `block_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `block_name` varchar(16) NOT NULL COMMENT '板块名称',
  `pic_path` varchar(100) DEFAULT NULL COMMENT '图标路径',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`block_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛板块表';


-- game_area_db.bbs_card definition

CREATE TABLE `bbs_card` (
  `card_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `title` varchar(32) DEFAULT NULL COMMENT '帖子标题',
  `message` varchar(255) DEFAULT NULL COMMENT '发帖简述',
  `create_by` varchar(32) NOT NULL COMMENT '创建者id',
  `block_id` varchar(32) DEFAULT NULL COMMENT '所属板块分类id',
  `area_id` varchar(32) NOT NULL COMMENT '所属区块分类id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改日期',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1封贴，2关闭',
  PRIMARY KEY (`card_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='论坛帖子表';


-- game_area_db.bbs_card_info definition

CREATE TABLE `bbs_card_info` (
  `info_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `card_id` varchar(32) NOT NULL COMMENT '相关帖子id',
  `like_num` int NOT NULL DEFAULT '0' COMMENT '喜欢数量',
  `comment_num` int NOT NULL DEFAULT '0' COMMENT '评论数量',
  `source_path` varchar(32) DEFAULT NULL COMMENT '富文本、图片路径',
  `message` varchar(255) DEFAULT NULL COMMENT '发帖信息内容',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛帖子信息表';


-- game_area_db.bbs_reply definition

CREATE TABLE `bbs_reply` (
  `reply_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `message` varchar(255) DEFAULT NULL COMMENT '回复消息',
  `card_id` varchar(32) NOT NULL COMMENT '所属帖子id',
  `create_by` varchar(32) NOT NULL COMMENT '创建者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='论坛帖子回复信息表';


-- game_area_db.bbs_reply_reply definition

CREATE TABLE `bbs_reply_reply` (
  `rr_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `message` varchar(255) DEFAULT NULL COMMENT '二级回复信息文本',
  `card_id` varchar(32) NOT NULL COMMENT '从属帖子id',
  `reply_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '上级回复贴id',
  `reply_to` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '回复对象id',
  `create_by` varchar(32) NOT NULL COMMENT '创建者id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`rr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='论坛帖子二级回复消息表';


-- game_area_db.bbs_user_permissions definition

CREATE TABLE `bbs_user_permissions` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `block_id` varchar(12) DEFAULT NULL COMMENT '关联帖子板块id',
  `user_id` varchar(12) NOT NULL COMMENT '关联用户id',
  `create_time` datetime NOT NULL COMMENT '建立时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态 （0.生效中 1.撤销 2.待审核）',
  `permission_offer_person_id` varchar(12) NOT NULL COMMENT '授权人id',
  `permission_pass_person_id` varchar(12) NOT NULL COMMENT '审核人id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子用户权限配置表';


-- game_area_db.lib_path definition

CREATE TABLE `lib_path` (
  `path_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `data_path` varchar(255) NOT NULL COMMENT '资源路径',
  `create_time` datetime NOT NULL COMMENT '增加时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0可用，1维护，2关闭',
  `data_name` varchar(32) DEFAULT NULL COMMENT '资源名称',
  PRIMARY KEY (`path_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资料库资源路径表';


-- game_area_db.lib_update_apply definition

CREATE TABLE `lib_update_apply` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `apply_type` int NOT NULL COMMENT '操作类型 （0.修改 1.新增 2.标记错误）',
  `applicant_id` varchar(32) NOT NULL COMMENT '申请人id（user_id）',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态 (0.未处理 1.已处理 2.不通过)',
  `apply_to_id` varchar(32) NOT NULL COMMENT '操作对象',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资料库操作申请单表';


-- game_area_db.share_card definition

CREATE TABLE `share_card` (
  `card_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `title` varchar(48) NOT NULL COMMENT '分享贴标题',
  `type_id` varchar(32) NOT NULL COMMENT '分享贴类型id',
  `create_by` varchar(32) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(32) NOT NULL COMMENT '修改人id，不做说明默认创建人为修改人',
  `update_time` datetime NOT NULL COMMENT '修改时间，初始化默认为创建时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  `pic_path` varchar(128) DEFAULT NULL COMMENT '预览图路径',
  PRIMARY KEY (`card_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='分享站帖子表';


-- game_area_db.share_card_info definition

CREATE TABLE `share_card_info` (
  `info_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `card_id` varchar(32) NOT NULL COMMENT '关联资源帖子id',
  `message` longblob COMMENT '帖子页面内容',
  `source_info` varchar(100) DEFAULT NULL COMMENT '资源信息',
  `source_link` varchar(100) DEFAULT NULL COMMENT '资源相关地址',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='资源站帖子信息表';


-- game_area_db.share_card_reply definition

CREATE TABLE `share_card_reply` (
  `reply_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `card_id` varchar(32) NOT NULL COMMENT '关联资源帖id',
  `message` varchar(100) DEFAULT NULL COMMENT '回复信息文本',
  `create_by` varchar(32) NOT NULL COMMENT '创建人id',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分享站帖子回复表';


-- game_area_db.share_card_tag definition

CREATE TABLE `share_card_tag` (
  `rel_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `card_id` varchar(32) NOT NULL COMMENT '关联资源帖子id',
  `tag_id` varchar(32) NOT NULL COMMENT '关联标签id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`rel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='资源站帖子-标签关联表';


-- game_area_db.share_card_type definition

CREATE TABLE `share_card_type` (
  `type_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `type_name` varchar(32) NOT NULL COMMENT '类型名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='分享站帖子类型表';


-- game_area_db.share_tag definition

CREATE TABLE `share_tag` (
  `tag_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `tag_name` varchar(32) NOT NULL COMMENT '标签名',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='分享站标签管理表';


-- game_area_db.sign_board definition

CREATE TABLE `sign_board` (
  `board_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `message` varchar(255) NOT NULL COMMENT '公告信息',
  `board_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公告分类id',
  `area_id` varchar(32) DEFAULT NULL COMMENT '所属区块id',
  `link_path` varchar(255) DEFAULT NULL COMMENT '导航地址',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`board_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='公告版信息表';


-- game_area_db.sign_board_top definition

CREATE TABLE `sign_board_top` (
  `top_ip` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `board_id` varchar(32) NOT NULL COMMENT '相关联公告id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `pic_path` varchar(255) DEFAULT NULL COMMENT '图片资源路径',
  `link_path` varchar(255) DEFAULT NULL COMMENT '导航路径',
  PRIMARY KEY (`top_ip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='头条公告信息表（主页告示牌图片展示）';


-- game_area_db.sign_type definition

CREATE TABLE `sign_type` (
  `type_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `type_name` varchar(32) NOT NULL COMMENT '类型名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='公告版类型管理表';