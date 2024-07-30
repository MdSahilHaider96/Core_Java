package July30th.July25th;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        //08) 	wap to print number divisible by given number from an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
        int[] a={4,2,4,2,7,8,9,10};
        for (int i=0;i<a.length;i++){
            if(a[i]%num==0){
                System.out.println(a[i]);
            }
        }
    }
}
