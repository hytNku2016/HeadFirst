package com.up.patterns.adapterPattern;

import com.up.patterns.adapterPattern.model.TwoOutlet;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月7日 下午2:20:57 
  * @version 1.0 
*/
public class EuropeanOutlet implements TwoOutlet {

	@Override
	public void inpower() {
		System.out.println("欧式插座输入电流3v");
	}

	@Override
	public void twoplugs() {
		System.out.println("欧式插座有二个插头");
		
	}


}
