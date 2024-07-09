package com.innovator.learnit.OOP.ClassesAndObjects;

import java.math.BigDecimal;

public class Courses {

	private String name;
	private BigDecimal price;
	
	private Courses() {
		
	}
	
	private Courses(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Course [name = " + name + ", price = " + price + "]";
	}
}
