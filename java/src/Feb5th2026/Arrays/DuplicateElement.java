package Feb5th2026.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        //Find all dupicate element in an array
            char[] arr={'S','a','h','i','l','H','a','i','d','e','r','r','r'};
            for (int i=0;i<arr.length;i++){
                for (int j=i+1 ; j < arr.length; j++){
                    if( arr[i] == arr[j] ){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
    }
}
