package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Employees;
import org.sahil.advanceJava.Service.EmployeesService;

import java.util.ArrayList;
import java.util.List;

public class EmployeesController {
    public static void main(String[] args) throws Exception{
        EmployeesService employeesService= new EmployeesService();
        try {
            List<Employees> employeesList = employeesService.findAll();
            employeesList.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
