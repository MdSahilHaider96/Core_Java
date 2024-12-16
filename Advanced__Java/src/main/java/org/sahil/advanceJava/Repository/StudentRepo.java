package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Student;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private static Connection connection = null;
    public static List<Student> findAll() throws  Exception{
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Student> studentList = new ArrayList<>();
        try {
            String query = "SELECT * FROM student inner join address On student.id = address.id ";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                int age = resultSet.getInt(3);
                String address = resultSet.getString(4);
                String address2 = resultSet.getString(5);
                String address3 = resultSet.getString(6);
                Student student = new Student(id,name,age,address,address2,address3);
                studentList.add(student);
            }
        } catch (Exception e) {
            System.out.println("e");
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
                if (resultSet != null){
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ConnectionUtil.closeConnection();
        }
        return studentList;
    }
    public static List<Student> findById(int id) throws Exception{
        connection=ConnectionUtil.openConnection();
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        List<Student> studentList =  new ArrayList<>();
        try {
            String query = "SELECT * FROM student INNER JOIN address ON student.id=address.id WHERE student.id=? ";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Student  student = new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getString(5)
                        ,resultSet.getString(6),resultSet.getString(7));
                studentList.add(student);
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
        return studentList;
    }
}
