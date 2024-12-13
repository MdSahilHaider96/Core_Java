package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Birds;
import org.sahil.advanceJava.Repository.BirdsRepo;
import org.sahil.advanceJava.Service.BirdsService;

import java.util.List;

public class BirdsController {
    public static void main(String[] args) {
        BirdsService birdsService = new BirdsService();
//        try {
//            BirdsService.create("BADRIKA22","23/12/2024","light BLUE",true,50,5.5,false);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            BirdsService.deleteById(2);
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            BirdsService.updateById(2);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            List<Birds> birdsList= birdsService.findAll();
//           birdsList.forEach(System.out::println);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        try {
            List<Birds>birdsList = birdsService.findByName("BADRIKA22");
            birdsList.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
