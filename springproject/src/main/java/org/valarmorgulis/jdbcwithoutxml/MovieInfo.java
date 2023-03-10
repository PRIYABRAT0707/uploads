package org.valarmorgulis.jdbcwithoutxml;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Entity
//@Table(name = "movieinformation")
@Component("movieinfo")
@Scope("prototype")

public class MovieInfo {
	@Value("#{13}")
	//@Id
	private int moid;
	@Value("#{new java.lang.String('black hawk')}")
	private String moname;
	@Value("#{new java.lang.String('jerald buttler')}")
	private String leadActor;
	@Value("#{new java.lang.String('jodi commer')}")
	private String leadActress;
	@Value("#{new java.lang.String('al-pashino')}")
	private String mainNegativeCharcter;
	@Value("#{new java.lang.String('2013')}")
	private String YearOfRelease;
	@Value("#{1000}")
	private int lifetimeCollectionInCrore;
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
	public String getYearOfRelease() {
		return YearOfRelease;
	}
	public void setYearOfRelease(String yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}
	public double getLifetimeCollectionInCrore() {
		return lifetimeCollectionInCrore;
	}
	public void setLifetimeCollectionInCrore(int lifetimeCollectionInCrore) {
		this.lifetimeCollectionInCrore = lifetimeCollectionInCrore;
	}
	@Override
	public String toString() {
		return "MovieInfo [moid=" + moid + ", moname=" + moname + ", leadActor=" + leadActor + ", leadActress="
				+ leadActress + ", mainNegativeCharcter=" + mainNegativeCharcter + ", YearOfRelease=" + YearOfRelease
				+ ", lifetimeCollectionInCrore=" + lifetimeCollectionInCrore + "]";
	}
	

}
