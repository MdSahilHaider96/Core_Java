package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Birds;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BirdsRepo {
    ////bird ( id, name, dob, color, canFly, weight, height, canSwim )
   private static  Connection connection= null;
    public static void Create(String name ,String dob,String color , boolean canFly , int weight,double height , boolean canSwim)throws Exception{
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query = "INSERT INTO birds(name , dob , color , canFly , weight ,height , canSwim) VALUES (?,?,?,?,?,?,?)";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,dob);
            preparedStatement.setString(3,color);
            preparedStatement.setBoolean(4,canFly);
            preparedStatement.setInt(5,weight);
            preparedStatement.setDouble(6,height);
            preparedStatement.setBoolean(7,canSwim);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("Successfully Create");
            }
            else {
                System.out.println("FAILED TO CREATE");
            }
        }
        catch (Exception e){
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
    public static void deleteByid(int id)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement= null;
        try {
            String query="DELETE FROM birds WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("SUCCESSFULLY  DELETE");
            }
            else {
                System.out.println("FAILED TO DELETE");
            }
        }
        catch (Exception e){
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
    public static void updateById(int id)throws  Exception{
        connection =ConnectionUtil.openConnection();
        PreparedStatement preparedStatement= null;
        // ////bird ( id, name, dob, color, canFly, weight, height, canSwim )
        try {
            //String query="UPDATE user SET name='SahilHAider',email='HAiderSA@gmail.com',age='18' WHERE id=? ";
            String query = "UPDATE birds SET name='KINGFISHER',dob='13/11/2024',color='Black',canFly='true',weight='10',height='2.3',canSwim='true' WHERE id=? ";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate=preparedStatement.executeUpdate();
            if (executeUpdate > 0) {
                System.out.println("SUCCESSFULLY UPDATE");
            }
            else {
                System.out.println("FAILED TO UPDATE");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (preparedStatement != null){
                    preparedStatement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        ConnectionUtil.closeConnection();
    }
    public static  List<Birds> findAll()throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        List<Birds> birdsList = new ArrayList<>();
        //( id, name, dob, color, canFly, weight, height, canSwim )
        try {
            String query ="SELECT * FROM birds";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String dob =  resultSet.getString(3);
                String color=resultSet.getString(4);
                Boolean canFly=resultSet.getBoolean(5);
                int weight = resultSet.getInt(6);
                double height=resultSet.getDouble(7);
                Boolean canSwim=resultSet.getBoolean(8);
                Birds birds= new Birds(id,name,dob,color,canFly,weight,height,canSwim);
                birdsList.add(birds);
            }
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
        return birdsList;
    }
    public static  List<Birds> findByName(String name)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Birds>  birdsList = new ArrayList<>();
        try {
            String query = "SELECT *  FROM birds WHERE name=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                //( id, name, dob, color, canFly, weight, height, canSwim )
                Birds birds= new Birds(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)
                ,resultSet.getBoolean(5),resultSet.getInt(6),resultSet.getDouble(7),resultSet.getBoolean(8));
                birdsList.add(birds);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(preparedStatement != null){
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
            }
            catch (Exception e){
                e.printStackTrace();
            }
            ConnectionUtil.closeConnection();
        }
        return birdsList;
    }
}
