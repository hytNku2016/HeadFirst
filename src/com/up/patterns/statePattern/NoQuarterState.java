package com.up.patterns.statePattern;

import com.up.patterns.statePattern.model.GumballMachine;
import com.up.patterns.statePattern.model.State;

/** 
 *  * TODO:需要完善状态转换
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月13日 下午7:34:18 
  * @version 1.0 
*/
public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("你放入25美分！");
		//状态转化为有25美分状态
		this.gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void rejectQuarter() {
		System.out.println("你还没有投入25美分，无法做撤回动作");
	}

	@Override
	public void turnCrank() {
		System.out.println("请先投入25美分");
	}

	@Override
	public void dispense() {
		System.out.println("还没有放入25美分，无法发放糖果");
	}

}
