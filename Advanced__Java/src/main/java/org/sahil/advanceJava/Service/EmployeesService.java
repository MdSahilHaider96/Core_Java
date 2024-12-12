package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Employees;
import org.sahil.advanceJava.Repository.EmployeesRepo;

import java.util.List;

public class EmployeesService {
    public static List<Employees> findAll() throws Exception{
        return EmployeesRepo.findAll();
    }
}
