package September4th;

public class CarGrandChildMain {
    public static void main(String[] args) {
        CarGrandChildClass carGrandChildClass = new CarGrandChildClass();
        carGrandChildClass.display();
        carGrandChildClass.Carno();
        // Object from child Class
        CarChildClass carChildClass = new CarChildClass();
        carChildClass.display();
        carChildClass.Carno();
        // Object from Parent Class
        CarClass carClass = new CarClass();
        carClass.display();
        carGrandChildClass.finalDisplay();
    }
}
