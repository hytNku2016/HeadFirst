package com.up.patterns.stragyPattern;

import com.up.patterns.stragyPattern.flyImpls.RocketFly;
import com.up.patterns.stragyPattern.model.Duck;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午8:05:51 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public class Main {
	public static void main(String args[]){
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		Duck duck2 = new ModelDuck();
		duck2.display();
		duck2.performFly();
		duck2.performQuack();
		
		duck2.setFlyBehavior(new RocketFly());
		
		duck2.performFly();
	}
}
