# Spring_Framework_5_denemeleri
#### 1 - spring-framework dependency injection example
 this project is about spring dependency injection.  we are creating a maven project. We include the spring-context.jar in the pom.xml file. then we create and design the beans.xml file. We run latest the project

#### 2 - spring-framework dependency injection example 
 this project is about spring dependency injection. we create and design the beans.xml and beans2.xml file. We run the latest project with beans.xml and beans2.xml respectively

#### 3 - spring-annotations(a)
 this project is about spring annotations(a). we create and design the beans.xml. then use init-methods and param methods in bean.xml

#### 4 - spring-annotations(b)
   this project is about spring annotations(b).  @Autowired and @Qualifier("...") usage.
###### - first step: click context checkbox in beanx.xml->namespaces. 
###### - second step : then we have to write 
```
<beans>
    <!--we have to write this line <onctext...... -->
    <context:annotation-config></context:annotation-config> 
    ......
    ....
    ..
</beans> 
``` 
in beans.xml 
#### 5 - springmvc-RequestMapping
 how to use @PathVariable | @RequestParam

#### 6 - springmvc-FormHandling(a)
how to use <form:input ... />, <form:textarea .../>, <form:checkboxes...../> for spring mvc....

#### 7 - springmvc-FormHandling(b)
how to use <form:select ... />, <form:radiobutton ... />, <form:radiobuttons ... />, for spring mvc...

#### - spring-jdbc-1
how to delete, update, select data for spring framework in maven project
###### First step : write the sql query into mysql workbench for mysql database
##### SQL QUERY
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
(6,'celal','aygar','celalaygar@gmail.com');
``` 
###### Second step : run the project

#### - spring-mvc-hibernate
this project consist (insert, update and delete) methods with hibernate and spring framework 5.
###### First step : write the sql query into mysql workbench for mysql database
##### SQL QUERY
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
###### Second step : run the project with anything server like tomcat wildfly on eclipse  
