package org.valarmorgulis.consinjection;

public class NoteBook {

	private int nid;
	private double height;
	private double width;
	private double price;
	private int pages;
	private int quantity;
	public int getNid() {
		return nid;
	}
	@Override
	public String toString() {
		return "NoteBook [nid=" + nid + ", height=" + height + ", width=" + width + ", price=" + price + ", pages="
				+ pages + ", quantity=" + quantity + "]";
	}
	public NoteBook(int nid, double height, double width, double price, int pages, int quantity) {
		super();
		this.nid = nid;
		this.height = height;
		this.width = width;
		this.price = price;
		this.pages = pages;
		this.quantity = quantity;
	}
	
	
}
