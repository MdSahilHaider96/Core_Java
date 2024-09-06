package September4th;

public class CarChildClass extends CarClass {
    int id;
    @Override
    void display() {
        brand="Honda";
        System.out.println(brand);
    }
    void Carno(){
        id=1;
        System.out.println(id);
    }
}
