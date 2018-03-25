package com.mimararslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        //try beans2.xml file
        //ApplicationContext context= new ClassPathXmlApplicationContext("beans2.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println("------------------");
        System.out.println("student ismi : "+student.getIsim());
        System.out.println("student yas : "+student.getYas());
        System.out.println("student telNo : "+student.getTelNo());
    	System.out.println("------------------");
    	student.okulBilgileri();
    }
}
