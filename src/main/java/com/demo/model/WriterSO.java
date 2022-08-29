package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WriterSO {
	
	// class : 2 tables dtaa send kar skte hain 

	@Id
	    private int id;
	    private String fullName;
	    private String randomNum;

	    public int getId() {
	        return id;
	    }

	    public void setId(int l) {
	        this.id = l;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getRandomNum() {
	        return randomNum;
	    }

	    public void setRandomNum(String randomNum) {
	        this.randomNum = randomNum;
	    }

	    @Override
	    public String toString() {
	        return "WriterSO{" +
	                "id=" + id +
	                ", fullName='" + fullName + '\'' +
	                ", randomNum='" + randomNum + '\'' +
	                '}';
	    }
	}

