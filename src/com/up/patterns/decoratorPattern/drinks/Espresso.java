package com.up.patterns.decoratorPattern.drinks;

import com.up.patterns.decoratorPattern.model.Beverage;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:26:51 
  * @version 1.0 
*/
public class Espresso extends Beverage {
	
	public Espresso(int size) {
		super();
		this.size = size;
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
