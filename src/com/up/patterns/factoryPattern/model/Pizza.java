package com.up.patterns.factoryPattern.model;

import java.util.ArrayList;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午7:50:21 
  * @version 1.0 
*/
public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected ArrayList toppings = new ArrayList();
	
	public abstract void prepare();

	public void bake(){
		System.out.println("Bake for 25 minutes at 350`C");
	}

	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box(){
		System.out.println("Place pizza in official PizzaaStroe box");
	}
	
	public String getName(){
		return this.name;
	}
}
