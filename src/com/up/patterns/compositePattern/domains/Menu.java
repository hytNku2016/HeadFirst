package com.up.patterns.compositePattern.domains;

import java.util.ArrayList;
import java.util.Iterator;

import com.up.patterns.compositePattern.model.MenuComponent;

/** 
 * 组合项
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午7:52:05 
  * @version 1.0 
*/
public class Menu extends MenuComponent {
	ArrayList menuComponents = new ArrayList();
	String name ;
	String description;
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}
	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getDescription() {
		return this.description;
	}
	@Override
	public void print() {
		String str = "\n" + getName();
		str += ", " + getDescription();
		str += "\n-------------------- ";
		System.out.println(str);
		//递归打印自己
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}
	@Override
	public Iterator createIterator() {
		return  new CompositeIterator(menuComponents.iterator());
	}
	
	
	
}
