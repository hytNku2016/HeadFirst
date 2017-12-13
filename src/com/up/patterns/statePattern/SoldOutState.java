package com.up.patterns.statePattern;

import com.up.patterns.statePattern.model.GumballMachine;
import com.up.patterns.statePattern.model.State;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月13日 下午7:42:04 
  * @version 1.0 
*/
public class SoldOutState implements State{

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("你已经投入了25美分，不需要重复投入");
	}

	@Override
	public void rejectQuarter() {
		System.out.println("你撤回了投入的25美分");
		this.gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("你转动了曲轴，有25美分,糖果机开始出售糖果");
		this.gumballMachine.setState(gumballMachine.getSoldOutState());
	}

	@Override
	public void dispense() {
		System.out.println("还没有转动曲轴，无法发放糖果");
	}

}
