package July30th;

public class Array7 {
    public static void main(String[] args) {
        //07) 	wap to print only negative number from an array
        int[] a={9,-7,9,8,-2,-3};
        for (int i=0;i<a.length;i++){
            if(a[i]<0){
                System.out.println(a[i]);
            }
        }
    }
}
