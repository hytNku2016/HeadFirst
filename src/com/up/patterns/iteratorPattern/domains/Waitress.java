package com.up.patterns.iteratorPattern.domains;

import com.up.patterns.iteratorPattern.model.Iterator;
import com.up.patterns.iteratorPattern.model.MenuItem;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午7:14:18 
  * @version 1.0 
*/
public class Waitress {
	DinnerMenu dinnerMenu;
	PancakeHouseMenu pancakeHouseMenu;
	
	public Waitress(DinnerMenu dinnerMenu, PancakeHouseMenu pancakeHouseMenu) {
		this.dinnerMenu = dinnerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenu(){
		Iterator dinnerMenuIerator = dinnerMenu.createIterator();
		Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();
		
		printMenu(dinnerMenuIerator);
		System.out.println("***************");
		printMenu(pancakeMenuIterator);
	}
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ",");
			System.out.println(menuItem.getDescription() + ",");
			System.out.println(menuItem.getPrice() );
		}
	}
	
	
}
