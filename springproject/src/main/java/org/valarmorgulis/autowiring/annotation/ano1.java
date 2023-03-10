package org.valarmorgulis.autowiring.annotation;

public class ano1 {
	
	private int nid;
	private double height;
	private double width;
	private double price;
	private int pages;
	private int quantity;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public ano1(int nid, double height, double width, double price, int pages, int quantity) {
		super();
		this.nid = nid;
		this.height = height;
		this.width = width;
		this.price = price;
		this.pages = pages;
		this.quantity = quantity;
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
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ano1 [nid=" + nid + ", height=" + height + ", width=" + width + ", price=" + price + ", pages=" + pages
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
}
