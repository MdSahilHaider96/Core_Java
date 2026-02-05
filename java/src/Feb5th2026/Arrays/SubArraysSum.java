package Feb5th2026.Arrays;


import java.util.HashMap;

public class SubArraysSum {
    public static void main(String[] args) {
    //  Find the count of sub arrays with sum=k
        int[] arr = {1,2,3,4,5,6};
        int k = 5;
        int count = 0;

        System.out.println("Subarrays with sum : "+ k + " : ");
        // loops to check all subarrays

        for (int i=0 ; i < arr.length ; i++){
            int sum = 0;
            for (int j = i; j < arr.length;j++){
                sum += arr[j];
                if (sum == k){
                    count++;
                    //print the subarray
                    System.out.print("[");
                    for (int x = i ;x <= j ;x++){
                        System.out.print(arr[x]+ " ");
                    }
                    System.out.println("]" + sum);
                }
            }
        }
        System.out.println("Total count of subarrays with sum " + k + " = " + count);
    }
}
