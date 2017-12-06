package com.up.patterns.commandPattern;

import java.util.Arrays;

import com.up.patterns.commandPattern.baseModels.Command;
import com.up.patterns.commandPattern.commands.NoCommand;

/**
 * 命令触发器,可能会同时能管理一组命令
 * 持有命令的引用，在某一时刻触发命令 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:27:56 
  * @version 1.0 
*/
public class RemoteControlInvoker {
	Command[] onCommands ;
	Command[] offCommands ;
	Command unDoCommand ;
	
	/**
	 * 命令板只有7个插槽，此处可以参数化
	 */
	public RemoteControlInvoker() {
		this.onCommands = new Command[7] ;
		this.offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		
		for(int i=0; i<7; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		unDoCommand = noCommand;
	}
	
	/**
	 * 设定某一个插槽的命令
	 * @param slot 			:命令板的插槽序号
	 * @param onCommand		：开启命令
	 * @param offCommand	：关闭命令
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot]= offCommand;
	}
	
	/**
	 * 开启按钮按下
	 * @param slot 			：按下的插槽号
	 */
	public void onButtonPressed(int slot){
		Command command = this.onCommands[slot];
		command.execute();
		unDoCommand = command;
	}
	
	/**
	 * 关闭按钮按下
	 * @param slot 			：按下的插槽号
	 */
	public void offButtonPressed(int slot){
		Command command = this.offCommands[slot];
		command.execute();
		unDoCommand = command;
	}
	
	/**
	 * 撤销动作按钮
	 */
	public void undoButtonPressed(){
		unDoCommand.undo();
	}

	@Override
	public String toString() {
		return "RemoteControlInvoker [onCommands=" + Arrays.toString(onCommands) + ", offCommands="
				+ Arrays.toString(offCommands) + "]";
	}
}
