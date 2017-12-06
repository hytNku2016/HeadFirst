package com.up.patterns.commandPattern.commands;

import com.up.patterns.commandPattern.baseModels.Command;
import com.up.patterns.commandPattern.baseModels.Light;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:41:56 
  * @version 1.0 
*/
public class LightOnCommand implements Command {
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
