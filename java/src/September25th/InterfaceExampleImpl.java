package September25th;

 public class InterfaceExampleImpl implements InterfaceExample {

     @Override
     public void fun() {
         System.out.println("Fun");
     }
     @Override
     public int sum() {
         return InterfaceExample.super.sum();
     }
 }


