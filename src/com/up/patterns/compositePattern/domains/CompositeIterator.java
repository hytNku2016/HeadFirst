package com.up.patterns.compositePattern.domains;

import java.util.Iterator;
import java.util.Stack;

import com.up.patterns.compositePattern.model.MenuComponent;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年12月12日 下午8:24:42 
  * @version 1.0 
*/
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}
		else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu){
				stack.push(component.createIterator());
			}
			return component;
		}
		else {
			return null;
		}
	}

}
