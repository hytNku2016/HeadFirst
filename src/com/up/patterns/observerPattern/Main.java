package com.up.patterns.observerPattern;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月4日 上午11:25:38 
  * @version 1.0 
*/
public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = 
				new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statistics = 
				new StatisticsDisplay(weatherData);
		
		currentDisplay.display();
		statistics.display();
		System.out.println("********************");
		weatherData.setMeasurements(12, 13, 14);
		
	}

}
