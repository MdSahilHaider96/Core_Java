package org.sahil.advanceJava.Model;

public class Countries {
    //	18.	countries ( code, name, continent_name )
    private int code;
    private String name;
    private  String continent_name;

    public Countries() {
    }

    public Countries(int code, String name, String continent_name) {
        this.code = code;
        this.name = name;
        this.continent_name = continent_name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", continent_name='" + continent_name + '\'' +
                '}';
    }
}
