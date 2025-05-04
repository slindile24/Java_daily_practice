package OOP.question2;

import OOP.DiscountedProduct;

public class Main {
    public static void main(String[] args) {
        DiscountedProduct discountedProduct = new DiscountedProduct("Buns", 10.0, 20);
        Product product = new Product("Sugar", 10);
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 25.0);
        products[1] = new DiscountedProduct("Chocolate", 50.0, 0.10); // 10% off
        products[2] = new Product("Bread", 18.5);

        for (Product item : products) {
            System.out.println("Product: " + item.getName());
            System.out.println("Original Price: R" + item.getPrice());

        }
    }
}
