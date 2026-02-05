package Feb5th2026.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        // Reverse array in a place
        int[] arr = {5,9,7,3,4,9};
        // point first and last index
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            // swapping right to left
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        // print array
        for(int num : arr){
            System.out.print(num);
        }
        //

        Integer[] arr1 = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr1);
        Collections.reverse(list);
        System.out.println("Reverse using collections : "+ list);
    }
}
