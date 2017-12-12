package com.up.patterns.iteratorPattern.domains;

import com.up.patterns.iteratorPattern.model.Iterator;
import com.up.patterns.iteratorPattern.model.Menu;
import com.up.patterns.iteratorPattern.model.MenuItem;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午6:37:54 
  * @version 1.0 
*/
public class DinnerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menus;
	public DinnerMenu() {
		menus = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of day", "with a piece fo potato salad", true, 2.99);
		addItem("Hotdog", "a hot dog, with saurkraut, relish, onions , topped with cheese", true, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegeterian, double price){
		MenuItem item = new MenuItem(name, description, vegeterian, price);
		if(numberOfItems >= MAX_ITEMS){
			System.err.println("Sorry, menu is full! Can`t add item to menu");
		} else {
			menus[numberOfItems] = item;
			numberOfItems ++;
		}
	}

	@Override
	public Iterator createIterator() {
		DinnerMenuIterator iterator = new DinnerMenuIterator(menus);
		
		return iterator;
	}
	
	/*public MenuItem[] getmenuItems(){
		return menus;
	}*/
}
