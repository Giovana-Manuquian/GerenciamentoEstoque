package br.senai.sp.jandira.model;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class Conection {
    private String server, database, user, password;

    public Connection conection;

    public Conection(){
        this.server = "localhost";
        this.database = "db_gerenciamento_estoque";
        this.user = "root";
        this.password = "bcd127";
    }

    public void connectDriver(){
        try{
            this.conection = DriverManager.getConnection("jdbc:mysql://" + this.server + "/" + this.database, this.user, this.password);
        } catch (SQLException error){
            System.out.println(error);
        }
    }
    public Connection getConection(){
        connectDriver();
        return conection;
    }
}
