package com.up.patterns.factoryPattern;

import com.up.patterns.factoryPattern.model.Pizza;
import com.up.patterns.factoryPattern.model.PizzaStore;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午8:11:25 
  * @version 1.0 
*/
public class ChicagoStyleStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		ChicagoPizzaIngredientFactory ingredientFactory = 
				new ChicagoPizzaIngredientFactory();
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza(ingredientFactory);
		}
		else {
			return null;
		}
	}

}
