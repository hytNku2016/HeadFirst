package com.up.patterns.stragyPattern;

import com.up.patterns.stragyPattern.flyImpls.FlyNoWay;
import com.up.patterns.stragyPattern.model.Duck;
import com.up.patterns.stragyPattern.quackImpls.Squack;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午8:12:55 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehaviour = new Squack();
	}

	@Override
	public void display() {
		System.out.println("I`m a MallardDuck...");
	}

}
