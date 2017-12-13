package com.up.patterns.statePattern;

import com.up.patterns.statePattern.model.GumballMachine;
import com.up.patterns.statePattern.model.State;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月13日 下午7:42:04 
  * @version 1.0 
*/
public class SoldState implements State{

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("请等待，我们正在给你糖果....");
	}

	@Override
	public void rejectQuarter() {
		System.out.println("对不起，你已经摇动曲轴，无法进行退款动作");
	}

	@Override
	public void turnCrank() {
		System.out.println("重复转动曲轴，无法获取两个糖果");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(this.gumballMachine.getCount() > 0){
			System.out.println("恭喜，你得到一个糖果");
			this.gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("Oops! 糖果已经卖完了！！");
			this.gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
