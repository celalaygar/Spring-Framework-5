package com.mimararslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	B b= (B) context.getBean("classB");
        b.sonucugosterB();
        System.out.println("---------------------------------");
    	C c =(C) context.getBean("classC");
    	c.sonucugosterC();
    	System.out.println("Sonuclar : "+c.getName() +" / "+c.getSayi());
    	
    }
}
