package org.valarmorgulis.autowiring;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;

@Entity
public class book implements InitializingBean,DisposableBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private double height;
	private double width;
	private double price;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy ="book")
	private List<notebook> nb;
	
	public book(int bid, double height, double width, double price, List<notebook> nb) {
		super();
		this.bid = bid;
		this.height = height;
		this.width = width;
		this.price = price;
		this.nb = nb;
	}
	@Override
	public String toString() {
		return "book [bid=" + bid + ", height=" + height + ", width=" + width + ", price=" + price + ", nb=" + nb + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("you know me");
		
	}
	public void destroy() throws Exception {
		System.out.println("it is destroy method");
		
	}
	
	
	
	
	
	

}
