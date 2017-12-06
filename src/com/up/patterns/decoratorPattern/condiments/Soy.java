package com.up.patterns.decoratorPattern.condiments;

import com.up.patterns.decoratorPattern.model.Beverage;
import com.up.patterns.decoratorPattern.model.CondimentDecorator;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午3:20:40 
  * @version 1.0 
*/
public class Soy extends CondimentDecorator {
	Beverage beverage ;
	
	public Soy(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public int getSize() {
		return beverage.getSize();
	}



	@Override
	public String getDescription() {
		return beverage.getDescription() + ", soy";
	}
	
	@Override
	public double cost() {
		double cost = beverage.cost() + 1.0;
		int size = beverage.getSize();
		switch(size){
		case Beverage.TALL:
			cost += .10;
			break;
		case Beverage.GRANDE:
			cost += .15;
			break;
		case Beverage.VENTI:
			cost += .20;
			break;
		default:
			break;
		}
		return cost;
	}

}
