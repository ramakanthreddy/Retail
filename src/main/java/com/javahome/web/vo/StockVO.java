package com.javahome.web.vo;

import java.io.Serializable;

public class StockVO implements Serializable {

	private String category;
	private int quantity;
	private int subcategory;
	private int price;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(int subcategory) {
		this.subcategory = subcategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	}


