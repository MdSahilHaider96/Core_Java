package July22nd;

import java.util.Scanner;

public class Pakindrome4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int rev=0,r;
        int m=n;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
    if (rev==m){
        System.out.println(m+" it is a palindrome");
    }
    else System.out.println(m+" it is not va palindrome");
    }
}
