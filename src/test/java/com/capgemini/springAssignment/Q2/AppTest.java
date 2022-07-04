package com.capgemini.springAssignment.Q2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest 
{
	ApplicationContext context= new ClassPathXmlApplicationContext("quiz.xml");
    Question ques1 = (Question) context.getBean("Question1");
    @Test
    public void getQuestionId() {
        assertEquals(1,ques1.getQuestionId());
    }

    @Test
    public void getQuestion() {
        assertEquals("What is spring?",ques1.getQuestion());
    }
}
