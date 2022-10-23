package Controller;

import java.util.ArrayList;

import Factory.ProductFactory;
import Model.Entity;
import Model.Product;
import Persist.ProductPersist;

public class ProductController extends Controller{
	
	@Override
	public void Register() {
		ProductFactory modelProduct = new ProductFactory();
		Product model = (Model.Product) modelProduct.cria("Product");
		
		System.out.println("Product Register");
		
		System.out.println("Insert Name: ");
		String Name = Console.readLine();
		System.out.println("Insert ID: ");
		Integer ID = Integer.parseInt(Console.readLine());
		System.out.println("Insert Price of production: ");
		Float PriceProduction = Float.parseFloat(Console.readLine());
		System.out.println("Insert Sell Price: ");
		Float Pricesell = Float.parseFloat(Console.readLine());
		System.out.println("Insert Quantity in stock");
		Integer qtd = Integer.parseInt(Console.readLine());
		
		model.constructor(Name, ID, PriceProduction, Pricesell, qtd);
		
		System.out.println("Product Registred");
	}
	
	@Override
	public Entity SearchID(Integer ID) {
		
		ProductPersist product = ProductPersist.getUniqueInstance();
		
		ArrayList<Entity> list = product.getList();
		
		boolean find = false;
		
		while(!find) {
			for(Entity obj : list){
				if(obj.getID().equals(ID)) {
					find = true;
					return obj;
				}
			}
			if (!find) {
    			System.out.println("Not Found");
    			return null;
    		}
    	}
		return null;
    }

	@Override
	public Entity SearchString(String S) {

		ProductPersist product = ProductPersist.getUniqueInstance();
		
		ArrayList<Entity> list = product.getList();
		
		boolean find = false;
		
		while(!find) {
			for(Entity obj : list){
				if(obj.getName().equals(S)) {
					find = true;
					return obj;
				}
			}
			if (!find) {
    			System.out.println("Not Found");
    			return null;
    		}
    	}
		return null;
	}

}
