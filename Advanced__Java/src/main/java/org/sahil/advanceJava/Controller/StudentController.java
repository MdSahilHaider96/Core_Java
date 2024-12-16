package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Student;
import org.sahil.advanceJava.Service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public static void main(String[] args) throws Exception {
        StudentService studentService = new StudentService();
//        try {
//            List<Student> studentList = studentService.findAll();
//            studentList.forEach(System.out::println);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        try {
            List<Student> studentList = studentService.findById();
            studentList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
