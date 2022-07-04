package com.capgemini.springAssignment.Q5;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ImportResource;

public class Human {
	 String name;

	    Phone p;

	    @ImportResource
	    Gender g;

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public Gender getG() {
	        return g;
	    }
	    public void setG(Gender g) {
	        this.g = g;
	    }

	    public Phone getP() {
	        return p;
	    }
	    @Required
	    public void setP(Phone p) {
	        this.p = p;
	    }

	    @Override
	    public String toString() {
	        return "human{" +
	                "name='" + name + '\'' +
	                ", p=" + p +
	                ", g=" + g +
	                '}';
	    }
	
}
