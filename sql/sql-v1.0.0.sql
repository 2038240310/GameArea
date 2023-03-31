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
  `message` mediumblob COMMENT '发帖信息内容',
  `create_by` varchar(32) NOT NULL COMMENT '创建者id',
  `block_id` varchar(32) DEFAULT NULL COMMENT '所属板块分类id',
  `area_id` varchar(32) NOT NULL COMMENT '所属区块分类id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改日期',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1封贴，2关闭',
  PRIMARY KEY (`card_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛帖子表';


-- game_area_db.bbs_card_info definition

CREATE TABLE `bbs_card_info` (
  `info_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `card_id` varchar(32) NOT NULL COMMENT '相关帖子id',
  `like_num` int NOT NULL DEFAULT '0' COMMENT '喜欢数量',
  `comment_num` int NOT NULL DEFAULT '0' COMMENT '评论数量',
  `source_path` varchar(32) DEFAULT NULL COMMENT '富文本、图片路径',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛帖子信息表';


-- game_area_db.bbs_reply definition

CREATE TABLE `bbs_reply` (
  `reply_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `message` mediumblob COMMENT '回复消息',
  `reply_rank` int NOT NULL COMMENT '回复楼层',
  `card_id` varchar(32) NOT NULL COMMENT '所属帖子id',
  `create_by` varchar(32) NOT NULL COMMENT '创建者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`reply_id`),
  UNIQUE KEY `bbs_reply_un` (`reply_rank`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛帖子回复信息表';


-- game_area_db.bbs_reply_reply definition

CREATE TABLE `bbs_reply_reply` (
  `rr_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `message` varchar(255) DEFAULT NULL COMMENT '二级回复信息文本',
  `card_id` varchar(32) NOT NULL COMMENT '从属帖子id',
  `reply_id` varchar(32) DEFAULT NULL COMMENT '上级回复贴id',
  `reply_to` varchar(32) NOT NULL COMMENT '回复对象id',
  `create_by` varchar(32) NOT NULL COMMENT '创建者id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`rr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛帖子二级回复消息表';


-- game_area_db.lib_path definition

CREATE TABLE `lib_path` (
  `path_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `data_path` varchar(255) NOT NULL COMMENT '资源路径',
  `add_time` datetime NOT NULL COMMENT '增加时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0可用，1维护，2关闭',
  PRIMARY KEY (`path_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资料库资源路径表';


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
  PRIMARY KEY (`card_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分享站帖子表';


-- game_area_db.share_card_info definition

CREATE TABLE `share_card_info` (
  `info_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `card_id` varchar(32) NOT NULL COMMENT '关联资源帖子id',
  `message` longblob COMMENT '帖子页面内容',
  `source_info` varchar(100) DEFAULT NULL COMMENT '资源信息',
  `source_link` varchar(100) DEFAULT NULL COMMENT '资源相关地址',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源站帖子信息表';


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源站帖子-标签关联表';


-- game_area_db.share_card_type definition

CREATE TABLE `share_card_type` (
  `type_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `type_name` varchar(32) NOT NULL COMMENT '类型名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分享站帖子类型表';


-- game_area_db.share_tag definition

CREATE TABLE `share_tag` (
  `tag_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `tag_name` varchar(32) NOT NULL COMMENT '标签名',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分享站标签管理表';


-- game_area_db.sign_board definition

CREATE TABLE `sign_board` (
  `board_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `message` varchar(255) NOT NULL COMMENT '公告信息',
  `board_type` varchar(32) DEFAULT NULL COMMENT '公告分类id',
  `area_id` varchar(32) DEFAULT NULL COMMENT '所属区块id',
  `link_path` varchar(255) DEFAULT NULL COMMENT '导航地址',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '状态，0启用，1关闭',
  PRIMARY KEY (`board_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告版信息表';


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告版类型管理表';