/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvutrunghieu_2738;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Trung Hieu
 */
public class Smartphone extends Product {

    private int storageGB;
    private double taxPercent;

    public Smartphone() {
    }

    public Smartphone(int storageGB, double taxPercent) {
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public Smartphone(int storageGB, double taxPercent, String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public void addProducts() {
        super.addProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("storage GB: ");
        setStorageGB(sc.nextInt());
        System.out.println("tax percent: ");
        setTaxPercent(sc.nextDouble());
    }

    @Override
    public void updateProducts() {
        super.updateProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("storage GB: ");
        setStorageGB(sc.nextInt());
        System.out.println("tax percent: ");
        setTaxPercent(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("storage GB: " + this.getStorageGB());
        System.out.println("tax percent: " + this.getTaxPercent());

    }

    @Override
    public double calculatePrice() {
        double storageFee;
        if (this.getStorageGB() >= 512) {
            storageFee = this.getBasePrice() * 0.15;
        } else if (this.getStorageGB() >= 256) {
            storageFee = this.getBasePrice() * 0.1;
        } else {
            storageFee = this.getBasePrice() * 0.05;
        }
        return (this.getBasePrice() + storageFee) * (1 + this.getTaxPercent() / 100);
    }

}
