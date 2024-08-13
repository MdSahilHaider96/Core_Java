package August12th;

public class MaxMinArray {
    //66. 	Write a Java program to find the maximum and minimum value of an array
    public static void main(String[] args) {
        int[] arr={5,4,9,63,44};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
