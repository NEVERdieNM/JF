package cer2;

public class Main {
    
    public static void main(String[] args) {
        
        Store store = new Store();

        Product tastatura = new Product("Keyboard", ProductType.ELECTRONICS);
        Product monitor = new Product("Monitor", ProductType.ELECTRONICS);
        Product mouse = new Product("Mouse", ProductType.ELECTRONICS);

        Product sandwich = new Product("Sandwich", ProductType.FOOD);
        Product milk = new Product("Milk", ProductType.FOOD);
        Product ketchup = new Product("Ketchup", ProductType.FOOD);

        Product pants = new Product("Pants", ProductType.CLOTHING);
        Product shoes = new Product("Shoes", ProductType.CLOTHING);
        Product jacket = new Product("jacket", ProductType.CLOTHING);

        store.addProduct(tastatura);
        store.addProduct(monitor);
        store.addProduct(mouse);
        store.addProduct(sandwich);
        store.addProduct(milk);
        store.addProduct(ketchup);
        store.addProduct(pants);
        store.addProduct(shoes);
        store.addProduct(jacket);

        store.showProducts(null);
    }
}
