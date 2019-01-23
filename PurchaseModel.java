package com.perscholas.my_case_study.models;

import java.util.Date;

public class Purchase {
	private int purchase_id;
	private int customer_id;
	private int product_id;
	private Date purchase_date;
	
	public Purchase(int purchase_id, int customer_id, int product_id) {
		super();
		this.purchase_id = purchase_id;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.purchase_date = new Date();
	}

	public int getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	
}
