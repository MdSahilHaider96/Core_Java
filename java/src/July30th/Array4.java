package July30th;

public class Array4 {
    public static void main(String[] args) {
        int[] a={3,4,5,7,9,};
        int[] b=new int[a.length];
        for(int i= a.length-1,k=0;i>=0;i--,k++){
            b[k]=a[i];
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}
