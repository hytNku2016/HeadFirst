package com.up.patterns.stragyPattern.flyImpls;

import com.up.patterns.stragyPattern.model.FlyBehavior;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午8:04:59 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly with wings");
	}

}
