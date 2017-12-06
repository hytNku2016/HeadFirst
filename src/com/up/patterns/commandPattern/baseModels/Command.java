package com.up.patterns.commandPattern.baseModels;
/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月6日 下午4:02:49 
  * @version 1.0 
*/
public interface Command {
	public void execute();
	/**
	 * 命令撤销动作,即执行一次相反操作 
	 */
	public void undo();
}
