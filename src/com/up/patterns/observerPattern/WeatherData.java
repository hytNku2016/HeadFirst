package com.up.patterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

import javax.management.Notification;

import com.up.patterns.observerPattern.model.Observer;
import com.up.patterns.observerPattern.model.Subject;

/** 
 * 天气信息主题
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月1日 下午5:04:20 
  * @version 1.0 
 * @param <T>
*/
public class WeatherData implements Subject {
	//订阅者的列表容器
	private  List observers;
	//天气的温度属性
	private float temp;
	//天气的湿度属性
	private float humidity;
	//天气的气压属性
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i == -1 ){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i< observers.size(); i++) {
			Observer o = (Observer) observers.get(i);
			o.update(this.temp, this.humidity, this.pressure);
		}
	}
	
	/**
	 * 天气属性变化时，通知观察者
	 */
	public void measuresChanged(){
		notifyObservers();
	}
	
	/**
	 * 天气检测中心抓取天气变化的接口
	 * TODO:和硬件检测接口对接
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measuresChanged();
	}

}
