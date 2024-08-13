package August12th;

public class Array {
    public static void main(String[] args) {
        int[] arr = {5, 5, 7, 9, 10};
        int[] arr2 = {arr.length};
        for(int i=0,k=0;i<arr.length;i++,k++){
            arr2[k]=arr[i];
        }
        for (int x:arr2){
            System.out.println(x);
        }
    }
}
