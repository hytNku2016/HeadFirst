package com.up.patterns.decoratorPattern.drinks;

import com.up.patterns.decoratorPattern.model.Beverage;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:29:41 
  * @version 1.0 
*/
public class HouseBlend extends Beverage{
	public HouseBlend(int size) {
		super();
		this.size = size;
		description = "House blend coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
