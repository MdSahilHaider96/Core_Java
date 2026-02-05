package Feb5th2026.Arrays;

public class Array {
    // Find the largest and smallest element in Array
    public static void main(String[] args) {
        int arr[] = {2,9,4,8,6};
        // initializa min and max with first element or index
        int min = arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("largest = "+ max);
        System.out.println("smallest = "+ min);
    }
}
