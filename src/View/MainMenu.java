package View;

import Controller.Console;
import Controller.Controller;
import Factory.OrderFactory;
import Factory.ProductFactory;

public class MainMenu extends Menu{

    @Override
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
                    ProductFactory menuProduct = new ProductFactory();
                    Menu Menu = (View.Menu) menuProduct.cria("OrderMenu");
                    Menu.ShowMenu();
                    break;
                case 2:
                    OrderFactory menuOrder = new OrderFactory();
                    Menu Menu2 = (Menu) menuOrder.cria("OrderMenu");
                    Menu2.ShowMenu();
                    break;
                case 0:
                    Controller.ExitProgram();
                    break;
                default:
                    System.out.println("Invalid option!"); 
            }
        }
    }
}