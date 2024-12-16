package org.sahil.advanceJava.Model;

public class Address {
    private int id;
    private  String address;
    private  String address2;
    private  String address3;

    public Address() {
    }

    public Address(int id, String address, String address2, String address3) {
        this.id = id;
        this.address = address;
        this.address2 = address2;
        this.address3 = address3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                '}';
    }
}
