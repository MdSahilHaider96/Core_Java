package July25th;

public class Array5 {
    public static void main(String[] args) {
        //05) 	wap to print only even numbers from an array
        int[] a={2,5,7,5,8,9};
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }

    }
}
