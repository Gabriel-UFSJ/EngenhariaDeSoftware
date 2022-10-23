package Main;

import Persist.OrderPersist;
import Persist.Persist;
import Persist.ProductPersist;
import View.MainMenu;

public class MVC {
	public static void main(String args[]) {
		
		OrderPersist order = OrderPersist.getUniqueInstance();
		order.setList(Persist.PersistLoad("OrderPersist.txt"));
		
		ProductPersist product = ProductPersist.getUniqueInstance();
		product.setList(Persist.PersistLoad("ProductPersist.txt"));
		
		MainMenu menu = new MainMenu();
		menu.ShowMenu();
	}
}
