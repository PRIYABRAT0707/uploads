package org.valarmorgulis.referencevariable;

public class Car {
	private int cid;
	private String engine;
	private double price;
	private MotorBike mb;
	public MotorBike getMb() {
		return mb;
	}
	public void setMb(MotorBike mb) {
		this.mb = mb;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
		return "Car [cid=" + cid + ", engine=" + engine + ", price=" + price + ", mb=" + mb + "]";
	}
	

}
