package Factory;

import Controller.ProductController;
import Model.Product;
import Persist.ProductPersist;
import View.ProductMenu;

public class ProductFactory implements Factory<Object> {

        @Override
    public Object cria(String tipo) {
            if("ProductMenu".equalsIgnoreCase(tipo)) {
                return new ProductMenu();
            }

            else if("ProductPersist".equalsIgnoreCase(tipo)) {
                return ProductPersist.getUniqueInstance();
            }

            else if("ProductController".equalsIgnoreCase(tipo)) {
                return new ProductController();
            }

            else if("Product".equalsIgnoreCase(tipo)) {
                return new Product();
            }
			return null;
        }

}
