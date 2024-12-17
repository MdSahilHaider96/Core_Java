package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Address;
import org.sahil.advanceJava.Model.Student;
import org.sahil.advanceJava.Model.User;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressRepo {
    private static Connection connection = null;
    public static void  create(int studentid,String address,String address2,String address3) throws Exception{
        connection= ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query = "INSERT INTO address (studentid,address , address2, address3) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,studentid);
            preparedStatement.setString(2,address);
            preparedStatement.setString(3,address2);
            preparedStatement.setString(4,address3);
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
    public static void delete(int id)throws  Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String query="DELETE FROM address WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("DELETE SUCCESSFULLY");
            }
            else {
                System.out.println("FAIELD TO DELETE");
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
    public static void update(int id) throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String  query = "UPDATE address SET address='207A,PG',address2='ripon street',address3='collin street' WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate= preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("UPDATED SUCCESSFULLY");
            }
            else {
                System.out.println("FAIELD TO UPDATE");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement != null)
                        preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
    }
    public static List<Address> findByStudentId(int studentId) throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        List<Address> addressList =  new ArrayList<>();
        try {
            String query = "SELECT * FROM address WHERE studentid=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,studentId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
               Address address = new Address(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3)
                       ,resultSet.getString(4),resultSet.getString(5));
               addressList.add(address);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                if (preparedStatement != null){
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (resultSet != null){
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
        return addressList;
    }
    public static List<Address> findAll() throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        List<Address> addressList = new ArrayList<>();
        try {
            String query = " select * from address ";
            pstatement = connection.prepareStatement(query);
            resultSet = pstatement.executeQuery();

            while (resultSet.next()) {
                int id= resultSet.getInt(1);
             int studentid=resultSet.getInt(2);
             String address=resultSet.getString(3);
             String address2=resultSet.getString(4);
             String address3=resultSet.getString(5);
             Address cons = new Address(id,studentid,address , address2,address3);
             addressList.add(cons);
            }

        } catch (Exception e) {
            System.out.println("e");
        } finally {
            try {
                if (pstatement != null) {
                    pstatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ConnectionUtil.closeConnection();
        }
        return addressList;
    }
}
