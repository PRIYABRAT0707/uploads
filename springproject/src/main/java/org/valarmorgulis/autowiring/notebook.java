package org.valarmorgulis.autowiring;

import javax.annotation.Generated;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;

@Entity
public class notebook {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private int nid;
	private double height;
	private double width;
	private double price;
	private int pages;
	private int quantity;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private book book;
	@Override
	public String toString() {
		return "notebook [nid=" + nid + ", height=" + height + ", width=" + width + ", price=" + price + ", pages="
				+ pages + ", quantity=" + quantity + "]";
	}
	public notebook(int nid, double height, double width, double price, int pages, int quantity,book book) {
		super();
		this.nid = nid;
		this.height = height;
		this.width = width;
		this.price = price;
		this.pages = pages;
		this.quantity = quantity;
		this.book=book;
	}
	@PostConstruct
	public void start() {
		System.out.println("note start");
	}
	@PreDestroy
	public void end() {
		System.out.println("note end");
	}
	
}
