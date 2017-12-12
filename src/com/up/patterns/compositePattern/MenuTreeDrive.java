package com.up.patterns.compositePattern;

import org.junit.Test;

import com.up.patterns.compositePattern.domains.Menu;
import com.up.patterns.compositePattern.domains.MenuItem;
import com.up.patterns.compositePattern.domains.Waitress;
import com.up.patterns.compositePattern.model.MenuComponent;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午8:02:04 
  * @version 1.0 
*/
public class MenuTreeDrive {
	@Test
	public void test(){
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","breakfeast");
		MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
		MenuComponent cafeMenu = new Menu("CAFEMENU MENU","Dinner");
		MenuComponent dessertMenu = new Menu("DESSERTMENU MENU","Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENU","All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);
		
		dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara sauce", true, 3.89));
		dinnerMenu.add(new MenuItem("Pasta2", "Spaghetti with Beef", false, 3.89));
		dinnerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Cake", "Apple Pie", true, 1.59));
		dessertMenu.add(new MenuItem("Orange", "Orange Pie", true, 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.print();
	}
}
