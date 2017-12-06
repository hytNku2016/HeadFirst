package com.up.patterns.factoryPattern.model;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午8:42:17 
  * @version 1.0 
*/
public interface PizzaIngredientFactory {
	
	public Dough createDough();
	
	public Sauce createSauce();
	
	public Cheese createCheese();
	
	public Veggies[] createVeggies();
}
