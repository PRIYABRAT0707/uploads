package org.valarmorgulis.referencevariable;

public class MotorBike {
	private int mid;
	private String engine;
	private double price;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MotorBike [mid=" + mid + ", engine=" + engine + ", price=" + price + "]";
	}
	

}
