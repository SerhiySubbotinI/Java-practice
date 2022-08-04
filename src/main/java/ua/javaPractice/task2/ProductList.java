package ua.javaPractice.task2;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    List<Product> products = new ArrayList<>();

    public ProductList() {
        products.add(0, new Product(1, "Apple", 1.0));
        products.add(1, new Product(2, "Mango", 2.00));
        products.add(2, new Product(3, "Orange", 1.5));
    }

    public void printProduct() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + products +
                '}';
    }
}
