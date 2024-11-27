package org.sahil.advanceJava.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
    private static final String dbURL = "jdbc:mysql://localhost:3306/studentdb?";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection connection;

    public static Connection openConnection() throws Exception {
        try {
            connection = DriverManager.getConnection(dbURL, user, password);
            if (connection != null) {
                return connection;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Unable to Open Connection");
        }
        return null;
    }
public static boolean closeConnection() throws Exception {
    try {
     connection.close();
     return true;
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        throw new Exception("unable to Close Connection");
    }
}
}
