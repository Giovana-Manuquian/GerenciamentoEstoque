package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conection;
import br.senai.sp.jandira.model.Customer;
import br.senai.sp.jandira.model.Products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaleController {
    Conection conection = new Conection();
    Connection objConection = conection.getConection();

    public boolean makeSale(int idCustomer, int idProduct) throws SQLException {
        Statement statement = objConection.createStatement();

        String querySearchProduct = "SELECT * FROM produtos WHERE idProdutos";
        ResultSet resultSetProducts = statement.executeQuery(querySearchProduct);

        Products products = new Products();

        while(resultSetProducts.next()){
            products.setName(resultSetProducts.getString("nome"));
            products.setUnitPrice(resultSetProducts.getInt("preco_unitario"));
        }
        resultSetProducts.close();

        String querySearchCustomer = "SELECT nome FROM clientes WHERE idClientes = "+ idCustomer;
        ResultSet resultSetCustumer = statement.executeQuery(querySearchCustomer);

        Customer customer = new Customer();

        while (resultSetCustumer.next()){
            customer.setName(resultSetCustumer.getString("nome"));
        }

        String querySale = "INSERT INTO vendas (idProduto_FK, idCliente_FK, nomeProduto, nomeCliente, precoProduto) values ("
                + idProduct + ", " + idCustomer + ", '" + products.getName() + "','" + customer.getName() + "', " + products.getUnitPrice() + ")";

        try {
            statement.executeUpdate(querySale);
            System.out.println("/- Registered Product-/");
            return true;
        } catch (Exception error){
            System.out.println(error);
            return false;
        }
    }
}
