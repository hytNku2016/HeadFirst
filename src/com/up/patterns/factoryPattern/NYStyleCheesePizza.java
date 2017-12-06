package com.up.patterns.factoryPattern;

import com.up.patterns.factoryPattern.model.Pizza;
import com.up.patterns.factoryPattern.model.PizzaIngredientFactory;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午8:01:46 
  * @version 1.0 
*/
public class NYStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory ;
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory ){
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		name = "NY Style Sauce And Cheese Pizza";
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		
		toppings.add("Grated Riggiano Cheese");
	}
}
