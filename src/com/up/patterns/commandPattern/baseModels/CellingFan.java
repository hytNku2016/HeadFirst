package com.up.patterns.commandPattern.baseModels;
/** 
 * 吊扇抽象类
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:05:40 
  * @version 1.0 
*/
public abstract class CellingFan {
	private String name ;
	
	public abstract void on();
	
	public abstract void off();
}
