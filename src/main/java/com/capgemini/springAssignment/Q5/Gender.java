package com.capgemini.springAssignment.Q5;

import org.springframework.stereotype.Component;

@Component
public class Gender {
	String gender;

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "gender{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
