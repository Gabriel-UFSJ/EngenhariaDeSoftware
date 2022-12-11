package View;

import Factory.OrderFactory;
import Model.Order;
import Model.Product;

import java.util.ArrayList;

import Controller.Console;
import Controller.OrderController;
import Controller.ProductController;

public class OrderMenu extends Menu{

	@Override
	public void ShowMenu() {
		
		ArrayList<Product> lista = new ArrayList<Product>();
		
		boolean exe = true;
		while(exe) {
			
			System.out.println("Menu");
			System.out.println("1 - Register Order");//
			System.out.println("2 - Search Order for ID");//
			System.out.println("3 - Search Order for String");
			System.out.println("4 - Modify Order");
			System.out.println("0 - Main Menu");// 
	
			System.out.print("Choose option: ");
			
			OrderController Ordercontroller = new OrderController();
			ProductController Productcontroller = new ProductController();
			
			int option = Integer.parseInt(Console.readLine());
			switch (option) {
				case 1: 	
					lista.clear();
					
					
					OrderFactory factory = new OrderFactory();
					Order order = (Order) factory.cria("Order");
					
					System.out.println("Digite o Id da sua compra");
					int id = Integer.parseInt(Console.readLine());
					
					System.out.println("Digite o nome da sua compra");
					String name =  Console.readLine();
					
					System.out.println("Digite o numero do seu documento");
					String document =  Console.readLine();
					
					int x = 1;
					while(x != 0) {
						System.out.println("Digite o nome do produto");
						String produto =  Console.readLine();
						lista.add((Product) Productcontroller.SearchString(produto));
						
						System.out.println("Digite 1 para adicionar e 0 para sair");
						x = Integer.parseInt(Console.readLine());
					}
					
					
					
					order.constructor(name, id, document,lista);
					break;
					
				case 2: 
					
					System.out.println("Insert ID for search: ");
					Integer id1 = Integer.parseInt(Console.readLine());
					Ordercontroller.SearchID(id1);
					break;
					
				case 3:
					
					System.out.println("Insert Name for search: ");
					String name1 = Console.readLine();
					Ordercontroller.SearchString(name1);
					break;
					
				case 4:
					lista.clear();
					
					System.out.println("Insert Name for search: ");
					String name11 = Console.readLine();
					Order Order1 = (Order) Ordercontroller.SearchString(name11);
					
					System.out.println("Insert Name for search: ");
					String product = Console.readLine();
					lista.add((Product) Ordercontroller.SearchString(product));
					
					System.out.println("Digite o Id da sua compra");
					int id11 = Integer.parseInt(Console.readLine());
					
					System.out.println("Digite o nome da sua compra");
					String name111 =  Console.readLine();
					
					System.out.println("Digite o numero do seu documento");
					String document1 =  Console.readLine();
					
					Order1.constructor(name111, id11, document1,lista);
					
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