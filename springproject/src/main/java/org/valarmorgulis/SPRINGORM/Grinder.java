package org.valarmorgulis.SPRINGORM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Grinder {
	
	public Grinder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int gid;
	private String companyName;
	private int motorSpeedInRPM;
	private double price;
	private int totalJarPresent;
	private String color;
	private int powerConsuptionInKWH;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getMotorSpeedInRPM() {
		return motorSpeedInRPM;
	}
	public void setMotorSpeedInRPM(int motorSpeedInRPM) {
		this.motorSpeedInRPM = motorSpeedInRPM;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTotalJarPresent() {
		return totalJarPresent;
	}
	public void setTotalJarPresent(int totalJarPresent) {
		this.totalJarPresent = totalJarPresent;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPowerConsuptionInKWH() {
		return powerConsuptionInKWH;
	}
	public void setPowerConsuptionInKWH(int powerConsuptionInKWH) {
		this.powerConsuptionInKWH = powerConsuptionInKWH;
	}
	@Override
	public String toString() {
		return "Grinder [gid=" + gid + ", companyName=" + companyName + ", motorSpeedInRPM=" + motorSpeedInRPM
				+ ", price=" + price + ", totalJarPresent=" + totalJarPresent + ", color=" + color
				+ ", powerConsuptionInKWH=" + powerConsuptionInKWH + "]";
	}
	public Grinder(int gid, String companyName, int motorSpeedInRPM, double price, int totalJarPresent, String color,
			int powerConsuptionInKWH) {
		super();
		this.gid = gid;
		this.companyName = companyName;
		this.motorSpeedInRPM = motorSpeedInRPM;
		this.price = price;
		this.totalJarPresent = totalJarPresent;
		this.color = color;
		this.powerConsuptionInKWH = powerConsuptionInKWH;
	}
	
	
	

}
