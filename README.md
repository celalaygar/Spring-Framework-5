# Spring_Framework_5_denemeleri

## - 	spring-mvc-hibernate
this project consist insert update delete methods with hibernate in spring framework 5
first step : listen to me for spring-mvc-hibernate project. write the sql query into mysql workbench for mysql database
#### SQL QUERY
```
CREATE DATABASE IF NOT EXISTS `ogrenci_schema`;

USE `ogrenci_schema`;

CREATE TABLE `student` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(45) DEFAULT NULL,
 `last_name` varchar(45) DEFAULT NULL,
 `email` varchar(45) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `student` VALUES 
(1,'Ugurcan','Cetin','ugurcan2020@gmail.com'),
(2,'Ayse','Korkmaz','ayse@gmail.com'),
(3,'Mustafa','Agbaba','mustafa@gmail.com'),
(4,'Veli','Sezer','veli@gmail.com'),
(5,'Seda','sakin','seda@gmail.com');
```
