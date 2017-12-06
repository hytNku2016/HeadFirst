package com.up.patterns.observerPattern.model;
/** 
 * 展示元素的父类接口，供订阅者进行展示收到的主题信息
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月1日 下午4:58:09 
  * @version 1.0 
*/
public interface DisplayElement {
	/**
	 * 展示主题消息
	 */
	public void display();
}
