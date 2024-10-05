package September25th;

public interface Parrot {
    default  void fly(){
        System.out.println("Parrot can fly");
    }
}
