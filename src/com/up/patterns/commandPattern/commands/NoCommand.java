package com.up.patterns.commandPattern.commands;

import com.up.patterns.commandPattern.baseModels.Command;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:31:34 
  * @version 1.0 
*/
public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("命令未设定....");
	}

}
