package Factory;

import Controller.OrderController;
import Model.Order;
import View.OrderMenu;
import Persist.OrderPersist;

public class OrderFactory implements Factory<Object> {

    @Override
    public Object cria(String tipo) {
        if("OrderMenu".equalsIgnoreCase(tipo)) {
            return new OrderMenu();
        }

        else if("OrderPersist".equalsIgnoreCase(tipo)) {
            return OrderPersist.getUniqueInstance();
        }

        else if("OrderController".equalsIgnoreCase(tipo)) {
            return new OrderController();
        }

        else if("Order".equalsIgnoreCase(tipo)) {
            return new Order();
        }
        return null;
    }

}
