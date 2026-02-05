package Feb5th2026.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        // Find Missing Element using Sum

        int arr[] = {1,2,3,5,6};
        // index of missing
        int n = arr.length+1;

        // calcuate sum of first n natural number
        int totalsum = n * (n+1) / 2;

        // calcuate arraySUm
        int arraySum = 0;
        for(int sum : arr){
            arraySum += sum;
        }
        // Missing Elemnts
        int Missing = totalsum - arraySum;
        System.out.println(Missing);
    }
}
