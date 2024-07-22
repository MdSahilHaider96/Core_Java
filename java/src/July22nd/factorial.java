package July22nd;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
