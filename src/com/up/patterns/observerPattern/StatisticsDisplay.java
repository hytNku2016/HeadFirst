package com.up.patterns.observerPattern;

import com.up.patterns.observerPattern.model.DisplayElement;
import com.up.patterns.observerPattern.model.Observer;
import com.up.patterns.observerPattern.model.Subject;

/** 
 * 跟踪最大，平均，最小观察值的布告板
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 上午11:17:10 
  * @version 1.0 
*/
public class StatisticsDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	

	@Override
	public void display() {
		System.out.println("Static statistics display:[temp = " + this.temp 
				+ " F degree and humidity= " + this.humidity + " % humidity"
				+ " pressure = " + this.pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
}
