package com.up.patterns.decoratorPattern.drinks;

import com.up.patterns.decoratorPattern.model.Beverage;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:54:41 
  * @version 1.0 
*/
public class DarkRoast extends Beverage{
	
	public DarkRoast(int size) {
		super();
		this.size = size;
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 2.38;
	}

}
