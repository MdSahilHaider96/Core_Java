public class Test {
    public static void main(String[] args) {
        int temp=0;
        int[] arr = {5,4,5,4,5};
        int[] arr2 = new int[arr.length];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>0){
                temp=arr[i];
                arr2[i]=temp;
            }
        }
       for (int i=0;i<arr2.length;i++){
           System.out.println(arr2[i]);
        }
    }
}
