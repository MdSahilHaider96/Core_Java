package org.sahil.advanceJava.Service;

import org.sahil.advanceJava.Model.Qualifications;
import org.sahil.advanceJava.Repository.QualificationsRepo;

import java.util.List;

public class QualificationsService {
    public void create(int studentId , String degree , String stream , String year) throws Exception{
        QualificationsRepo.create(studentId,degree,stream,year);
    }
    public List<Qualifications> findByStudentId(int studentId) throws Exception{
        return QualificationsRepo.findByStudentId(studentId);
    }
}
