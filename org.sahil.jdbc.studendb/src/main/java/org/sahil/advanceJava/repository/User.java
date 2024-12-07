package org.sahil.advanceJava.repository;

import org.sahil.advanceJava.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private static Connection connection = null;

    public User(int id, String name, String email, int age) {
    }

    // question
    public static List<User> findAll() throws  Exception{
       connection = ConnectionUtil.openConnection();
        PreparedStatement pStatement=null;
        //question
        ResultSet rs = null;
        //question
        List<User> userList = new ArrayList<>();
        try{
            String query = "Select * from user";
            pStatement = connection.prepareStatement(query); // creates the Query
            rs = pStatement.executeQuery();  // Execute the Query
            while (rs.next()){
                int id = rs.getInt(1);
                String name =rs.getString(2);
                String email=rs.getString(3);
                int age=rs.getInt(4);
                User  user = new User(id,name,email,age);
                userList.add(user);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
                try{
                    if (pStatement != null){
                        pStatement.close();
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
        }
        try{
            if(rs != null){
                rs.close();
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
        return userList;
    }

    public static List<org.sahil.advanceJava.model.User> findbyname() throws Exception{
        connection = ConnectionUtil.openConnection();
        PreparedStatement pStatement = null;
        ResultSet rs= null;
        List<org.sahil.advanceJava.model.User> userList = new ArrayList<>();
        try{
            String query = "Select * from user where name =??";
            pStatement = connection.prepareStatement(query);
          //   pStatement.setString(2);
            rs= pStatement.executeQuery();
            while (rs.next()){
                org.sahil.advanceJava.model.User user = new org.sahil.advanceJava.model.User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                userList.add(user);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            try{
                if (pStatement != null){
                    pStatement.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            try{
                if (rs != null){
                    rs.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            ConnectionUtil.closeConnection();
        }
        return userList;
    }

    public static void create(int id, String name, String email, int age) {
    }
}
