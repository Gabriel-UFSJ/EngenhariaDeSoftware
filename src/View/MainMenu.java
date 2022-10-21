package View;

import Controller.Console;

public class MainMenu extends Menu{
	
	public void ShowMenu() {
		
		boolean exe = true;
		while(exe) {
			System.out.println("Menu");
			System.out.println("1 - Show Product Menu ");//
			System.out.println("2 - Show Order Menu");//
			System.out.println("0 - Exit");//
	
			System.out.print("Choose option: ");
			
			
			int option = Integer.parseInt(Console.readLine());
			switch (option) {
				case 1:
					ShowMenu();
					break;
				case 2:
					ShowMenu();
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
