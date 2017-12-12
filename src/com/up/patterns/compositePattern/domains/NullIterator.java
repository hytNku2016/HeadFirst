package com.up.patterns.compositePattern.domains;

import java.util.Iterator;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午8:33:18 
  * @version 1.0 
*/
public class NullIterator implements Iterator{

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
