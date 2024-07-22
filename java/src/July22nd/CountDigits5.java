package July22nd;

import java.util.Scanner;

public class CountDigits5 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        long num= sc.nextInt();
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
