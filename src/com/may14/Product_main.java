package com.may14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Product_main {

	public static void main(String[] args) {

		ArrayList<Product> prod = new ArrayList<>();
		prod.add(new Product(02, "B", 5, 3000));
		prod.add(new Product(03, "C", 7, 400));
		prod.add(new Product(04, "D", 4, 50));
		prod.add(new Product(05, "E", 5, 8000));
		prod.add(new Product(06, "F", 8, 7000));

		System.out.println("Display all product details:");
		prod.forEach(t -> System.out.println(t));

		System.out.println("\nDisplay cost is more than 100rs:");
		for (Product prods : prod) {
			if (prods.cost >= 100) {
				System.out.println(prods);
			}
		}

		System.out.println("\nDisplay those product qty is more than 5:");
		for (Product prods : prod) {

			if (prods.qty > 5) {
				System.out.println(prods);
			}
		}
		System.out.println("Sort data by cost");
		Collections.sort(prod);
		prod.forEach(t -> System.out.println(t));

	}
}
