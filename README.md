crawler-food
============

美食街爬虫demo   sql.


delimiter $$

CREATE DATABASE `caipu` /*!40100 DEFAULT CHARACTER SET utf8 */$$

delimiter $$

CREATE TABLE `recipe` (
  `recipeId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `images` varchar(500) NOT NULL,
  `recruit` varchar(30) NOT NULL,
  `taste` varchar(30) NOT NULL,
  `setupTime` varchar(30) DEFAULT NULL,
  `cookingTime` varchar(30) NOT NULL,
  `mainIngredient` varchar(200) NOT NULL,
  `ingredient` varchar(200) NOT NULL,
  `funcational` varchar(300) NOT NULL,
  `comment` varchar(300) NOT NULL,
  PRIMARY KEY (`recipeId`)
) ENGINE=InnoDB AUTO_INCREMENT=9748 DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `step` (
  `stepId` int(11) NOT NULL AUTO_INCREMENT,
  `recipeId` int(11) NOT NULL,
  `stepOrder` smallint(6) NOT NULL,
  `time` int(11) NOT NULL,
  `description` varchar(300) CHARACTER SET ucs2 COLLATE ucs2_bin NOT NULL,
  `images` varchar(500) CHARACTER SET ucs2 COLLATE ucs2_bin NOT NULL,
  `ingredient` varchar(100) CHARACTER SET ucs2 COLLATE ucs2_bin NOT NULL,
  `audio` varchar(300) CHARACTER SET ucs2 COLLATE ucs2_bin NOT NULL,
  PRIMARY KEY (`stepId`)
) ENGINE=InnoDB AUTO_INCREMENT=42900 DEFAULT CHARSET=utf8$$


