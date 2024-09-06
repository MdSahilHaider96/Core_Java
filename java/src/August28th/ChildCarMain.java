package August28th;

public class ChildCarMain {
    public static void main(String[] args) {
        ChildCar childCar = new ChildCar();//ChildClass
        childCar.printing();
        Car car = new Car();// ParentClasss
        car.printing();
    }
}
