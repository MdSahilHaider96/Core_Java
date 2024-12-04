package org.sahil.advanceJava.service;

import java.util.List;

public class User {
    public List<org.sahil.advanceJava.repository.User> findAll() throws  Exception{
        return org.sahil.advanceJava.repository.User.findAll();
    }
    public static List<org.sahil.advanceJava.model.User> findbyname() throws Exception{
     return org.sahil.advanceJava.repository.User.findbyname();
    }
    public void create(int id, String name,String email,int age)throws  Exception{
        org.sahil.advanceJava.repository.User.create(id,name,email,age);
    }
}
