package August27th;

public class ArrayOperationsClass {
    //35. 	create a class ArrayOperation and add methods like int[] copy(int[] a), int[] reverse(int[] b), int[] addTwoArrays(int[] a, int[] b), void
    //		print(int[] p), int sumArray(int a[]), int findMax(int[] a), int findMin(int[] a), int countNegative(int a[]), int countPositive(int a[]),
    public void arrayPrint(int[] arr ){
        System.out.println("PRINTING");
        System.out.println("FOR LOOP");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("FOR EACH LOOP");
        for(int p: arr){
            System.out.println(p);
        }
    }
    public void copyArray(int[] arr){
        System.out.println("COPY ARRAY");
        arr=new int[]{9,1,5,6,7,5};
        int[] arr2 = new int[arr.length];
        for (int i=0;i< arr.length;i++){
            arr2[i]=arr[i];
        }
        for (int p:arr2){
            System.out.println(p);
        }
    }
    public void reverseArray(int[] arr){
        System.out.println("REVERSE ARRAY");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public void addTwoArrays(int[]arr , int[] arr2){
        System.out.println("ADD TWO ARRAYS");
        int[] arr3= new int[arr.length+ arr2.length];
        int x=0;
        for (int i=0;i<arr.length;i++){
            arr3[x]=arr[i];
            x++;
        }
        for (int i=0;i<arr2.length;i++){
            arr3[x]=arr2[i];
            x++;
        }
    }
    public void sumArray(int[] arr){
        System.out.println("SUM");
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public void findMax(int[] arr){
        System.out.println("FIND MAXIMUM");
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public  void findMin(int[] arr){
        int min = arr[0];
        System.out.println("FIND MINIMUM");
        for (int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    public void countNegative(int[] arr){
        System.out.println("FIND NEGATIVE");
        for (int i=0;i< arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
    public void countPositive(int[] arr){
        System.out.println("FIND POSITIVE");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}
