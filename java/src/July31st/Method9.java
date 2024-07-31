package July31st;

public class Method9 {
    //22.	void fibonocci(int), print fibonacci series
    static int fibonacci(int n1 ,int n2 , int seq){
        int fib=0;
        int count=1;
        for (int i=1 ;i<=seq;i++){
            fib=n1+n2;
            n1=n2;
            n2=fib;
            System.out.println(fib);
        }
        return fib;
    }

    public static void main(String[] args) {
        fibonacci(1,2,5);
    }
}
