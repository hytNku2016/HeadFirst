package com.up.patterns.commandPattern.receivers;

import com.up.patterns.commandPattern.baseModels.Light;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:48:46 
  * @version 1.0 
*/
public class KitchenLight extends Light {

	public KitchenLight() {
		super("我是一个厨房的照明灯");
	}

	@Override
	public void on() {
		System.out.println("点亮厨房的照明灯");
	}

	@Override
	public void off() {
		System.out.println("关闭厨房的照明灯");
	}

}
