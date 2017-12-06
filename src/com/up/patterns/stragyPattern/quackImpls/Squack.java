package com.up.patterns.stragyPattern.quackImpls;

import com.up.patterns.stragyPattern.model.QuackBehaviour;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午8:03:22 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public class Squack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squack");
	}

}
