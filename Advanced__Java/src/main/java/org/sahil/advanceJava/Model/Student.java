package org.sahil.advanceJava.Model;
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
    private String address1;
    private String address2;
    private String address3;

    public Student() {
    }

    public Student(int id, String name, int age, String address1, String address2, String address3) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
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

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                '}';
    }
}
