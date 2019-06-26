package com.avps.customerloaneligibility;

import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * This class contain all the customer attributes.
	 */
	private static final long serialVersionUID = 1L;
/*
 * age of the customer
 */
	private int age;
	/*
	 * state of the customer
	 */
	private String state;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
