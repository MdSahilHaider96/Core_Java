package July25th;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        //wap to print number not divisible by given number from an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int[] a={9,2,3,7,4,5};
        for (int i=0;i<a.length;i++){
            if(a[i]%num!=0){
                System.out.println(a[i]);
            }
        }
    }
}
