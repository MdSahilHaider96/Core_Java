package October5th;

public class OuterInnerMain {
    public static void main(String[] args) {
                OuterInner outerInner = new OuterInner();
                OuterInner.InnerClass myInner = outerInner.new InnerClass();
                System.out.println(myInner.myInnerMethod());
            //output 10
    }
}
