package org.sahil.advanceJava.Repository;

import org.sahil.advanceJava.Model.Employees;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesRepo {
    private static Connection connection = null;
    public static List<Employees> findAll() throws Exception{
        connection = ConnectionUtil.openConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<Employees> employeesList = new ArrayList<>();
        try {
            String query = "Select * from Employees ";
            preparedStatement = connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String userName = rs.getString(4);
                String password = rs.getString(5);
                String address = rs.getString(6);
                String contactNo = rs.getString(7);
                Employees employees = new Employees(firstName, lastName, userName, password, address, contactNo);
                employeesList.add(employees);
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
            try {
                if(rs != null){
                    rs.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return employeesList;
    }

}
