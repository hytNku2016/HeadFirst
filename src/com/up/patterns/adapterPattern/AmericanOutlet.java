package com.up.patterns.adapterPattern;

import com.up.patterns.adapterPattern.model.ThreeOutlet;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月7日 下午2:20:57 
  * @version 1.0 
*/
public class AmericanOutlet implements ThreeOutlet {

	@Override
	public void inpower() {
		System.out.println("美式插座输入电流5v");
	}

	@Override
	public void threeplugs() {
		System.out.println("美式插座有三个插头");
		
	}


}
