package October5th;

public class OuterClassMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
        // 2nd mthod
        outerClass.new InnerClass().display();
    }
}
