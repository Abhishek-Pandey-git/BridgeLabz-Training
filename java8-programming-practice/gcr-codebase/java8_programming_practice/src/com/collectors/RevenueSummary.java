package com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//order class
class Order {
    private String customerName;
    private double totalAmount;

    public Order(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

//execution class
public class RevenueSummary {
	public static void main(String[] args) {
		List<Order> orders = List.of(
			    new Order("Alice", 250.0),
			    new Order("Bob", 180.0),
			    new Order("Alice", 120.0),
			    new Order("Charlie", 300.0),
			    new Order("Bob", 70.0)
			);
		
		Map<String, Double> priceByCutomer=orders.stream().collect(Collectors.groupingBy(e->e.getCustomerName(),Collectors.summingDouble(Order::getTotalAmount)));
		System.out.println(priceByCutomer.toString());
		
	}
}
