package july26th;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        //14) 	wap to find greatest number from any array
        int[] a={3,5,6,99,23};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                System.out.println(max);
            }
        }
    }
}

