package August12th;

public class CopyReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,5,5,7,10};
        int[] arr2= new int[arr.length];
        int temp=0;
        for (int i=arr.length-1,k=0;i>=0;--i,k++){
            temp=arr[i];
            arr2[k]=temp;
        }
        for (int x:arr2){
            System.out.println(x);
        }
    }
}
