package com.up.patterns.factoryPattern;

import com.up.patterns.factoryPattern.model.Cheese;
import com.up.patterns.factoryPattern.model.Dough;
import com.up.patterns.factoryPattern.model.PizzaIngredientFactory;
import com.up.patterns.factoryPattern.model.Sauce;
import com.up.patterns.factoryPattern.model.Veggies;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午8:46:42 
  * @version 1.0 
*/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

}
