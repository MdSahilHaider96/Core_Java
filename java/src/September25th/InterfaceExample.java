package September25th;

public interface InterfaceExample {
public void fun();
default int sum(){
    return 1+2;
}
    static  void display(){
        System.out.println("Interface Example");
    }
}
