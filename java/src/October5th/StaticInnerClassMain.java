package October5th;

public class StaticInnerClassMain {
    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass();
        innerClass.display();
    }
}
