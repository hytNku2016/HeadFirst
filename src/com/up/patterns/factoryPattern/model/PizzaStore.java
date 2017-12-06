package com.up.patterns.factoryPattern.model;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午7:49:49 
  * @version 1.0 
*/
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
	

}
