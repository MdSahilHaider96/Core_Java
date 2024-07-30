package July29th;

public class Array7 {
    public static void main(String[] args) {
        //	wap to find duplicate elements in an array?
        int[] a={3,5,6,9,1,10};
        int temp=a[0];
        for(int i=0;i< a.length;i++){
            if(temp==a[i]){
                System.out.println(temp);
            }
        }
    }
}
