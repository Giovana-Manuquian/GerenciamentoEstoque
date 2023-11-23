package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.controller.CustomerController;
import br.senai.sp.jandira.controller.ProductsController;
import br.senai.sp.jandira.model.Customer;
import br.senai.sp.jandira.model.Products;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    ProductsController products = new ProductsController();
    CustomerController customer = new CustomerController();

    SaleController sales = new SaleController();

    public void runMenu() throws SQLException {

        Scanner scanner = new Scanner(System.in);

        boolean proceed = true;

        while (proceed) {
            System.out.println("-------------------------------------------------");
            System.out.println("              Welcome to the Register            ");
            System.out.println("-------------------------------------------------");
            System.out.println("                       Menu                      ");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Employee                                      ");
            System.out.println("2 - Customer                                     ");
            System.out.println("3 - Exit                                         ");
            System.out.println("-------------------------------------------------");

            System.out.println("Choose a category: ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();

            switch (categoryChoice) {
                case 1:
                    runProductMenu();
                    break;
                case 2:
                    runCustomerMenu();
                    break;
                case 3:
                    proceed = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void runProductMenu() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        boolean proceed = true;

        while (proceed) {
            System.out.println("-------------------------------------------------");
            System.out.println("                Product Menu                     ");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Register Products                            ");
            System.out.println("2 - List Products                                ");
            System.out.println("3 - Delete Products                              ");
            System.out.println("4 - Consult Products                             ");
            System.out.println("5 - Edit Products                                ");
            System.out.println("6 - Make Sales                                   ");
            System.out.println("7 - Back to Main Menu                            ");
            System.out.println("-------------------------------------------------");

            System.out.println("Choose an option: ");
            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    Products newProducts = new Products();
                    newProducts.registerProducts();
                    products.registerProducts(newProducts);
                    break;
                case 2:
                    System.out.println("/- List Products -/");
                    products.listProducts();
                    break;
                case 3:
                    System.out.println("Please enter the name of the product: ");
                    String productDelete = scanner.nextLine();
                    products.deleteProducts(productDelete);
                    break;
                case 4:
                    System.out.println("Please enter the name that you need search: ");
                    String consultProduct = scanner.nextLine();
                    products.consultProducts(consultProduct);
                    break;
                case 5:
                    System.out.println("Please enter the name that you need edit: ");
                    String editProduct = scanner.nextLine();
                    System.out.println("Enter the new product name");
                    String newProduct = scanner.nextLine();
                    products.editProducts(editProduct, newProduct);
                    break;
                case 6:
                    System.out.println("What's the ID of Client: ");
                    int idClient = scanner.nextInt();
                    System.out.println("What's the ID of the product that you wanna change: ");
                    int idProduct = scanner.nextInt();
                    sales.makeSale(idClient, idProduct);
                    break;
                case 7:
                    proceed = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void runCustomerMenu() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        boolean proceed = true;

        while (proceed) {
            System.out.println("-------------------------------------------------");
            System.out.println("                Customer Menu                    ");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Register Customer                            ");
            System.out.println("2 - List Customer                                ");
            System.out.println("3 - Delete Customer                              ");
            System.out.println("4 - Consult Customer                             ");
            System.out.println("5 - Edit Customer                                ");
            System.out.println("6 - Back to Main Menu                            ");
            System.out.println("-------------------------------------------------");

            System.out.println("Choose an option: ");
            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    Customer newCustomer = new Customer();
                    newCustomer.registerCustomer();
                    customer.registerCustomer(newCustomer);
                    break;
                case 2:
                    System.out.println("/- List Customers -/");
                    customer.listCustomers();
                    break;
                case 3:
                    System.out.println("Please enter the cpf of the customer: ");
                    String customerDelete = scanner.nextLine();
                    customer.deleteCustomer(customerDelete);
                    break;
                case 4:
                    System.out.println("Please enter the name that you need search: ");
                    String customerConsult = scanner.nextLine();
                    customer.consultCustomer(customerConsult);
                    break;
                case 5:
                    System.out.println("Please enter the name that you need edit: ");
                    String customerEdit = scanner.nextLine();
                    System.out.println("Enter the new customer name");
                    String newName = scanner.nextLine();
                    customer.editCustomer(customerEdit, newName);
                    break;
                case 6:
                    proceed = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
