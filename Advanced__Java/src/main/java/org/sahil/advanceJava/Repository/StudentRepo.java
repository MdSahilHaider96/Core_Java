package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Address;
import org.sahil.advanceJava.Model.Qualifications;
import org.sahil.advanceJava.Model.Student;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//To ek code likho
//2 tables se data lao
//Ek user table
//Ek address table
//User table ka I'd address table ka liye foreign key hoga
//Aur ek User ka ek ya oos se zyada bhi address ho sakta hai
//To User fetch kya I'd se to oos User ka details plus oos ka address list terminal mai display karo

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
            if (resultSet.isBeforeFirst()) {
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                int age = resultSet.getInt(3);
                List<Address> addressList = AddressRepo.findByStudentId(id);
                List<Qualifications> qualificationsList= QualificationsRepo.findByStudentId(id);
                Student student = new Student(id,name,age, addressList,qualificationsList);
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
            String query = "SELECT * FROM student WHERE id=? ";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                List<Address> addressList = AddressRepo.findByStudentId(id);
                List<Qualifications> qualificationsList = QualificationsRepo.findByStudentId(id);
                Student student = new Student(id,name,age, addressList,qualificationsList);
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
