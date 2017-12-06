package com.up.patterns.factoryPattern;

import com.up.patterns.factoryPattern.model.Pizza;
import com.up.patterns.factoryPattern.model.PizzaStore;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午8:09:02 
  * @version 1.0 
*/
public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		NYPizzaIngredientFactory ingredientFactory = 
				new NYPizzaIngredientFactory();
		if(type.equals("cheese")){
			return new NYStyleCheesePizza(ingredientFactory);
		}
		else {
			return null;
		}
	}

}
