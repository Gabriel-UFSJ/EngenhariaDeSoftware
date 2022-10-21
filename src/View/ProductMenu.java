package View;

import Controller.Console;

public class ProductMenu extends Menu{
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
			
			
			int option = Integer.parseInt(Console.readLine());
			switch (option) {
				case 1:
					break;
				case 2:
					break;
				case 0:
					exe = false;
					break;
				default:
					System.out.println("Invalid option!"); 
			}
		}
	}
}
