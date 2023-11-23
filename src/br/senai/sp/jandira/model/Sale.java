package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Sale {
    Scanner scanner = new Scanner(System.in);
    private String productName, customerName;
    private int productPrice;

    public void makeSale(){
        System.out.println("/- Make Sale -/");
        System.out.println("Enter the product name: ");
        this.productName = scanner.nextLine();
        System.out.println("Enter the customer name: ");
        this.customerName = scanner.nextLine();
        System.out.println("Enter the product price: U$");
        this.productPrice = scanner.nextInt();
        System.out.println("Sale registered successfully");
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
