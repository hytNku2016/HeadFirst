package com.up.patterns.commandPattern.commands;

import com.up.patterns.commandPattern.baseModels.CeilingFan;
import com.up.patterns.commandPattern.baseModels.Command;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午8:16:20 
  * @version 1.0 
*/
public class CeillingFanMediumCommand implements Command {
	CeilingFan ceilingFan ;
	int preSpeed;
	
	public CeillingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
		preSpeed = ceilingFan.getSpeed();
	}

	@Override
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		if(preSpeed == CeilingFan.HIGH){
			ceilingFan.high();
		}
		else if(preSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();
		}
		else if(preSpeed == CeilingFan.LOW){
			ceilingFan.low();
		}
		if(preSpeed == CeilingFan.OFF){
			ceilingFan.close();
		}
	}

}
