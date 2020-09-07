package com.refactor.encapsulateCollection;



public class TestMain {
	
	public static void main (String[] args){
	OrderManager om = new OrderManager();
	Order order = new Order();
	Order order2 = new Order();

	om.addOrder(order);
	om.addOrder(order2);
	
	}

}
