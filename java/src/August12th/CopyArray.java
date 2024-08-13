package August12th;

public class CopyArray {
    public static void main(String[] args) {
        //copyArray
        int[] arr={3,5,8,9,1};
        int[] arr2= new int[arr.length];
        for (int i=0,k=0;i<arr.length;i++,k++){
            arr2[k]=arr[i];
        }
        for (int x : arr2){
            System.out.println(x);
        }
    }
}
