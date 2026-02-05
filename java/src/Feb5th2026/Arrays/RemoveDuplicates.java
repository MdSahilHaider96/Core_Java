package Feb5th2026.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Remove duplicates from unsorted Array
        int arr[] = {1,2,3,4,5,6,1,5};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num); // hashSet ignores duplicated auto
        }
        // coverts set to array
        int[] result = new int[set.size()];
        int i =0;
        for (int num : set){
            result[i++] = num;
        }
        System.out.println("Array without duplicate : "+Arrays.toString(result));
    }
}
