package Feb5th2026.Arrays;

public class CountElement {
    // Count how many times a given element appears
    public static void main(String[] args) {
        char[] arr={'S','a','h','i','l','H','a','i','d','e','r','r','r'};
        char find = 'r';
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (find == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
