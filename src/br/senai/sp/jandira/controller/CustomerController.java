package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conection;
import br.senai.sp.jandira.model.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerController {
    Conection conection = new Conection();
    Connection objConection = conection.getConection();

    public void registerCustomer(Customer newCustomer) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryRegister = "INSERT INTO clientes (cpf, nome, telefone) values (" +
                newCustomer.getCpf() + ",'" + newCustomer.getName() +
                "','" + newCustomer.getPhoneNumber() + "')";

        statement.executeUpdate(queryRegister);
        System.out.println("Customer registered successfully");
    }

    public void listCustomers() throws SQLException {
        Statement statement = objConection.createStatement();

        String queryConsult = "SELECT * FROM clientes";

        ResultSet resultSet = statement.executeQuery(queryConsult);

        Customer customer = new Customer();

        while(resultSet.next()){
            customer.setIdCustomer(resultSet.getInt("idClientes"));
            customer.setCpf(resultSet.getString("cpf"));
            customer.setName(resultSet.getString("nome"));
            customer.setPhoneNumber(resultSet.getString("telefone"));

            System.out.println(customer.getIdCustomer());
            System.out.println(customer.getCpf());
            System.out.println(customer.getName());
            System.out.println(customer.getPhoneNumber());
            System.out.println("__________________________");
        }
    }

    public void deleteCustomer(String cpf) throws SQLException {
        System.out.println("Delete customer with CPF: '" + cpf + "'");

        Statement statement = objConection.createStatement();

        String queryDelete = "DELETE FROM clientes WHERE cpf = '" + cpf + "'";

        try{
            statement.executeUpdate(queryDelete);
            System.out.println("Customer with CPF " + cpf + " was deleted successfully");
        } catch (Exception error){
            System.out.println(error);
        }
    }

    public void consultCustomer(String cpf) throws SQLException {
        Statement statement = objConection.createStatement();

        String querySearch = "SELECT * FROM clientes WHERE cpf = " + cpf;

        ResultSet resultSet = statement.executeQuery(querySearch);

        Customer customer = new Customer();

        while(resultSet.next()){
            customer.setIdCustomer(resultSet.getInt("idClientes"));
            customer.setCpf(resultSet.getString("cpf"));
            customer.setName(resultSet.getString("nome"));
            customer.setPhoneNumber(resultSet.getString("telefone"));

            System.out.println(customer.getIdCustomer());
            System.out.println(customer.getCpf());
            System.out.println(customer.getName());
            System.out.println(customer.getPhoneNumber());
            System.out.println("__________________________");
        }
    }

    public void editCustomer(String cpf, String phoneNumber) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryEdit = "UPDATE clientes SET telefone = '" + phoneNumber + "' WHERE cpf = '" + cpf + "'";

        statement.executeUpdate(queryEdit);
        System.out.println("Customer information successfully changed ");
    }
}

