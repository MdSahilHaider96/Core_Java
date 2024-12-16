package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Client;
import org.sahil.advanceJava.Repository.ClientRepo;

import java.util.List;

public class ClientService {
    public void create(String name ,String address, String city , String state , int zip , String country,String email) throws Exception{
        ClientRepo.create(name,address,city,state,zip,country,email);
    }
    public void updateById(int id) throws Exception{
        ClientRepo.updateById(id);
    }

    public void deleteById(int clientId)throws Exception{
         ClientRepo.deleteById(clientId);
    }
    public List<Client> findAll()throws Exception{
      return  ClientRepo.findALl();
    }
    public List<Client> findById(int clientId) throws Exception{
        return ClientRepo.findById(clientId);
    }
}
