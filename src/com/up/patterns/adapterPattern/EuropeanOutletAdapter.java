package com.up.patterns.adapterPattern;

import com.up.patterns.adapterPattern.model.ThreeOutlet;
import com.up.patterns.adapterPattern.model.TwoOutlet;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月7日 下午2:29:12 
  * @version 1.0 
*/
public class EuropeanOutletAdapter implements ThreeOutlet{
	TwoOutlet outlet ;
	
	public EuropeanOutletAdapter(TwoOutlet outlet) {
		this.outlet = outlet;
	}

	@Override
	public void inpower() {
		outlet.inpower() ;
		System.out.println("通过适配电流提高到5v");
	}

	@Override
	public void threeplugs() {
		outlet.twoplugs();
		System.out.println("通过适配插头变成三个");
	}

	
}
