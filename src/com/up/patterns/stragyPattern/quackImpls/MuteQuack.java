package com.up.patterns.stragyPattern.quackImpls;

import com.up.patterns.stragyPattern.model.QuackBehaviour;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午8:02:10 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public class MuteQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("<<slience>>");
	}

}
