package August27th;

import java.util.Scanner;

public class ArrayDeletion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array u want");
        int num= sc.nextInt();
        int[] arr = new int[num];
        int[] arr2= new int[num-1];
        System.out.println("Enter the Element");
        for (int i=0 ;i< arr.length;i++) arr[i] = sc.nextInt();
        System.out.println("Enter the Inndex u want to Delete");
        int m=sc.nextInt();
        for (int i=0 ;i<arr2.length;i++){
            if(i<m){
                arr2[i]=arr[i];
            }
            else if (i==m){
                continue;
            }
            else {
                arr2[i-1]=arr[i];
            }
        }
        for (int x:arr2){
            System.out.println(x);
        }
    }
}
