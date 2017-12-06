package com.up.patterns.commandPattern.baseModels;
/** 
 * 电灯抽象类
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:03:32 
  * @version 1.0 
*/
public abstract class  Light {
	private String name ;
	
	public Light(String name) {
		this.name = name;
	}

	public abstract void on();
	
	public abstract void off();
}
