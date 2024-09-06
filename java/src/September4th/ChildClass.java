package September4th;

public class ChildClass extends ParentsClass {
    @Override
    void display() {
        System.out.println("ChildClass");
    }
    void parentDisplay(){
        super.display();
    }
}
