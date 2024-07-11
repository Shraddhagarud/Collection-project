package com.may14;

import java.util.ArrayList;

public class Product implements Comparable<Product> {

	int id;
	String name;
	int qty;
	int cost;

	public Product(int id, String name, int qty, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(Product o) {
		return new Integer(cost).compareTo(new Integer(o.cost));
	}

}
