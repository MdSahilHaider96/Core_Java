package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Client;
import org.sahil.advanceJava.Service.ClientService;

import java.util.List;

public class ClientController {
    public static void main(String[] args) throws Exception {
        ClientService clientService = new ClientService();
//        try {
//            clientService.create("Sahil","129,Collin","KOLKATA","WEST BENGAL",70001,"INDIA","Sahil@gmail.com");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            clientService.updateById(2);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            clientService.deleteById(3);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
      try {
          List<Client>clientList=clientService.findById(2);
          clientList.forEach(System.out::println);
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }
}
