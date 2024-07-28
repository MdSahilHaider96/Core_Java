package july26th;

public class Array6 {
    public static void main(String[] args) {
        int[] a={5,87,0,2,3};
        int [] b= new int[a.length];
        for(int i= a.length-1,k=0;i>=0;i--,k++){
            b[k]=a[i];
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}
