package com.up.patterns.iteratorPattern.domains;

import java.util.ArrayList;

import com.up.patterns.iteratorPattern.model.Iterator;
import com.up.patterns.iteratorPattern.model.Menu;
import com.up.patterns.iteratorPattern.model.MenuItem;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午6:48:08 
  * @version 1.0 
*/
public class PancakeHouseMenu implements Menu{
	ArrayList menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B","panakes with wreambled eggs and toast", true, 2.99);
		addItem("K&B","panakes with wreambled eggs and toast", true, 2.99);
		addItem("K&B","panakes with wreambled eggs and toast", true, 2.99);
		addItem("K&B","panakes with wreambled eggs and toast", true, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegeterian, double price){
		MenuItem item = new MenuItem(name, description, vegeterian, price);
		menuItems.add(item);
	}

	@Override
	public Iterator createIterator() {
		PancakeHouseIterator iterator = new PancakeHouseIterator(menuItems);
		return iterator;
	}
	
	/*public ArrayList getMenuItems(){
		return this.menuItems;
	}*/
}
