package org.valarmorgulis.springmvc;

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
	
	
}
