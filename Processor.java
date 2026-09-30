/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nguyenvutrunghieu_2738;

import java.util.*;

/**
 *
 * @author Trung Hieu
 */
public class Processor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductArrayList a = new ProductArrayList();
        int nhap;
        do {
            System.out.println("1.	Add a Laptop or Smartphone.\n"
                    + "2.	Update a product by ID.\n"
                    + "3.	Delete a product by ID.\n"
                    + "4.	Display all products.\n"
                    + "5.	Display products currently available for sale.\n"
                    + "6.	Calculate and display the highest selling price among all products using findHighestPrice().\n"
                    + "7.	Exit the program.");
            System.out.println("Enter an option: ");
            nhap = sc.nextInt();
            sc.nextLine();
            switch (nhap) {
                case 1: {
                    System.out.println("1.Laptop | 2.Smartphone");
                    int enter = sc.nextInt();
                    sc.nextLine();
                    if (enter == 1) {
                        Laptop laptop = new Laptop();
                        laptop.addProducts();
                        a.addProductToArrayList(laptop);
                    } else if (enter == 2) {
                        Smartphone smartphone = new Smartphone();
                        smartphone.addProducts();
                        a.addProductToArrayList(smartphone);
                    } else {
                        System.out.println("Wrong option!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter id to update: ");
                    String id = sc.nextLine();
                    a.updateProductById(id);
                    break;
                }
                case 3: {
                    System.out.println("Enter id to delete: ");
                    String id = sc.nextLine();
                    a.deleteProductById(id);
                    break;
                }
                case 4: {
                    a.displayAllProducts();
                    break;
                }
                case 5: {
                    a.displayAvailableProducts();
                    break;
                }
                case 6: {
                    a.findHighestPrice();
                    break;
                }
                case 0: {
                    System.out.println("exit!");
                }
            }
        } while (nhap != 0);
    }
}
