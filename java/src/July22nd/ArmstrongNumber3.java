package July22nd;

import java.util.Scanner;

public class ArmstrongNumber3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int m=n;
        int r;
        while (n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
    if (sum==m){
        System.out.println(m+"  is a Armstrong Number");
    }
    else System.out.println(m+"  not a Armstrong Number");
    }
}
