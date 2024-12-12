package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Aeroplane;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AeroplaneRepo {
   private static  Connection connection =null;
    public static void Create(String name,int capacity,String company_name,String model_name) throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query = "Insert INTO aeroplane(name , capacity , company_name,model_name) VALUES (?,?,?,?)";
            preparedStatement =connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,capacity);
            preparedStatement.setString(3,company_name);
            preparedStatement.setString(4,model_name);
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
    public static void updateById(int id)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String query="UPDATE aeroplane SET name='AIR INDIA',capacity='300',company_name='AIR INDIA',model_name='AIR145' WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("UPDATE Success");
            }
            else {
                System.out.println("FAILED TO UPDATE");
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
    public static void deleteById(int id)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        try {
            String query="DELETE FROM aeroplane WHERE id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int executeUpdate=preparedStatement.executeUpdate();
            if (executeUpdate > 0){
                System.out.println("DELETE SUCCESS");
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
                if (preparedStatement !=  null){
                    preparedStatement.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        ConnectionUtil.closeConnection();
    }
    public static List<Aeroplane> findAll()throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Aeroplane> aeroplaneList= new ArrayList<>();
        try {
            String query = "SELECT * FROM aeroplane ";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int capacity = resultSet.getInt(3);
                String company_name = resultSet.getString(4);
                String model_name = resultSet.getString(5);
                Aeroplane aeroplane = new Aeroplane(id,name,capacity,company_name,model_name);
                aeroplaneList.add(aeroplane);
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
        return aeroplaneList;
    }
    public static List<Aeroplane> findById(int id)throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Aeroplane> aeroplaneList = new ArrayList<>();
        try {
            String query = "SELECT * FROM aeroplane WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Aeroplane aeroplane = new Aeroplane(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getString(4)
                        , resultSet.getString(5));
                aeroplaneList.add(aeroplane);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }try{
        if (resultSet != null) {
            resultSet.close();
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
        return aeroplaneList;
    }
    public static List<Aeroplane> findByName(String name)throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Aeroplane> aeroplaneList = new ArrayList<>();
        try {
            String query = "SELECT * FROM aeroplane WHERE name=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Aeroplane aeroplane = new Aeroplane(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getString(4)
                        , resultSet.getString(5));
                aeroplaneList.add(aeroplane);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }try{
            if (resultSet != null) {
                resultSet.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
        return aeroplaneList;
    }
}
