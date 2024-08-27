package August27th;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array u want");
        int num= sc.nextInt();
        int[] arr=new int[num];
        int[] arr2=new int[num-1];
        System.out.println("Enter the Elements");
        for (int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the index u want to delete");
        int l=sc.nextInt();
        for (int i=0;i< arr.length;i++){
            if(i<l){
                arr2[i]=arr[i];
            }
            else if(i==l){
                continue;
            }
            else {
                arr2[i-1]=arr[i];
            }
        }
        for (int x:arr2){
            System.out.print(x+",");
        }
    }
}
