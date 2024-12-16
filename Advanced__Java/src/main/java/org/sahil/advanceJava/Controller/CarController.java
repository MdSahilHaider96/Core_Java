package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Car;
import org.sahil.advanceJava.Repository.CarRepo;
import org.sahil.advanceJava.Service.CarService;

import java.util.List;

public class CarController {
    public static void main(String[] args) throws  Exception {
        CarService carService = new CarService();
//        try {
//            carService.create("CELTOS","KIA","VXI","WHITE","PETROL");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
////        try {
//            carService.updateById(2);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            carService.deleteById(3);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//             List<Car> carList = carService.findAll();
//            carList.forEach(System.out::println);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
            List<Car> carList = carService.findById(2);
            carList.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
