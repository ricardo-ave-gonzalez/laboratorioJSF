package com.eduit.laboratorio.java.web.connectors;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorJDBC {
    private String driver="com.mysql.cj.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/laboratorioJSF?serverTimezone=UTC";
    private String user="root";
    private String pass="";
    
    public Connection getConnection(){
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println(e);
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            return null;
        }
    }
    
}