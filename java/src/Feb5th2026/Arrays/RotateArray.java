package Feb5th2026.Arrays;

import java.util.Arrays;

public class RotateArray {
    //Rotate Array by k steps
    public static void main(String[] args) {
        int[] arr = {5,9,7,3,4,9};
        int k = 3;
        k = k % arr.length;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length ; i++){
            rotated[(i + k) % arr.length ] = arr[i];
        }
        //copy array
        for (int i =0 ; i < arr.length ; i++){
            arr[i] = rotated[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
