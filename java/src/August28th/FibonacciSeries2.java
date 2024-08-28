package August28th;

public class FibonacciSeries2 {
    public static void fibo(int a , int b,int s){
        int temp;
        System.out.print(a+", "+b+", ");
        for (int i=0;i<s-2;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+", ");
        }
    }

    public static void main(String[] args) {
        fibo(1,2,5);
    }
}
