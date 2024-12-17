package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Countries;
import org.sahil.advanceJava.Service.CountriesService;

import java.util.List;

public class CountriesController {
    public static void main(String[] args) throws Exception {
        CountriesService countriesService=new CountriesService();
//        try {
//            countriesService.create(91,"INDIA","ASIA");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            countriesService.updateById(2);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            countriesService.deleteById(3);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
       try {
           List<Countries> countriesList= countriesService.findById(2);
           countriesList.forEach(System.out::println);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }
}
