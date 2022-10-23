package Controller;

import java.util.ArrayList;

import Model.Entity;
import Persist.ProductPersist;

public class ProductController extends Controller{
	
	public void Register() {
		
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
