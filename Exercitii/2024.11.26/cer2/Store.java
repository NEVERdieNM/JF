package cer2;

import java.util.HashMap;
import java.util.ArrayList;

public class Store {
    
    HashMap<ProductType, ArrayList<Product>> products = new HashMap<>();

    public Store() {

        for(ProductType type : ProductType.values()) {
            products.put(type, new ArrayList<Product>());
        }
    }

    public void addProduct(Product product) {
        products.get(product.productType).add(product);
    }

    public void showProducts(ProductType productType) {

        if(productType == null) {
            for(HashMap.Entry<ProductType, ArrayList<Product>> entry : products.entrySet()) {
                System.out.println("\n" + entry.getKey() + ":");
                for(Product e : entry.getValue()) {
                    System.out.println("-" + e.name);
                }
            }
        }
        else {
            System.out.println("\n" + productType + ":");
            for(Product e : products.get(productType)) {
                System.out.println("-" + e.name);
            }
        }
    }
}
