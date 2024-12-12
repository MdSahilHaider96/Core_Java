package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.User;
import org.sahil.advanceJava.Repository.UserRepo;
import org.sahil.advanceJava.Service.UserService;

import java.util.List;

public class UserController {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService(); // Object
//        try {
//            List<User> userList = userService.findAll();
//            userList.forEach(System.out::println);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            List<User> userList=userService.findByAge();
//            userList.forEach(System.out::println);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try{
//            List<User> userList = userService.findByName();
//            userList.forEach(System.out::println);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        try{
            userService.Create("Haider","Haider@gmail.com",25);
        }
        catch (Exception e){
            e.printStackTrace();
         }
//        try {
//            userService.DeleteById(1);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            userService.UpdateById(7);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }
}

