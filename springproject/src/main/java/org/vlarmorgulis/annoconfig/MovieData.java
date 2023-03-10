package org.vlarmorgulis.annoconfig;

import java.util.Date;

import org.springframework.stereotype.Component;


//@Component("objectname")
public class MovieData {
	
	private int moid;
	private String moname;
	private String leadActor;
	private String leadActress;
	private String mainNegativeCharcter;
	private Date YearOfRelease;
	private double lifetimeCollectionInCrore;
	
	public double getLifetimeCollectionInCrore() {
		return lifetimeCollectionInCrore;
	}
	public void setLifetimeCollectionInCrore(double lifetimeCollectionInCrore) {
		this.lifetimeCollectionInCrore = lifetimeCollectionInCrore;
	}
	public int getMoid() {
		return moid;
	}
	public void setMoid(int moid) {
		this.moid = moid;
	}
	public String getMoname() {
		return moname;
	}
	public void setMoname(String moname) {
		this.moname = moname;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getMainNegativeCharcter() {
		return mainNegativeCharcter;
	}
	public void setMainNegativeCharcter(String mainNegativeCharcter) {
		this.mainNegativeCharcter = mainNegativeCharcter;
	}
	public Date getYearOfRelease() {
		return YearOfRelease;
	}
	public void setYearOfRelease(Date yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}
	@Override
	public String toString() {
		return "MovieData [moid=" + moid + ", moname=" + moname + ", leadActor=" + leadActor + ", leadActress="
				+ leadActress + ", mainNegativeCharcter=" + mainNegativeCharcter + ", YearOfRelease=" + YearOfRelease
				+ ", lifetimeCollectionInCrore=" + lifetimeCollectionInCrore + "]";
	}
	

}
