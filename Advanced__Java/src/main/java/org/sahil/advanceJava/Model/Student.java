package org.sahil.advanceJava.Model;

import java.util.ArrayList;
import java.util.List;

//To ek code likho
//2 tables se data lao
//Ek user table
//Ek address table
//User table ka I'd address table ka liye foreign key hoga
//Aur ek User ka ek ya oos se zyada bhi address ho sakta hai
//To User fetch kya I'd se to oos User ka details plus oos ka address list terminal mai display karo
public class Student {
    private int id;
    private String name;
    private int age;
    private List<Address> addressList;
    private List<Qualifications> qualificationsList;

    public Student() {
    }

    public Student(int id, String name, int age, List<Address> addressList , List<Qualifications> qualificationsList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addressList = addressList;
        this.qualificationsList=qualificationsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Qualifications> getQualificationsList() {
        return qualificationsList;
    }

    public void setQualificationsList(List<Qualifications> qualificationsList) {
        this.qualificationsList = qualificationsList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addressList=" + addressList +
                ", qualificationsList=" + qualificationsList +
                '}';
    }
}
