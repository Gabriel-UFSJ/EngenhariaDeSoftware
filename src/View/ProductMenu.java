package View;

import Controller.Console;
import Controller.ProductController;
import Factory.ProductFactory;
import Model.Product;

public class ProductMenu extends Menu{
	
	@Override
	public void ShowMenu() {
		
		boolean exe = true;
		while(exe) {
			System.out.println("Menu");
			System.out.println("1 - Register Product");//
			System.out.println("2 - Search Product for ID");//
			System.out.println("3 - Search Product for String");
			System.out.println("4 - Modify Product");
			System.out.println("0 - Main Menu");//
	
			System.out.print("Choose option: ");
			
			ProductController controller = new ProductController();
			
			int option = Integer.parseInt(Console.readLine());
			switch (option) {
				case 1: 					
					
					ProductFactory factory = new ProductFactory();
					Product product = (Product) factory.cria("Product");
					
					System.out.println("Digite o Id do seu produto");
					int id = Integer.parseInt(Console.readLine());
					
					System.out.println("Digite o nome do produto");
					String name =  Console.readLine();
					
					System.out.println("Digite o preço do produto");
					Float preço = Float.parseFloat(Console.readLine());
					
					System.out.println("Digite o preço de venda");
					Float valor = Float.parseFloat(Console.readLine());
					
					System.out.println("Digite a quantidade no estoque");
					int quantidade = Integer.parseInt(Console.readLine());
					
					product.constructor(name, id, preço, valor, quantidade);
					break;
				
				case 2: 
					
					System.out.println("Insert ID for search: ");
					Integer id1 = Integer.parseInt(Console.readLine());
					controller.SearchID(id1);
					break;
					
				case 3:
					
					System.out.println("Insert Name for search: ");
					String name1 = Console.readLine();
					controller.SearchString(name1);
					break;
				
				case 4:
					
					System.out.println("Insert Name for search: ");
					String name11 = Console.readLine();
					product = (Product) controller.SearchString(name11);
					
					
					System.out.println("Digite o Id do seu produto");
					int id2 = Integer.parseInt(Console.readLine());
					
					System.out.println("Digite o nome do produto");
					String name2 =  Console.readLine();
					
					System.out.println("Digite o preço do produto");
					Float preço2 = Float.parseFloat(Console.readLine());
					
					System.out.println("Digite o preço de venda");
					Float valor2 = Float.parseFloat(Console.readLine());
					
					System.out.println("Digite a quantidade no estoque");
					int quantidade2 = Integer.parseInt(Console.readLine());
					
					product.constructor(name2, id2, preço2, valor2, quantidade2);
					
					break;
					
				case 0:
					MainMenu menu = new MainMenu();
					menu.ShowMenu();
					exe = false;
					break;
				default:
					System.out.println("Invalid option!"); 
			}
		}
	}
}