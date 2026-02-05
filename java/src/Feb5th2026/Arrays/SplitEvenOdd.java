package Feb5th2026.Arrays;

import java.util.Arrays;

public class SplitEvenOdd {
    public static void main(String[] args) {
        //Split Even and Odd Array
        int[] arr = {5,1,6,7,8,2,9,10,0};

        // first odd or even
        int evenCount = 0,oddCount = 0;
        for (int num : arr){
            if (num % 2 == 0)evenCount++;
            else oddCount++;
        }
        // create array odd even
        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];

        //  Fill element
        int e = 0 ,o = 0;
        for (int num : arr){
            if (num %2 == 0) even[e++] = num;
            else odd[o++]=num;
        }
        // Print the results
        System.out.println("Even numbers: " + Arrays.toString(even));
        System.out.println("Odd numbers: " + Arrays.toString(odd));

//        for (int num : odd){
//            System.out.print(num);
//        }
//        for (int num : even){
//            System.out.println(num);
//        }
    }
}
