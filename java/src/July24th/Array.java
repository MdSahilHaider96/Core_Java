package July24th;

public class Array {
    public static void main(String[] args) {
        int A[]=new int[5];
        int B[]= {2,5,6,43,3};
         A[0]=5;
//         System.out.println(A.length);
//         System.out.println(A[0]);
//         System.out.println(B.length);
//         System.out.println(B[2]);
        // Access Array using for loop
         for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
        }
         // Reverse Print
         for (int i=A.length-1;i>=0;--i){
             System.out.print(A[i]);
         }
            // Using Each Loop
        for(int x:B){
            System.out.println(x);
        }

    }
}

