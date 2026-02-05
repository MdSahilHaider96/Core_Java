package Feb5th2026.Arrays;

public class MaximumProduct {
    //Find The maximum product of two element
    public static void main(String[] args) {
        int arr[] = {11,15,3,9,5,6,8,2};
        int n = arr.length;

        // Initalize the two largest and two smallest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr){
            // Track two largest Numbers
            if (num > max1){
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            // Track two smallest number
            if (num < min1){
                min2 = min1;
                min1 = num;
            } else if (num > min2) {
                min2 = num;
            }

        }
        // Maximum product
        int maxProduct = Math.max(max1*max2,min1*min2);
        System.out.println(maxProduct);
    }
}
