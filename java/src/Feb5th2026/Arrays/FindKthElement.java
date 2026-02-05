package Feb5th2026.Arrays;

import java.util.Arrays;

public class FindKthElement {
    public static void main(String[] args) {
        // Find kth largest Element
        int arr[] = {1,2,3,4,5,8,9,0,5,11,7,1,2,3};
        int k = 3; // which largest number you want
        Arrays.sort(arr);
        // kth largest element
        int kthlatgest = arr[arr.length-k];
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println(k + " Largest kth ELement is : " + kthlatgest);
    }
}
