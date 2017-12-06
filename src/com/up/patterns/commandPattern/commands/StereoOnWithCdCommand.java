package com.up.patterns.commandPattern.commands;

import com.up.patterns.commandPattern.baseModels.Command;
import com.up.patterns.commandPattern.baseModels.Stereo;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:44:18 
  * @version 1.0 
*/
public class StereoOnWithCdCommand implements Command {
	private Stereo stereo ;
	
	public StereoOnWithCdCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}
