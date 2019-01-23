package com.perscholas.my_case_study.models;

public class Customer {
	private int customer_id;
	private String name;
	private String email;
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Customer(int customer_id, String name, String email, String password) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "Name: " + this.name + 
				"\nEmail: "+ this.email + 
				"\nPassword: "+ this.password;
	}

}
