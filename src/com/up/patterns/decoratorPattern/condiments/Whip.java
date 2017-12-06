package com.up.patterns.decoratorPattern.condiments;

import com.up.patterns.decoratorPattern.model.Beverage;
import com.up.patterns.decoratorPattern.model.CondimentDecorator;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:53:44 
  * @version 1.0 
*/
public class Whip extends CondimentDecorator {
	//使用实例变量来记录饮料（即被装饰者）
	Beverage beverage;
	
	/**
	 * 通过构造器将被装饰者（饮料）记录到实例变量中
	 * @param beverage
	 */
	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		//返回经过装饰后的饮料完整描述
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		//返回经过该类型配料装配过后的价钱（饮料原价 + 配料价钱）
		double cost = .28 + beverage.cost();
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

	@Override
	public int getSize() {
		return beverage.getSize();
	}

}