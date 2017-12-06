package com.up.patterns.commandPattern;

import org.junit.Test;

import com.up.patterns.commandPattern.baseModels.CeilingFan;
import com.up.patterns.commandPattern.baseModels.Command;
import com.up.patterns.commandPattern.baseModels.Light;
import com.up.patterns.commandPattern.commands.CeillingFanHighCommand;
import com.up.patterns.commandPattern.commands.CeillingFanMediumCommand;
import com.up.patterns.commandPattern.commands.CeillingFanOffCommand;
import com.up.patterns.commandPattern.commands.LightOffCommand;
import com.up.patterns.commandPattern.commands.LightOnCommand;
import com.up.patterns.commandPattern.commands.MacroCommand;
import com.up.patterns.commandPattern.receivers.KitchenLight;
import com.up.patterns.commandPattern.receivers.LivingRoomLight;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午5:37:35 
  * @version 1.0 
*/
public class ClientTest {

	@Test
	public void test() {
		RemoteControlInvoker invoker = new RemoteControlInvoker();
		
		Light livingRoomLight = new LivingRoomLight();
		Light kitchenLight = new KitchenLight();
		CeilingFan ceilingFan = new CeilingFan("客厅"); 
		
		Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		
		Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		Command ceilingFanHigh = new CeillingFanHighCommand(ceilingFan);
		Command ceilingFanMedium = new CeillingFanMediumCommand(ceilingFan);
		Command ceilingFanOff = new CeillingFanOffCommand(ceilingFan);
		
		//测试party模式下的宏命令
		Command[] partyOn = {kitchenLightOnCommand,livingRoomLightOnCommand,ceilingFanHigh};
		Command[] partyOff = {kitchenLightOffCommand,livingRoomLightOffCommand,ceilingFanOff};
		Command partyOnMacro = new MacroCommand(partyOn);
		Command partyOffMacro = new MacroCommand(partyOff);
		
		invoker.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		invoker.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		invoker.setCommand(3,ceilingFanHigh , ceilingFanOff);
		invoker.setCommand(4,ceilingFanMedium , ceilingFanOff);
		
		invoker.setCommand(5, partyOnMacro, partyOffMacro);
		
		System.out.println(invoker);
		
		invoker.offButtonPressed(0);
		invoker.undoButtonPressed();
		invoker.offButtonPressed(2);
		invoker.offButtonPressed(1);
		invoker.undoButtonPressed();
		invoker.onButtonPressed(3);
		invoker.onButtonPressed(4);
		invoker.undoButtonPressed();
		System.out.println("****************测试宏命令启动****************");
		invoker.onButtonPressed(5);
		System.out.println("****************测试宏命令关闭****************");
		invoker.offButtonPressed(5);
		System.out.println("****************测试宏命令撤销****************");
		invoker.undoButtonPressed();
	}

}
