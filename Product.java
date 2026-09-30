/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Trung Hieu
 */
public abstract class Product implements IProduct {

    private String id;
    private double basePrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    public Product() {
    }

    public Product(String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        this.id = id;
        this.basePrice = basePrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public abstract double calculatePrice();

    @Override
    public void displayDetails() {
        SimpleDateFormat pdf = new SimpleDateFormat();
        System.out.println("ID: " + this.getId());
        System.out.println("base price: " + this.getBasePrice());
        System.out.println("import date: " + pdf.format(importDate));
        System.out.println("is available: " + this.isIsAvailable());
        System.out.println("quantity: " + this.getQuantity());
    }

    @Override
    public void updateProducts() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("base price: ");
            setBasePrice(sc.nextDouble());
            SimpleDateFormat pdf = new SimpleDateFormat();
            System.out.println("import date: ");
            String date = sc.nextLine();
            setImportDate(pdf.parse(date));
            System.out.println("is available: ");
            setIsAvailable(sc.nextBoolean());
            System.out.println("quantity: ");
            setQuantity(sc.nextInt());
        } catch (ParseException ex) {
            System.out.println("Wrong format");
        }
    }

    @Override
    public void addProducts() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("ID: ");
            setId(sc.nextLine());
            System.out.println("base price: ");
            setBasePrice(sc.nextDouble());
            SimpleDateFormat pdf = new SimpleDateFormat();
            System.out.println("import date: ");
            String date = sc.nextLine();
            setImportDate(pdf.parse(date));
            System.out.println("is available: ");
            setIsAvailable(sc.nextBoolean());
            System.out.println("quantity: ");
            setQuantity(sc.nextInt());
        } catch (ParseException ex) {
            System.out.println("Wrong format");
        }
    }
}
