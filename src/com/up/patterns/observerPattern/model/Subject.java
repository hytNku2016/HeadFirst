package com.up.patterns.observerPattern.model;
/** 
 * 主题，是订阅者订阅的对象
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月1日 下午4:51:54 
  * @version 1.0 
*/
public interface Subject {
	/**
	 * 订阅者订阅当前主题
	 * @param o
	 * @return
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 订阅者取消对当前主题的订阅
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 主题对订阅者进行广播通知
	 */
	public void notifyObservers();
}
