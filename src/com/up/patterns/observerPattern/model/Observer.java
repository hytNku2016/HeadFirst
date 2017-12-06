package com.up.patterns.observerPattern.model;
/** 
 * 观察者的父类接口
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月1日 下午4:53:31 
  * @version 1.0 
*/
public interface Observer {
	/**
	 * 获取最新的观察数据
	 */
	public void update(float temp, float humidity, float pressure);
}
