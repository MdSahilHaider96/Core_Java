package July24th;

public class Array13 {
    public static void main(String[] args) {
        //left rotated
        //Array Rotating
        int a[]={4,2,13,43,1};
        int temp= a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int x:a){
            System.out.println(x);
        }
    }
}
