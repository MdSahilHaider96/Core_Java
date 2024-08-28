package August28th;

public class FibonacciSeries {
    public static void fibonacci(int a , int b , int s){
        System.out.print(a+", "+b+", ");
        for (int i=0;i<s-2;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+", ");
        }
    }

    public static void main(String[] args) {
        fibonacci(1,2,5);
    }
}
