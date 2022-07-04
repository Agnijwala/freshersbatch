package com.capgemini.springAssignment.Q10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		User user = (User) applicationContext.getBean("user");
		System.out.println("User Id: " + user.getUserId() + " User Name :" + user.getName());
	}

}
