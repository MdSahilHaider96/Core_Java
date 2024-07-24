package July24th;

public class Array4 {
    public static void main(String[] args) {
        int a[]= {1,2,1,6};
        //Sum of Array Elements
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
