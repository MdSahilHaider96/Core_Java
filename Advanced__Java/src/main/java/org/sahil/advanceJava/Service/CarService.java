package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Car;
import org.sahil.advanceJava.Repository.CarRepo;

import java.util.List;

public class CarService {
    //( carId, model, company, engine, color, type )
    public void create(String model , String company , String engine , String color, String type) throws Exception{
        CarRepo.create(model,company,engine,color,type);
    }
    public void updateById(int carId)throws Exception{
        CarRepo.updateById(carId);
    }
    public void deleteById(int carId)throws Exception{
        CarRepo.deleteById(carId);
    }
    public List<Car> findAll() throws Exception{
        return CarRepo.findAll();
    }
    public List<Car> findById(int carid) throws Exception{
        return CarRepo.findByCarId(carid);
    }
}
