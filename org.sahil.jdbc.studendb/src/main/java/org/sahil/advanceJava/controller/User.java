package org.sahil.advanceJava.controller;

import java.util.List;

public class User {
    public static void main(String[] args) {
        org.sahil.advanceJava.service.User userService = new org.sahil.advanceJava.service.User();
        try{
            List<org.sahil.advanceJava.repository.User> userList = userService.findAll();
            userList.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        org.sahil.advanceJava.service.User user = new org.sahil.advanceJava.service.User();
        try{
            List<org.sahil.advanceJava.model.User> userList = org.sahil.advanceJava.service.User.findbyname();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
