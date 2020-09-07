package com.refactor.encapsulateCollection;

import java.util.UUID;

public class TestMain {

	public static void main(String[] args) {
		OrderManager om = new OrderManager();
		Order order = new Order();
		order.setCustomerName("Walmart");
		order.setOrderID("" + UUID.randomUUID());
		order.setValue(3);

		Order order2 = new Order();

		order2.setCustomerName("Microsoft");
		order2.setOrderID("" + UUID.randomUUID());
		order2.setValue(2);

		om.addOrder(order);
		om.addOrder(order2);

		System.out.println(om.getOrderList());
		System.out.println(om.getOrdersTotal());

	}

}
