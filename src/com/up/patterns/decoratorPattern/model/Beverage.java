package com.up.patterns.decoratorPattern.model;
/**
 *  
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 下午2:18:59 
  * @version 1.0 
*/
public abstract class Beverage {
	//小杯
	public static final int TALL = 0;
	//中杯
	public static final int GRANDE = 1;
	//大杯
	public static final int VENTI = 2;
	
	protected String description = "Unknown Beverage";
	//所有默认是中杯
	protected int size = Beverage.GRANDE;

	public String getDescription() {
		return description;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public abstract double cost();
}
