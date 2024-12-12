package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.User;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static Connection connection = null;
    public static List<User> findAll() throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement pstatement = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<>();
        try {
            String query = " select * from user ";
            pstatement = connection.prepareStatement(query);
            rs = pstatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                int age = rs.getInt(4);
                User user = new User(id, name, email, age);
                userList.add(user);
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
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ConnectionUtil.closeConnection();
        }
        return userList;
    }

    public static List<User> findByAge(int age) throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<>();
        try {
            String query = "Select * FROM user WHERE age=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, age);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                userList.add(user);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Not Found");
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
        return userList;
    }

    public static List<User> findbyName(String name) throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<>();
        try {
            String query = "Select * FROM user WHERE name=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                userList.add(user);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Not Found");
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (rs !=null){
                    rs.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return userList;
    }
    public static void Create(String name,String email,int age) throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query = "Insert INTO user(email , name , age) VALUES (?,?,?)";
            preparedStatement =connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setInt(3,age);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("Successfully Create");
            }
            else {
                System.out.println("Failed To Create");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(preparedStatement != null){
                    preparedStatement.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            ConnectionUtil.closeConnection();
        }
    }
    public static void DeleteById(int id)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try{
            String query ="DELETE FROM user WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int Delete=preparedStatement.executeUpdate();
            if (Delete > 0){
                System.out.println("DELETE SUCCESSFULLY");
            }
            else {
                System.out.println("Failed to DELETE");
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        }
        ConnectionUtil.closeConnection();
    }
    public static void UpdateById(int id) throws Exception {
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query="UPDATE user SET name='SahilHAider',email='HAiderSA@gmail.com',age='18' WHERE id=? ";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
//            preparedStatement.setString(2,name);
//            preparedStatement.setString(3,email);
//            preparedStatement.setInt(4,age);
            int executeUpdate= preparedStatement.executeUpdate();
            if(executeUpdate > 0){
                System.out.println("UPDATE SUCCESSFULLY");
            }
            else {
                System.out.println("FAILED TO UPDATE"+executeUpdate);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (preparedStatement !=null){
                    preparedStatement.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        ConnectionUtil.closeConnection();
    }
}
