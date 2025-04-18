/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Noltan
 */
public class Database {
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/movieticketbookingsystem";
    private Statement statement;
    
    public Database(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Statement getStatement(){
        return statement;
    }
}
