package July30th;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int s=5;
        System.out.print(a+" , "+b+" , ");
        for (int i=0;i<s-2;i++){
            int c=a+b;
            System.out.print(c+" , " );
            a=b;
            b=c;

        }
    }
}
