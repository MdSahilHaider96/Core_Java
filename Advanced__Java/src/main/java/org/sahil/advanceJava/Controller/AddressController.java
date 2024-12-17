package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Address;
import org.sahil.advanceJava.Service.AddressService;

import java.util.List;

public class AddressController {
    public static void main(String[] args) throws Exception {
        AddressService addressService= new AddressService();
//        try {
//            addressService.create(1,"129,Collin Street","","207A,PG road");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            addressService.delete(4);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            addressService.update(3);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
            List<Address> addressList = addressService.findByStudentId(1);
            addressList.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        try {
//            List<Address> addressList = addressService.findAll();
//            addressList.forEach(System.out::println);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
