package org.valarmorgulis.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="specification")
public class MobileSpecs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String processor;
	private double price;
	private int camera_in_mp;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCamera_in_mp() {
		return camera_in_mp;
	}
	public void setCamera_in_mp(int camera_in_mp) {
		this.camera_in_mp = camera_in_mp;
	}

	
	
	@Override
	public String toString() {
		return "MobileSpecs [id=" + id + ", name=" + name + ", processor=" + processor + ", price=" + price
				+ ", camera_in_mp=" + camera_in_mp + "]";
	}
}
