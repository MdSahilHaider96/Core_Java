package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Countries;
import org.sahil.advanceJava.Repository.CountriesRepo;

import java.util.List;

public class CountriesService {
    public void create(int code ,String  name,String continent_name)throws Exception{
        CountriesRepo.create(code,name,continent_name);
    }
    public void updateById(int id)throws Exception{
        CountriesRepo.updateById(id);
    }
    public void deleteById(int id)throws Exception{
        CountriesRepo.deleteById(id);
    }
    public List<Countries> findAll()throws Exception{
        return CountriesRepo.findAll();
    }
    public List<Countries> findById(int id) throws Exception{
        return CountriesRepo.findById(id);
    }
}
