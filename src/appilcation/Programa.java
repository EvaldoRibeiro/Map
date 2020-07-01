package appilcation;

import java.util.HashMap;
import java.util.Map;

import entities.Product;


public class Programa {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 150000.0);
		
		Product ps = new Product("tv", 900.00);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps) );
		
	}

}
