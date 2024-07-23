package July23rd;

import java.util.Scanner;

public class Fibonacci4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b= sc.nextInt();
        System.out.println("Enter a Sequence u want");
        int s=sc.nextInt();
        int c;
        System.out.print(a+" , "+b+" , ");
        for (int i=0;i<s-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" , ");
        }
    }
}
