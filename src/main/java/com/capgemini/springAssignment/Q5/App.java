package com.capgemini.springAssignment.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("springQ5.xml");
        Human humanBeing = (Human) context.getBean("Human");
        Gender gender =humanBeing.getG();
        Phone no=humanBeing.getP();
        System.out.println(gender);
        System.out.println(no);
        System.out.println(humanBeing);
    }
}
