package Feb5th2026.Arrays;

import java.util.Arrays;

public class CheckEqual {
    public static void main(String[] args) {
        // Check if two arrays are equal or not
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,2,3,4,5};

        if (Arrays.equals(arr,arr2)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }

    }
}
