package August19th;

public class Laptop {

    String brand;
    int price;
    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {
        Laptop obj = new Laptop("ASUS", 50000);
        System.out.println(obj);
    }
}