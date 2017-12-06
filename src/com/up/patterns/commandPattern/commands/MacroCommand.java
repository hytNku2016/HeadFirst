package com.up.patterns.commandPattern.commands;

import com.up.patterns.commandPattern.baseModels.Command;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午8:32:16 
  * @version 1.0 
*/
public class MacroCommand implements Command{
	Command[] commands ;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for(int i=0; i<commands.length; i++){
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for(int i=commands.length-1; i>=0; i--){
			commands[i].undo();
		}
	}

}
