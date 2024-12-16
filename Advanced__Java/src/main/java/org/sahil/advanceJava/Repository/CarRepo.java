package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Car;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepo {
    //car ( carId, model, company, engine, color, type )
    private  static  Connection  connection = null;
    public static void create(String model, String company,String engine,String color, String type)throws Exception{
        connection= ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String query = "INSERT INTO car (model,company,engine,color,type) VALUES (?,?,?,?,?)";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,model);
            preparedStatement.setString(2,company);
            preparedStatement.setString(3,engine);
            preparedStatement.setString(4,color);
            preparedStatement.setString(5,type);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0 ){
                System.out.println("CREATED SUCCESSFULLY");
            }
            else {
                System.out.println("FAIELD TO CREATE");
            }
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
        }
        ConnectionUtil.closeConnection();
    }
    public static void updateById(int carId) throws Exception{
        //( carId, model, company, engine, color, type )
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String  query="UPDATE car SET model='THAR',company='MAHINDRA',engine='VXI',color='BLACK',type='PETROL' WHERE carId=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,carId);
//            preparedStatement.setString(2,model);
//            preparedStatement.setString(3,company);
//            preparedStatement.setString(4,engine);
//            preparedStatement.setString(5,color);
//            preparedStatement.setString(6,type);
            int executeUpdate= preparedStatement.executeUpdate();
            if (executeUpdate > 0 ){
                System.out.println("UPDATED SUCCESSFULLY");
            }
            else {
                System.out.println("FAILED TO UPDATE");
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
    public static void deleteById(int carId)throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement= null;
        try {
            String query="DELETE FROM car WHERE carId=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,carId);
            int executeUpdate= preparedStatement.executeUpdate();
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
    public static List<Car> findAll() throws Exception{
        //( carId, model, company, engine, color, type )
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Car> carList = new ArrayList<>();
        try {
            String query = "SELECT * from car";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int carId = resultSet.getInt(1);
                String model=resultSet.getString(2);
                String company=resultSet.getString(3);
                String engine=resultSet.getString(4);
                String color=resultSet.getString(5);
                String type=resultSet.getString(6);
                Car car = new Car(carId,model,company,engine,color,type);
                carList.add(car);
            }
            return carList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
    }
    public static List<Car> findByCarId(int carId)throws Exception{
        //( carId, model, company, engine, color, type )
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Car> carList =  new ArrayList<>();
        try {
            String query ="SELECT * FROM car WHERE carId=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,carId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Car car = new Car(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)
                        ,resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
                carList.add(car);
            }
            return carList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement !=  null){
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
