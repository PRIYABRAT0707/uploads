package org.valarmorgulis.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class ano2 {
	private int bid;
	private double height;
	private double width;
	private double price;
	@Autowired
	private ano1 notebook;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ano1 getNotebook() {
		return notebook;
	}
	public void setNotebook(ano1 notebook) {
		this.notebook = notebook;
	}
	@Override
	public String toString() {
		return "ano2 [bid=" + bid + ", height=" + height + ", width=" + width + ", price=" + price + ", notebook="
				+ notebook + "]";
	}
	public ano2(int bid, double height, double width, double price, ano1 notebook) {
		super();
		this.bid = bid;
		this.height = height;
		this.width = width;
		this.price = price;
		this.notebook = notebook;
	}

}
