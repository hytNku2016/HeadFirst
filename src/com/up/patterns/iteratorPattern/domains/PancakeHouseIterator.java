package com.up.patterns.iteratorPattern.domains;

import java.util.ArrayList;

import com.up.patterns.iteratorPattern.model.Iterator;
import com.up.patterns.iteratorPattern.model.MenuItem;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午6:55:06 
  * @version 1.0 
*/
public class PancakeHouseIterator implements Iterator {
	ArrayList<MenuItem> items ;
	
	int position = 0;
	
	public PancakeHouseIterator(ArrayList items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		int maxIdx = items.size();
		if(position >= maxIdx || items.get(position) == null){
			return false ;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = items.get(position);
		position ++;
		return item;
	}

}
