package org.vlarmorgulis.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StudentFamily {

	@Value("priyabrt panda")
	private String name;
	@Value("bhadrak")
	private String city;
	@Value("9124783911")
	private String mob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "StudentFamily [name=" + name + ", city=" + city + ", mob=" + mob + "]";
	}
	
}
