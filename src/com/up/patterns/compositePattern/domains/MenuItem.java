package com.up.patterns.compositePattern.domains;

import java.util.Iterator;

import com.up.patterns.compositePattern.model.MenuComponent;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午7:47:51 
  * @version 1.0 
*/
public class MenuItem extends MenuComponent {
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
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getDescription() {
		return this.description;
	}
	@Override
	public double getPrice() {
		return this.price;
	}
	@Override
	public boolean isVegetarian() {
		return this.vegeterian;
	}
	@Override
	public void print() {
		String str = " " + getName();
		if(isVegetarian()){
			str += "(V)";
		}
		str += ", " + getPrice();
		str += "---" + getDescription();
		System.out.println(str);
	}
	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	
	
}
