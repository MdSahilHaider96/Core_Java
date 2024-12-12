package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Aeroplane;
import org.sahil.advanceJava.Repository.AeroplaneRepo;

import java.util.List;

public class AeroplaneService {
    public  void Create( String name , int capacity , String comapany_name,String model_name)throws Exception{
        AeroplaneRepo.Create(name,capacity,comapany_name,model_name);
    }
    public void update(int id)throws Exception{
        AeroplaneRepo.updateById(id);
    }
    public void delete(int id) throws  Exception{
        AeroplaneRepo.deleteById(id);
    }
    public List<Aeroplane> findAll()throws Exception{
        return AeroplaneRepo.findAll();
    }
    public List<Aeroplane> findByName() throws Exception{
        return AeroplaneRepo.findByName("AIR INDIA");
    }
}
