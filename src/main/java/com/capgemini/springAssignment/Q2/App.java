package com.capgemini.springAssignment.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

         // calling list of answer
        Question question =(Question)context.getBean("Question");
        question.displayAnswerList();  
    }
}
