package com.up.patterns.compositePattern.domains;

import com.up.patterns.compositePattern.model.MenuComponent;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午8:00:39 
  * @version 1.0 
*/
public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void print(){
		allMenus.print();
	}
}
