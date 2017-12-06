package com.up.patterns.observerPattern;

import com.up.patterns.observerPattern.model.DisplayElement;
import com.up.patterns.observerPattern.model.Observer;
import com.up.patterns.observerPattern.model.Subject;

/** 
 * 当前天气状况布告板
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月1日 下午5:20:07 
  * @version 1.0 
*/
public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	/**
	 * 创建当天天气状况布告板，注入要监控的天气对象
	 * @param weatherData
	 */
	public CurrentConditionDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current conditions:" + this.temp
				+ "F degrees and " + this.humidity + " % humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
