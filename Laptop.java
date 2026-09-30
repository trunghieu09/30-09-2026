/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738;

import java.util.Date;
import java.util.*;

/**
 *
 * @author Trung Hieu
 */
public class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    public Laptop() {
    }

    public Laptop(int warrantyYears, double discountPercent) {
        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    public Laptop(int warrantyYears, double discountPercent, String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addProducts() {
        super.addProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("warrranty year: ");
        setWarrantyYears(sc.nextInt());
        System.out.println("discount percent: ");
        setDiscountPercent(sc.nextDouble());
    }

    @Override
    public void updateProducts() {
        super.updateProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("warrranty year: ");
        setWarrantyYears(sc.nextInt());
        System.out.println("discount percent: ");
        setDiscountPercent(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("warranty year: " + this.getWarrantyYears());
        System.out.println("discount percent: " + this.getDiscountPercent());
    }

    @Override
    public double calculatePrice() {
        double warrantyFee;

        if (this.getWarrantyYears() >= 3) {
            warrantyFee = this.getBasePrice() * 0.08;
        } else {
            warrantyFee = this.getBasePrice() * 0.03;
        }

        return (this.getBasePrice() + warrantyFee)* (1 - this.getDiscountPercent() / 100);
    }
}
