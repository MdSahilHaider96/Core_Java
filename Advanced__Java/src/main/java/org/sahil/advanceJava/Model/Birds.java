package org.sahil.advanceJava.Model;

public class Birds {
    //bird ( id, name, dob, color, canFly, weight, height, canSwim )
    private  int id;
    private String name;
    private String dob;
    private String color;
    private boolean canFly;
    private int weight;
    private double height;
    private boolean canSwim;
    public Birds(){}

    public Birds(int id, String name, String dob, String color, boolean canFly, int weight,double height, boolean canSwim) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.color = color;
        this.canFly = canFly;
        this.weight = weight;
        this.height=height;
        this.canSwim = canSwim;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", color='" + color + '\'' +
                ", canFly=" + canFly +
                ", weight=" + weight +
                ", height=" + height +
                ", canSwim=" + canSwim +
                '}';
    }
}
