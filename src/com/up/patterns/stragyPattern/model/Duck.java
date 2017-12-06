package com.up.patterns.stragyPattern.model;

/** 
  * @author  Yuntian HE 
  * @date 创建时间：2017年11月13日 下午7:55:35 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
*/
public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehaviour quackBehaviour;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("all ducks float,even decoys");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	
}
