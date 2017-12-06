package com.up.patterns.singletonPattern;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月5日 上午10:46:19 
  * @version 1.0 
*/
public class StaticSingleton {
	private static StaticSingleton uniqueInstance = new StaticSingleton();
	
	private StaticSingleton(){
		
	}
	/**
	 * 使用静态方法返回单例
	 * 好处：
	 * 1.线程安全
	 * 2.保证单例对象优先创建
	 * 缺点：
	 * 1.如果创建过程比较复杂，负担比较重，则会影响效率
	 * 2.预先创建出单例，有可能运行一直用不到，造成资源冗余
	 * @return
	 */
	public static StaticSingleton getInstance(){
		return uniqueInstance;
	}
}
