package September25th;

public class Birds implements Pigeon , Parrot{

    @Override
    public void fly() {
        System.out.println("Birds can fly");
    }
    public void fly1(){
        Parrot.super.fly();
    }
    public void fly2(){
        Pigeon.super.fly();
    }
}
