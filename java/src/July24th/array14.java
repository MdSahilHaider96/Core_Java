package July24th;

public class array14 {
    public static void main(String[] args) {
        //left rotataing array
        int a[]={5,3,6,7,1,8};
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[1];
        }
        a[a.length-1]=temp;
        for(int x:a){
            System.out.print(x+" , ");
        }
    }
}
