package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Repository.AddressRepo;

public class AddressService {
    public  void create(String address , String address2 , String address3)throws Exception{
        AddressRepo.create(address,address2,address3);
    }
}
