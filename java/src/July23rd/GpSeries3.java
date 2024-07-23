package July23rd;

import java.util.Scanner;

public class GpSeries3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Starting number ");
        int a= sc.nextInt();
        System.out.println("Enter a ratio ");
        int r=sc.nextInt();
        System.out.println("Enter a Sequence u want ");
        int s= sc.nextInt();
        int term=a;
        for(int i=0;i<s;i++){
            System.out.print(term+" ,");
            term=term*r;

        }
    }
}