package July22nd;

import java.util.Scanner;

public class factorialof2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =sc.nextInt();

        long fact =1;
        for (int i=1;i<=num;i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
