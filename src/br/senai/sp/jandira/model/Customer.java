package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private int idCustomer;
    private String cpf;
    private String name;
    private String phoneNumber;

    public void registerCustomer() {
        System.out.println("----------------------------------------------------");
        System.out.println("             Register of Customer Information        ");
        System.out.println("----------------------------------------------------");
        System.out.println("CPF:                                                ");
        this.cpf = scanner.nextLine();
        System.out.println("Customer Name:                                      ");
        this.name = scanner.nextLine();
        System.out.println("Phone Number:                                       ");
        this.phoneNumber = scanner.nextLine();
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

