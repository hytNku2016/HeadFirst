package com.up.patterns.factoryPattern;

import com.up.patterns.factoryPattern.model.Pizza;
import com.up.patterns.factoryPattern.model.PizzaIngredientFactory;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午8:04:43 
  * @version 1.0 
*/
public class ChicagoStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory ;
	
	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		name = "Chicago Style Sauce And Cheese Pizza";
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
}
