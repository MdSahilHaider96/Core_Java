package july26th;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // 13) 	wap to find some of an array element
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int[] a={3,6,8,6,4,5};
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                System.out.println("Found "+a[i]);
            }
        }

    }
}
