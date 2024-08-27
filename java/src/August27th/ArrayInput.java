package August27th;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int num,m,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Array u Want");
        num=sc.nextInt();
        int[] arr= new int[num];
        int[] arr2=new int[num+1];
        System.out.println("Enter the Values");
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index value u want to be insterted");
        m= sc.nextInt();
        System.out.println("Enter the New value u want to be insterted");
        n=sc.nextInt();
        for (int i=0;i< arr2.length;i++){
            if(i<m){                    //10 ,20, 30 ,
                arr2[i]=arr[i];
            }
            else if(i==m){
                arr2[i]=n;
            }
            else
                arr2[i]=arr[i-1];
        }
        System.out.println("Elements are : ");
        for (int p:arr2){
            System.out.print(p+", ");
        }
    }
}
