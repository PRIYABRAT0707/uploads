package org.vlarmorgulis.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("format")
public class UsingSpringExpressionLanguage {
	@Value("#{((677-79)*7)/100}")
	private double a;
	@Value("#{56-89+78}")
	private int b;
	//@value("#{T(class name).methodname(parameter)}")
	@Value("#{T(java.lang.Math).sqrt(700)}")
	private double c;
	
	@Value("#{new java.lang.String('ppanda')}")
	private String name;
	
	@Value("#{6>3}")
	private boolean avilable;
	
	
	public boolean isAvilable() {
		return avilable;
	}

	public void setAvilable(boolean avilable) {
		this.avilable = avilable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UsingSpringExpressionLanguage [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}



}
