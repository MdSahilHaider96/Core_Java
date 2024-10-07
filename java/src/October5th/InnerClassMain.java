package October5th;

public class InnerClassMain {
    public static void main(String[] args) {
        // First Create object outer CLass
        InnerClass innerClass = new InnerClass();
        // create inner class object
        InnerClass.InnerClass1 innerClass1 = innerClass.new InnerClass1();
        innerClass1.display();
        InnerClass.InnerClass2 innerClass2 = innerClass.new InnerClass2();
        innerClass2.display();
        // 2ND METHOD
        innerClass.new InnerClass1().display();
        innerClass.new InnerClass2().display();
    }
}
