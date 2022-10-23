package Controller;

import java.util.ArrayList;

import Factory.OrderFactory;
import Model.Entity;
import Model.Order;
import Persist.OrderPersist;

public class OrderController extends Controller{
	
	@Override
	public void Register() {
		OrderFactory modelOrder = new OrderFactory();
		Order model = (Model.Order) modelOrder.cria("Order");
		
		System.out.println("Order Register");
		
		System.out.println("Insert Name: ");
		String Name = Console.readLine();
		System.out.println("Insert ID: ");
		Integer ID = Integer.parseInt(Console.readLine());
		System.out.println("Insert Document Number");
		String DocumentNumber = Console.readLine();
		
		model.constructor(Name, ID, DocumentNumber);
		
		System.out.println("Order Registred");
		
		
		
		
		
	}	
	
	@Override
	public Entity SearchID(Integer ID) {
		
		OrderPersist order = OrderPersist.getUniqueInstance();
		
		ArrayList<Entity> list = order.getList();
		
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

		OrderPersist order = OrderPersist.getUniqueInstance();
		
		ArrayList<Entity> list = order.getList();
		
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
