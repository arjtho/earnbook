
DROP TABLE IF EXISTS `earnbook`.`user`;
CREATE TABLE  `earnbook`.`user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `earnbook`.`business`;
CREATE TABLE  `earnbook`.`business` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `businessname` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `earnbook`.`category`;
CREATE TABLE  `earnbook`.`category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `categoryname` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `earnbook`.`business_cat_xref`;
CREATE TABLE  `earnbook`.`business_cat_xref` (
  `business_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`business_id`),
  KEY `FK_business_cat_xref_2` (`category_id`),
  CONSTRAINT `FK_business_cat_xref_2` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `FK_business_cat_xref_1` FOREIGN KEY (`business_id`) REFERENCES `business` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `earnbook`.`user_business_xref`;
SELECT * FROM user_business_xref u;