package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conection;
import br.senai.sp.jandira.model.Products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsController {
    Conection conection = new Conection();
    Connection objConection = conection.getConection();

    public void registerProducts(Products newProducts) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryRegister = "INSERT INTO produtos (idProdutos, " +
                "nome, quantidade_estoque, preco_unitario, fornecedor) values (" +
                newProducts.getIdProducts() + ",'" + newProducts.getName() +
                "'," + newProducts.getQuantityStock() + "," + newProducts.getUnitPrice() +
                ",'" + newProducts.getSupplier() + "')";

        statement.executeUpdate(queryRegister);
        System.out.println("Product registered successfully");
    }
    public void listProducts() throws SQLException {
        Statement statement = objConection.createStatement();

        String queryConsult = "SELECT * FROM produtos";

        ResultSet resultSet = statement.executeQuery(queryConsult);

        Products products = new Products();

        while(resultSet.next()){
            products.setIdProducts(resultSet.getInt("idProdutos"));
            products.setName(resultSet.getString("nome"));
            products.setQuantityStock(resultSet.getInt("quantidade_estoque"));
            products.setUnitPrice(resultSet.getInt("preco_unitario"));
            products.setSupplier(resultSet.getString("fornecedor"));

            System.out.println(products.getIdProducts());
            System.out.println(products.getName());
            System.out.println(products.getQuantityStock());
            System.out.println(products.getUnitPrice());
            System.out.println(products.getSupplier());
        }
    }
    public void deleteProducts(String name) throws SQLException {
        System.out.println("Delete " + name);

        Statement statement = objConection.createStatement();

        String queryDelete = "DELETE FROM produtos WHERE nome = '" + name + "'";

        try{
            statement.executeUpdate(queryDelete);
            System.out.println("Product " + name + " was deleted with successfully");
        } catch (Exception error){
            System.out.println(error);
        }
    }
    public void consultProducts(String name) throws SQLException {
        Statement statement = objConection.createStatement();

        String querySearch = "SELECT * FROM products WHERE nome = '" + name + "'";

        ResultSet resultSet = statement.executeQuery(querySearch);

        Products products = new Products();

        while(resultSet.next()){
            products.setIdProducts(resultSet.getInt("idProdutos"));
            products.setName(resultSet.getString("nome"));
            products.setQuantityStock(resultSet.getInt("quantidade_estoque"));
            products.setUnitPrice(resultSet.getInt("preco_unitario"));
            products.setSupplier(resultSet.getString("fornecedor"));

            System.out.println(products.getIdProducts());
            System.out.println(products.getName());
            System.out.println(products.getQuantityStock());
            System.out.println(products.getUnitPrice());
            System.out.println(products.getSupplier());
            System.out.println("__________________________");
        }
    }

    public void editProducts(String name, String supplier) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryEdit = "UPDATE produtos SET fornecedor = '" + supplier + "' WHERE nome = '" + name + "'";

        statement.executeUpdate(queryEdit);
        System.out.println("Product successfully changed ");
    }
}
