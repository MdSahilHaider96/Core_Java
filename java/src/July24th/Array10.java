package July24th;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int a[]={7,43,24,67,22,98};
        // largest array
        int max =a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
