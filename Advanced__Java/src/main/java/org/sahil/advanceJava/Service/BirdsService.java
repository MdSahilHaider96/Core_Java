package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Birds;
import org.sahil.advanceJava.Repository.BirdsRepo;

import java.util.List;

public class BirdsService {
    public static void  create(String name ,String dob,String color , boolean canFly , int weight,double height , boolean canSwim)throws   Exception{
        BirdsRepo.Create( name ,dob,color ,  canFly , weight, height ,  canSwim);
    }
    public static void deleteById(int id)throws Exception{
        BirdsRepo.deleteByid(id);
    }
    public static void updateById(int id)throws Exception{
        BirdsRepo.updateById(id);
    }
    public List<Birds> findAll()throws  Exception{
        return BirdsRepo.findAll();
    }
    public List<Birds> findByName(String name)throws Exception{
        return BirdsRepo.findByName(name);
    }
}
