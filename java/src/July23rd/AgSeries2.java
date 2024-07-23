package July23rd;

import java.util.Scanner;

public class AgSeries2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //starting value of as sequence
        System.out.println("Enter a starting value of as sequence ");
        int a= sc.nextInt();
        //diffrence of a number
        System.out.println("Enter a Diffrence of a Number");
        int d=sc.nextInt();
        // number of sequence
        System.out.println("Enter a Number of Series u want");
        int s=sc.nextInt();
        int term=a;
        for (int i=0;i<s;i++){
             term=term+d;
            System.out.println(term);

        }

    }
}
