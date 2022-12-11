package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

import Factory.OrderFactory;
import Factory.ProductFactory;
import Model.Order;
import Model.Product;

class OrderMenuTest {
	
	@Test
	static void request_order() {
		ProductFactory Productfactory = new ProductFactory();
		Product produto1 = (Product) Productfactory.cria("Product");
		
		OrderFactory Orderfactory = new OrderFactory();
		Order carrinho = (Order) Orderfactory.cria("Order");
		
		ArrayList<Product> lista = new ArrayList<Product>();
		
		lista.add(produto1);
		
		carrinho.setProductList(lista);
		
		assertEquals(1, carrinho.getProductList());
	}
	
	@Test
	static void request_orderList() {
		
		ProductFactory Productfactory = new ProductFactory();
		Product produto1 = (Product) Productfactory.cria("Product");
		Product produto2 = (Product) Productfactory.cria("Product");
		Product produto3 = (Product) Productfactory.cria("Product");
		
		OrderFactory Orderfactory = new OrderFactory();
		Order carrinho = (Order) Orderfactory.cria("Order");
		
		ArrayList<Product> lista = new ArrayList<Product>();
		
		lista.add(produto1);
		lista.add(produto2);
		lista.add(produto3);
		
		carrinho.setProductList(lista);
		
		assertEquals(3, carrinho.getProductList());
	}

}
