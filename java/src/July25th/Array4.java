package July25th;

public class Array4 {
    public static void main(String[] args) {
        //04) 	wap to print only odd numbers from an array
        int[] a={2,5,9,8,6,3};
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
}
