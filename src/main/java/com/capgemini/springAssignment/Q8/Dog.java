package com.capgemini.springAssignment.Q8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean,DisposableBean{
	private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(getName()+" is eating.");
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing the dog bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method is called");
    }
    public void myInit(){
        System.out.println("Dog bean created using init-method");
    }

    public  void  myDest(){
        System.out.println("Object is destroyed using destroy-method");
    }
    
}
