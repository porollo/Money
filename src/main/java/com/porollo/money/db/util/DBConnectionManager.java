package com.porollo.money.db.util;

/**
 * Created by Dmitriy S. Porollo on 01.04.2015.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    private final static String JDBC_CLASS = "com.microsoft.jdbc.sqlserver.SQLServerDriver";

    private static String dbURL;
    private static String user;
    private static String pwd;

    private Connection connection;

    public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_CLASS);
        this.connection = DriverManager.getConnection(dbURL, user, pwd);
    }

    public Connection getConnection(){
        return this.connection;
    }
}