package July24th;

public class array17 {
    public static void main(String[] args) {
        int a[]={2,5,7,9,3,1};
        int temp=a[0];
        for (int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int x:a){
            System.out.print(x+" , ");
        }
    }
}
