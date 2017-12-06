package com.up.patterns.stragyPattern;

import com.up.patterns.stragyPattern.flyImpls.FlyWithWings;
import com.up.patterns.stragyPattern.model.Duck;
import com.up.patterns.stragyPattern.quackImpls.quack;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午8:08:17 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public class ModelDuck extends Duck {
	public ModelDuck(){
		flyBehavior = new FlyWithWings();
		quackBehaviour = new quack();
	}
	
	@Override
	public void display() {
		System.out.println("I`m a model duck.....");
	}

}
