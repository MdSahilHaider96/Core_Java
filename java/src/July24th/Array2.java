package July24th;

public class Array2 {
    public static void main(String[] args) {
        int A[]=new int[5];
        int B[]={2,6,4,3,5,6,2};
        A[3]=67;
        System.out.println(A.length);
        System.out.println(B.length);
        //Print Array using For Loop
        for(int i=0;i<A.length;i++){
            System.out.println("Array of A : "+A[i]);
        }
        for(int i=0;i<B.length;i++){
            System.out.println("Array of B : "+B[i]);
        }
        //Reverse the Array
        for (int j=A.length-1;j>=0;--j){
            System.out.println("Reverse Array of A : "+A[j]);
        }
        for (int j=B.length-1;j>=0;--j){
            System.out.println("Reverse Array of B : "+B[j]);
        }
        //Print Array Using for Each Loop
        for(int x:A){
            System.out.println("Array of A using For Each Loop : "+x);
        }
        for(int x:B){
            System.out.println("Array of B using each Loop : "+x);
        }

    }
}
