package com.up.patterns.iteratorPattern;

import org.junit.Test;

import com.up.patterns.iteratorPattern.domains.DinnerMenu;
import com.up.patterns.iteratorPattern.domains.PancakeHouseMenu;
import com.up.patterns.iteratorPattern.domains.Waitress;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午4:50:16 
  * @version 1.0 
*/
public class IteratorTest {

	@Test
	public void test() {
		
		DinnerMenu dinnerMenu = new DinnerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		
		Waitress waitress = new Waitress(dinnerMenu, pancakeHouseMenu);
		waitress.printMenu();
	}

}
