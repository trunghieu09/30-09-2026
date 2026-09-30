/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738;

import java.util.*;

/**
 *
 * @author Trung Hieu
 */
public class ProductArrayList {

    ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProductToArrayList(Product product) {
        products.add(product);
    }

    public void updateProductById(String id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId().equalsIgnoreCase(id)) {
                product.updateProducts();
                System.out.println("update successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void deleteProductById(String id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId().equalsIgnoreCase(id)) {
                products.remove(i);
                System.out.println("delete successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void displayAllProducts() {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            product.displayDetails();
        }
    }

    public void displayAvailableProducts() {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.isIsAvailable()) {
                product.displayDetails();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No available product!");
        }
    }

    public void findHighestPrice() {
        if (products.isEmpty()) {
            System.out.println("Product list is empty!");
            return;
        }
        Product highest = products.get(0);
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.calculatePrice() > highest.calculatePrice()) {
                highest = product;
            }
        }
        System.out.println("Product with the highest price: ");
        highest.displayDetails();
    }
}
