package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.User;
import org.sahil.advanceJava.Repository.UserRepo;

import java.util.List;

public class UserService {
    public List<User> findAll() throws Exception{
        return UserRepo.findAll();
    }
    public List<User> findByAge() throws Exception{
        return UserRepo.findByAge(20);
    }
    public List<User> findByName() throws  Exception{
        return UserRepo.findbyName("Sahil");
    }
    public void Create(String name ,String email,int age)throws Exception{
        UserRepo.Create(name,email,age);
    }
    public void DeleteById(int id) throws Exception{
        UserRepo.DeleteById(id);
    }
    public void UpdateById(int id)throws Exception{
        UserRepo.UpdateById(id);
    }
}
