package July22nd;

import java.util.Scanner;

public class palindromne2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int rev=0;

        int m=num;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
    if (rev==m){
        System.out.println(m+" it is a Palindrome");
    }
    else System.out.println(m+" it is not a palindrome");
    }

}
