package July22nd;


import java.util.Scanner;

public class DisplaySumOfNumbers1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int sum=sc.nextInt();
        for(int i=1;i<10;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
