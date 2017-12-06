package com.up.patterns.commandPattern.receivers;

import com.up.patterns.commandPattern.baseModels.Light;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:50:59 
  * @version 1.0 
*/
public class LivingRoomLight extends Light{

	public LivingRoomLight() {
		super("我是起居室照明灯");
	}

	@Override
	public void on() {
		System.out.println("点亮起居室照明灯");
	}

	@Override
	public void off() {
		System.out.println("关闭起居室照明灯");
	}

	
}
