package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Qualifications;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QualificationsRepo {
    private static Connection connection = null;
    public static void create(int studentId, String degree, String stream , String year)throws Exception{
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        try {
            String query = "INSERT INTO qualifications (studentId,degree,stream,year) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,studentId);
            preparedStatement.setString(2,degree);
            preparedStatement.setString(3,stream);
            preparedStatement.setString(4,year);
            int executeUpdate = preparedStatement.executeUpdate();
            if (executeUpdate > 0 ){
                System.out.println("CREATED SUCCESSFULY");
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
    public static List<Qualifications> findByStudentId (int studentId) throws Exception{
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Qualifications> qualificationsList = new ArrayList<>();
        try{
            String query = "SELECT * FROM qualifications WHERE studentId=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,studentId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Qualifications qualifications = new Qualifications(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),
                resultSet.getString(4),resultSet.getString(5));
                qualificationsList.add(qualifications);
            }
        }
        catch (Exception e) {
           e.getMessage();
           throw new Exception("NOT FOUND");
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
        return qualificationsList;
    }
}
