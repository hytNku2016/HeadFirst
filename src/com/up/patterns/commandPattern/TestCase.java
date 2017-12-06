package com.up.patterns.commandPattern;

import org.junit.Test;

import com.up.patterns.commandPattern.baseModels.Light;
import com.up.patterns.commandPattern.commands.LightOffCommand;
import com.up.patterns.commandPattern.commands.LightOnCommand;
import com.up.patterns.commandPattern.receivers.KitchenLight;
import com.up.patterns.commandPattern.receivers.LivingRoomLight;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午5:37:35 
  * @version 1.0 
*/
public class TestCase {

	@Test
	public void test() {
		RemoteControlInvoker invoker = new RemoteControlInvoker();
		
		Light livingRoomLight = new LivingRoomLight();
		Light kitchenLight = new KitchenLight();
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		invoker.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		invoker.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		
		System.out.println(invoker);
		
		invoker.offButtonPressed(0);
		invoker.offButtonPressed(2);
		invoker.offButtonPressed(1);
	}

}
