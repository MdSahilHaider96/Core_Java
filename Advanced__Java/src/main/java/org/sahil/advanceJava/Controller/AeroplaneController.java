package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Aeroplane;
import org.sahil.advanceJava.Service.AeroplaneService;

import java.util.ArrayList;
import java.util.List;

public class AeroplaneController {
    public static void main(String[] args) throws Exception{
        AeroplaneService aeroplaneService = new AeroplaneService();
//        try {
//            aeroplaneService.Create("INDIGO",200,"INDIGO AIRLINES","INDIGO11");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            aeroplaneService.update(1);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            aeroplaneService.delete(3);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        try {
            List<Aeroplane> aeroplaneList = aeroplaneService.findByName();
            aeroplaneList.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
