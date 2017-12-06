package com.up.patterns.singletonPattern;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月5日 上午10:50:21 
  * @version 1.0 
*/
public class DoubleCheckLockingSingleton {
	//volatile关键字保证多线程处理instance实例化时，每次都能从内存中获取最新的变量
	//volatile保证新值被立刻写入到memory中，而不会缓存到CPUCache中
	private volatile static DoubleCheckLockingSingleton instance = null;
	
	private DoubleCheckLockingSingleton(){}
	
	/**
	 * 1.线程安全
	 * 2.一定程度上防止线程的锁等待时间
	 * 3.延迟加载，按需分配
	 * @return
	 */
	public DoubleCheckLockingSingleton getInstance(){
		if(instance == null){
			synchronized (DoubleCheckLockingSingleton.class) {
				if(instance == null){
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}
}
