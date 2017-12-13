package com.up.patterns.statePattern.model;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月13日 下午7:27:58 
  * @version 1.0 
*/
public interface State {
	/**
	 * 插入25美分
	 */
	public void insertQuarter();
	/**
	 * 退回25美分
	 */
	public void rejectQuarter();
	/**
	 * 转动曲轴
	 */
	public void turnCrank();
	/**
	 * 发放糖果
	 */
	public void dispense();
}
