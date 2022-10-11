package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	private List<Product> products = new ArrayList<Product>();
	
	public List<Product> getElements() {
		return products;
	}
	
	public float total() {
		var precio = 0.00f;
		for(int i = 0; i < products.size(); i++) {
			precio = precio + products.get(i).getPrice();
		}
		return precio;
	}
}
