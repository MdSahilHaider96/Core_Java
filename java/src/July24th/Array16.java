package July24th;

public class Array16 {
    public static void main(String[] args) {
        //rotating array
        int a[]={3,7,3,2,31,5};
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for (int x:a){
            System.out.println(x);
        }
    }
}
