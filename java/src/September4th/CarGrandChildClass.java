package September4th;

public class CarGrandChildClass extends CarChildClass {
    @Override
    void display() {
        brand="Mahindra";
        System.out.println(brand);

    }

    @Override
    void Carno() {
        id=2;
        System.out.println(id);
    }
}
