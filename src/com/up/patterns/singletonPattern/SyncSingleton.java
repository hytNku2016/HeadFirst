package com.up.patterns.singletonPattern;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月5日 上午10:55:57 
  * @version 1.0 
*/
public class SyncSingleton {
	private static SyncSingleton instance ;
	
	private SyncSingleton(){}
	
	public static synchronized SyncSingleton getInstance(){
		if(instance == null){
			instance = new SyncSingleton();
		}
		return instance;
	} 
}
