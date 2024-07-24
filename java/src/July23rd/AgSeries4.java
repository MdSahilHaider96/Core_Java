package July23rd;

import java.util.Scanner;

public class AgSeries4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Starting Number of a Sequence");
        int a= sc.nextInt();
        System.out.println("Enter a Diffrence in sequence ");
        int d=sc.nextInt();
        System.out.println("Enter a Number you want number of Sequence");
        int s= sc.nextInt();
        int term= a;
        int count=1;
        for(int i=0;i<s;i++){
             term=term+d;
             count++;
            System.out.println(count+": "+term);
        }
    }
}
