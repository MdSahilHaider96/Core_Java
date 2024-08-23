package August19th;

public class PrintLaptop {

    String brand;
    int price;
    public PrintLaptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
//    public String toString(){
//        return brand+" "+price;
//    }
    public static void main(String[] args) {
        PrintLaptop obj = new PrintLaptop("DELL",5000);
        System.out.println(obj);
    }
}
