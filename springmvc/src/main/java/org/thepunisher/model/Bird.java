package org.thepunisher.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Bird {
	private int bid;
	private String birdName;
	private String color;
	private boolean isMigratory;
	private String countryWhereMostSeen;
	private double weight;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBirdName() {
		return birdName;
	}
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isMigratory() {
		return isMigratory;
	}
	public void setMigratory(boolean isMigratory) {
		this.isMigratory = isMigratory;
	}
	public String getCountryWhereMostSeen() {
		return countryWhereMostSeen;
	}
	public void setCountryWhereMostSeen(String countryWhereMostSeen) {
		this.countryWhereMostSeen = countryWhereMostSeen;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Bird [bid=" + bid + ", birdName=" + birdName + ", color=" + color + ", isMigratory=" + isMigratory
				+ ", countryWhereMostSeen=" + countryWhereMostSeen + ", weight=" + weight + "]";
	}
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bird(int bid, String birdName, String color, boolean isMigratory, String countryWhereMostSeen,
			double weight) {
		super();
		this.bid = bid;
		this.birdName = birdName;
		this.color = color;
		this.isMigratory = isMigratory;
		this.countryWhereMostSeen = countryWhereMostSeen;
		this.weight = weight;
	}
	
}
