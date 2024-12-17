package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Address;
import org.sahil.advanceJava.Repository.AddressRepo;

import java.util.List;

public class AddressService {
    public  void create(int studentid,String address , String address2 , String address3)throws Exception{
        AddressRepo.create(studentid,address,address2,address3);
    }
    public void delete(int id)throws Exception{
        AddressRepo.delete(id);
    }
    public void update(int id) throws Exception{
        AddressRepo.update(id);
    }
    public List<Address> findByStudentId(int studentId)throws Exception{
        return AddressRepo.findByStudentId(studentId);
    }
    public List<Address> findAll()throws Exception{
        return AddressRepo.findAll();
    }
}
