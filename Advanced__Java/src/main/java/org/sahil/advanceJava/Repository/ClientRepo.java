package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Client;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientRepo {
    //    //	14.	client ( name, address, city, state, zip, country, email )
    private static Connection connection;
    public static void create(String name ,String address, String city , String state , int zip , String country,String email)throws Exception{
        connection= ConnectionUtil.openConnection();
        PreparedStatement preparedStatement =  null;
        try {
            String query = "INSERT INTO client(name,address,city,state,zip,country,email) VALUES  (?,?,?,?,?,?,?)";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setString(3,city);
            preparedStatement.setString(4,state);
            preparedStatement.setInt(5,zip);
            preparedStatement.setString(6,country);
            preparedStatement.setString(7,email);
            int executeUpdate= preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("CREATED SUCCESSFULLY");
            }
            else {
                System.out.println("FAILED TO CREATE");
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
        }
        ConnectionUtil.closeConnection();
    }
    public static void updateById(int clientId)throws Exception{
        //String name ,String address, String city , String state , int zip , String country,String email
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String query = "UPDATE client SET name = 'HAider', address ='207A,PG ROAD',city='KOLKATA',state='WB',zip='700014',country='INDIA',email='haider@gmail.com' WHERE clientId=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,clientId);
            int executeUpdate=preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("SUCCESSFULLY UPDATED");
            }
            else {
                System.out.println("FAILED TO UPDATE");
            }
        } catch (RuntimeException e) {
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
    public static  void deleteById(int clientId) throws Exception{
        connection =  ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM client WHERE clientId=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,clientId);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("DELETED SUCCESSFULLY");
            }
            else {
                System.out.println("FAILED TO DELETE");
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
        }
        ConnectionUtil.closeConnection();
    }
    public static List<Client> findALl()throws Exception{
        //        //String name ,String address, String city , String state , int zip , String country,String email
        connection =ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Client> clientList = new ArrayList<>();
        try {
            String query = "SELECT * FROM client";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);
                String city = resultSet.getString(4);
                String state = resultSet.getString(5);
                int zip = resultSet.getInt(6);
                String country = resultSet.getString(7);
                String email = resultSet.getString(8);
                Client client = new Client(name,address,city,state,zip,country,email);
                clientList.add(client);
            }
            return clientList;
        }
        catch (Exception e) {
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
            try {
                if (resultSet != null){
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
    }
    public static List<Client> findById(int clientId) throws Exception{
        //        //        //String name ,String address, String city , String state , int zip , String country,String email
        connection =ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Client> clientList = new ArrayList<>();
        try {
            String query="SELECT * FROM client WHERE clientId=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,clientId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Client client= new Client(resultSet.getString(2),resultSet.getString(3)
                        ,resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6),
                        resultSet.getString(7),resultSet.getString(8));
                clientList.add(client);
            }
            return clientList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement != null){
                    preparedStatement.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
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
    }
}