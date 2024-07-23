package July23rd ;

import java.util.Scanner;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Starting Number");
        int a= sc.nextInt();
        System.out.println("enter a Second Number");
        int b=sc.nextInt();
        System.out.println("enter a number of sequence u want");
        int s= sc.nextInt();
        System.out.print(a+" , "+b+" , ");
        for (int i=0;i<s-2;i++){
            int c=a+b;
            System.out.print(c+" , ");
            a=b;
            b=c;
        }
    }
}
