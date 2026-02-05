package Feb5th2026.Arrays;

public class FindPairs {
    public static void main(String[] args) {
        // Find All pairs whose sum is zero
        int arr[] = {1,-1,-5,4,-3,3};
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1; j < arr.length ; j++){
                if (arr[i] + arr[j] == 0){
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
