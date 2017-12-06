package com.up.patterns.decoratorPattern;

import com.up.patterns.decoratorPattern.condiments.Mocha;
import com.up.patterns.decoratorPattern.condiments.Whip;
import com.up.patterns.decoratorPattern.drinks.HouseBlend;
import com.up.patterns.decoratorPattern.model.Beverage;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:58:39 
  * @version 1.0 
*/
public class Main {

	public static void main(String[] args) {
		//1.创建一杯纯的houseBlend咖啡
		Beverage beverage = new HouseBlend(Beverage.GRANDE);
		//2.添加摩卡配料
		beverage = new Mocha(beverage);
		//3.再添加一份摩卡配料
		beverage = new Mocha(beverage);
		//4.添加一份奶泡
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription() + " 价格： $" + beverage.cost());
		
	}

}
