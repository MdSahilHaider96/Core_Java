package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Address;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AddressRepo {
    private static Connection connection = null;
    public static void  create(String address,String address2,String address3) throws Exception{
        connection= ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query = "INSERT INTO address (address , address2,address3) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,address);
            preparedStatement.setString(2,address2);
            preparedStatement.setString(3,address3);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0) {
                System.out.println("CREATED Successfully");
            } else {
                System.out.println("FAILED TO CONNECT");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement != null){
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
    }
}
