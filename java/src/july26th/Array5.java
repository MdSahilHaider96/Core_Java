package july26th;

public class Array5 {
    public static void main(String[] args) {
        int[] a={3,6,7,9,2};
        int[] b=new int[a.length];
        for(int i= a.length-1,k=0;i>=0;i--,k++){
            b[k]=a[i];
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}
