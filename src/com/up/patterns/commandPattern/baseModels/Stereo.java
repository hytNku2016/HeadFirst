package com.up.patterns.commandPattern.baseModels;
/** 
 * 音响抽象类
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:21:33 
  * @version 1.0 
*/
public abstract class Stereo {
	private String name;
	private int volume;
	
	public Stereo(String name) {
		this.name = name;
	}
	/**
	 * 打开音响
	 */
	public abstract void on();
	/**
	 * 关闭音响
	 */
	public abstract void off();
	/**
	 * 设置成播放CD
	 */
	public abstract void setCd();
	/**
	 * 设置成播放DVD
	 */
	public abstract void setDvd();
	/**
	 * 设置音量
	 */
	public void setVolume(int volume){
		this.volume = volume;
	} 
	
}
