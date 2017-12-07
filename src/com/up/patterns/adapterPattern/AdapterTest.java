package com.up.patterns.adapterPattern;

import org.junit.Test;

import com.up.patterns.adapterPattern.model.ThreeOutlet;
import com.up.patterns.adapterPattern.model.TwoOutlet;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月7日 下午2:07:27 
  * @version 1.0 
*/
public class AdapterTest {
	/**
	 * 所谓的装配器模式，就是让一种对象(adaptee)，经过装饰后，能表现出另一种对象(target)的行为（及调用target的属性或者方法）
	 * 作用：
	 * 1.用adaptee来的逻辑来实现target的现有行为
	 * 2.扩展target的某些行为
	 */
	@Test
	public void test() {
		System.out.println("************原装的美式插头*************");
		ThreeOutlet americanOutlet = new AmericanOutlet();
		americanOutlet.inpower();
		americanOutlet.threeplugs();
		System.out.println("************原装的欧式插头*************");
		TwoOutlet europeanOutlet = new EuropeanOutlet();
		europeanOutlet.inpower();
		europeanOutlet.twoplugs();
		System.out.println("************欧式插头装配成美式插头*************");
		EuropeanOutletAdapter adapter = new EuropeanOutletAdapter(europeanOutlet);
		adapter.inpower();
		adapter.threeplugs();
	}

}
