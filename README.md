
简单的页面爬虫 页面解析
 
 1.java6， maven3 , httpclient4.2， mybatis,mysql  vidageekcrawler jsoup
 2.使用2个开源框架，特别要介绍的是jsoup（用过jquery把，jsoup的select完全吸取了这个风格的精髓） net.vidageekcrawler1.0 <!-- jsoup HTML parser library @ http://jsoup.org/ --> org.jsoupjsoup1.7.2
 

细节
建库sql在readme.txt中， 如果只是爬取可以去掉dao层。
写了2个站点的解析，chinacaipu，meishijie， 其中meshijie的页面明显规范很多，爬取到的内容格式非常好！
C站图片有referce验证 ，M站有访问频率限制，当然很容易绕过去。     

 说明
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


