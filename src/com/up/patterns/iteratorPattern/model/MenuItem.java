package com.up.patterns.iteratorPattern.model;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午6:39:20 
  * @version 1.0 
*/
public class MenuItem {
	String name;
	String description;
	boolean vegeterian;
	double price;
	public MenuItem(String name, String description, boolean vegeterian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegeterian = vegeterian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegeterian() {
		return vegeterian;
	}
	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
