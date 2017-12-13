package com.up.patterns.statePattern.model;

import com.up.patterns.statePattern.HasQuarterState;
import com.up.patterns.statePattern.NoQuarterState;
import com.up.patterns.statePattern.SoldOutState;
import com.up.patterns.statePattern.SoldState;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月13日 下午7:30:41 
  * @version 1.0 
*/
public class GumballMachine {
	// 糖果售罄
	private State soldOutState;
	// 没有25美分
	private State noQuarterState;
	// 有25美分
	private State hasQuarterState;
	// 出售糖果
	private State soldState;
	// 糖果机默认状态为售罄状态
	private State state = soldOutState;
	// 糖果机默认没有糖果
	private int count = 0;
	
	
	public GumballMachine(int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState =new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0){
			//如果糖果机中的糖果大于0 ，则就将糖果机设定为没有25美分状态
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void rejectQuarter(){
		state.rejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		// 发放糖果是一个内部动作，用户不可以直接要求发放糖果
		state.dispense();
	}
	
	public void releaseBall(){
		System.out.println("A gamball comes rolling out the slot...");
		if(count !=0 ){
			count = count -1;
		}
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
