package August27th;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int num,p,v;
        System.out.println("Enter the Number of array u Want");
        num=sc.nextInt();
        int[] arr = new int[num];
        int[] arr2 = new int[num+1];
        System.out.println("Enter the Element");
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Index u want to Insert the Element in an Array");
        p= sc.nextInt();
        System.out.println("Enter the Value u Want to Insert in an Array");
        v=sc.nextInt();
        for (int i=0;i<arr2.length;i++){
            if(i<p){
                arr2[i]=arr[i];
            }
                else if(i==p){
                    arr2[i]=v;
                }
                else {
                    arr2[i]=arr[i-1];
                }
        }
        for (int x:arr2){
            System.out.print(x+" ,");
        }
    }
}
