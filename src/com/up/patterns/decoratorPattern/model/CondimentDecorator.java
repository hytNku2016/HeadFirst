package com.up.patterns.decoratorPattern.model;
/** 
 * 调料抽象类
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:22:26 
  * @version 1.0 
*/
public abstract class CondimentDecorator extends Beverage{
	/**
	 * 重新实现getDescription方法
	 */
	public abstract String getDescription();
	
	public abstract int getSize();
}
