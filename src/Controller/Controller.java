package Controller;

import Model.Entity;
import Persist.OrderPersist;
import Persist.Persist;
import Persist.ProductPersist;

public class Controller {

	public void Register() {
	}
	
	public Entity SearchID(Integer ID) {
		return null;	
	}

	public Entity SearchString(String S) {
		return null;
	}

	public static void ExitProgram() {
		
		OrderPersist order = OrderPersist.getUniqueInstance();
		ProductPersist product = ProductPersist.getUniqueInstance();
		
		Persist.PersistSave(order.getList(), "OrderPersist.txt");
		Persist.PersistSave(product.getList(), "ProductPersist.txt");
	}
}