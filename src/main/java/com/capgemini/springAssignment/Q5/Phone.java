package com.capgemini.springAssignment.Q5;

import org.springframework.stereotype.Component;

@Component
public class Phone {
	 long number;

	    public Phone(long number) {
	        this.number = number;
	    }


	    @Override
	    public String toString() {
	        return "phone{" +
	                "number=" + number +
	                '}';
	    }
}
