package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Products {
    Scanner scanner = new Scanner(System.in);
    private int idProducts;
    private int code;
    private String name;
    private int quantityStock;
    private double unitPrice;
    private String supplier;

    public void registerProducts(){
        System.out.println("----------------------------------------------------");
        System.out.println("                Register of Products                ");
        System.out.println("----------------------------------------------------");
        System.out.println("Code:                                               ");
        this.code = scanner.nextInt();
        System.out.println("Your name:                                          ");
        this.name = scanner.nextLine();
        System.out.println("Quantity in stock:                                  ");
        this.quantityStock = scanner.nextInt();
        System.out.println("Unit Price: U$                                      ");
        this.unitPrice = scanner.nextDouble();
        System.out.println("Provide the supplier:                               ");
        this.supplier = scanner.nextLine();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(int idProducts) {
        this.idProducts = idProducts;
    }
}
