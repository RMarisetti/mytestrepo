package com.perscholas.my_case_study.models;

public class Product {
	private int product_id;
	private String name;
	private double price; 
	private int quantity_available;
	
	public Product() {
		
	}
	
	public Product(int product_id, String name, double price, int quantity_available) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.quantity_available = quantity_available;
	}

	public Product(String name, double price, int quantity_available) {
		super();
		this.name = name;
		this.price = price;
		this.quantity_available = quantity_available;	
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity_available() {
		return quantity_available;
	}

	public void setQuantity_available(int quantity_available) {
		this.quantity_available = quantity_available;
	}
	
	public String toString() {
		return "Name: " + this.name + 
				"\nPrice: "+ this.price + 
				"\nQuantity Available: "+ this.quantity_available;
	}

}
