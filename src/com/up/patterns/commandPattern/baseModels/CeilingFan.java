package com.up.patterns.commandPattern.baseModels;
/** 
 * 吊扇抽象类
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:05:40 
  * @version 1.0 
*/
public  class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private String location;
	private int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	/**
	 * 设置高速运转
	 */
	public void high(){
		speed = HIGH;
		System.out.println("设置高速运转");
	}
	/**
	 * 设置中速运转
	 */
	public void medium(){
		speed = MEDIUM;
		System.out.println("设置中速运转");
	}
	
	/**
	 * 设置低速运转
	 */
	public void low(){
		speed = LOW;
		System.out.println("设置低速运转");
	}
	
	/**
	 * 设置关闭
	 */
	public void close(){
		speed = OFF;
		System.out.println("设置停止运转");
	}
	
	public int getSpeed(){
		return speed;
	}
}
