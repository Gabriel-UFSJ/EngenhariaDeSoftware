package View;

import Controller.Console;
import Controller.OrderController;

public class OrderMenu extends Menu{
public void ShowMenu() {
		
		boolean exe = true;
		while(exe) {
			System.out.println("Menu");
			System.out.println("1 - Register Order");//
			System.out.println("2 - Search Order for ID");//
			System.out.println("3 - Search Order for String");
			System.out.println("4 - Remove Order");
			System.out.println("0 - Main Menu");//
	
			System.out.print("Choose option: ");
			
			OrderController controller = new OrderController();
			
			int option = Integer.parseInt(Console.readLine());
			switch (option) {
				case 1:
					controller.Register();
					break;
				case 2:
					System.out.println("Insert ID for search: ");
					Integer id = Integer.parseInt(Console.readLine());
					controller.SearchID(id);
					break;
				case 3:
					System.out.println("Insert Name for search: ");
					String name = Console.readLine();
					controller.SearchString(name);
					
					
				case 0:
					exe = false;
					break;
				default:
					System.out.println("Invalid option!"); 
			}
		}
	}
}
