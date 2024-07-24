package July24th;

public class Array15 {
    // Rotating Array
    public static void main(String[] args) {
        int a[]={3,1,9,4,2,8};
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int x:a){
            System.out.println(x);
        }
    }
}
