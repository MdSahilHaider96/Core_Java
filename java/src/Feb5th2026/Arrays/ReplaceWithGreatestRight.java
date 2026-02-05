package Feb5th2026.Arrays;

import java.util.Arrays;

public class ReplaceWithGreatestRight {
    //  Replace every element with the greatest element on right side
    public static void main(String[] args) {
        int arr[] = {11,15,3,9,5,6,8,2};
        int n = arr.length;

        int maxRight = -1; //Last element has no element to its right

        // Traverse array to the right to left
        for (int i = n-1 ; i >= 0 ; i--){
            int temp = arr[i]; // Store current element
            arr[i] = maxRight; // replace with maxRight
            if ( temp > maxRight){
                maxRight = temp; // update maxRight
            }
        }
        System.out.println("Modified Array : "+ Arrays.toString(arr));
    }
}
