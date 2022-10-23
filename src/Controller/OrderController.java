package Controller;

import java.util.ArrayList;

import Model.Entity;
import Persist.OrderPersist;

public class OrderController extends Controller{
	
	@Override
	public void Register() {
		
	}
	
	@Override
	public void Modify(Entity entity) {
		
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
