package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Service.AddressService;

public class AddressController {
    public static void main(String[] args) throws Exception {
        AddressService addressService= new AddressService();
        try {
            addressService.create("129,Collin Street","207A,PG road","");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
