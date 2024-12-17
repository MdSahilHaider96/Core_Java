package org.sahil.advanceJava.Controller;

import org.sahil.advanceJava.Model.Qualifications;
import org.sahil.advanceJava.Service.QualificationsService;

import java.util.List;

public class QualificationsController {
    public static void main(String[] args) throws Exception{
        QualificationsService qualificationsService=new QualificationsService();
//        try {
//            qualificationsService.create(1,"MCA","SCIENCE","2025");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
            List<Qualifications> qualificationsList = qualificationsService.findByStudentId(1);
            qualificationsList.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
