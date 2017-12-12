package com.up.patterns.iteratorPattern.domains;

import com.up.patterns.iteratorPattern.model.Iterator;
import com.up.patterns.iteratorPattern.model.MenuItem;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午6:52:04 
  * @version 1.0 
*/
public class DinnerMenuIterator implements Iterator {
	MenuItem[] items;
	
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position ++;
		return menuItem;
	}

}
