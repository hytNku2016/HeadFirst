package com.up.patterns.compositePattern.model;
/** 
 * 菜单组件
 * 某些方法只对菜单项有意义，而有些只对菜单有意义，默认实现是抛出UnsupportedOperationException
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午7:41:00 
  * @version 1.0 
*/
public abstract class MenuComponent {
	/**
	 * 菜单组件添加子组件接口
	 * @param menuComponent
	 */
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	/**
	 * 菜单组件移除子组件接口
	 * @param component
	 */
	public void remove(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	/**
	 * 获取某个子节点
	 * @param i
	 * @return
	 */
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	/**
	 * 获取获取菜单项的名称
	 * @return
	 */
	public String getName(){
		throw new UnsupportedOperationException();
	}
	/**
	 * 获取菜单项描述
	 * @return
	 */
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	/**
	 * 获取菜单价格
	 * @return
	 */
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	/**
	 * 获取菜单是否是素食
	 * @return
	 */
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	/**
	 * 打印菜单
	 * @return
	 */
	public void print(){
		throw new UnsupportedOperationException();
	}
}
