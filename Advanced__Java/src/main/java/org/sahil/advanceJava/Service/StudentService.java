package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Student;
import org.sahil.advanceJava.Repository.StudentRepo;

import java.util.List;

public class StudentService {
    public  List<Student> findAll() throws Exception{
      return   StudentRepo.findAll();
    }
    public List<Student> findById(int id) throws Exception{
        return StudentRepo.findById(id);
    }
}
