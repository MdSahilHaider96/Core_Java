package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Countries;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountriesRepo {
    //	18.	countries ( code, name, continent_name )
    private static Connection connection;
    public static void create(int code , String name,String continent_name) throws Exception{
      connection= ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try{
            String query = "INSERT INTO countries (code , name , continent_name) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,code);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,continent_name);
            int executeUpdate=preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("CREATED SUCCESSFULLY");
            }
            else {
                System.out.println("FAILED TO CREATE");
            }
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
        }
        ConnectionUtil.closeConnection();
    }
    //	18.	countries ( code, name, continent_name )
    public static void updateById(int id)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query = "UPDATE countries SET code='945',name='QATAR',continent_name='UAE' WHERE id=? ";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate=preparedStatement.executeUpdate();
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
                if (preparedStatement != null){
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        ConnectionUtil.closeConnection();
    }
    public static void deleteById(int id) throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query="DELETE FROM countries WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate=preparedStatement.executeUpdate();
            if (executeUpdate > 0) {
                System.out.println("DELETED SUCCESSFULLY");
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
        }
        ConnectionUtil.closeConnection();
    }
    public static List<Countries> findAll()throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Countries> countriesList= new ArrayList<>();
        try {
            String query="SELECT * FROM countries";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int code = resultSet.getInt(2);
                String name=resultSet.getString(3);
                String continent_name=resultSet.getString(4);
                Countries countries= new Countries(code,name,continent_name);
                countriesList.add(countries);
            }
            return countriesList;
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
            try{
                if (resultSet != null){
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
    }
    public static List<Countries> findById(int id)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement= null;
        ResultSet resultSet=null;
        List<Countries> countriesList= new ArrayList<>();
        try {
            String query = "SELECT * FROM  countries WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Countries countries= new Countries(resultSet.getInt(1),resultSet.getString(3),resultSet.getString(4));
                countriesList.add(countries);
            }
            return countriesList;
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
