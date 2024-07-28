package july26th;

public class Array1 {
    public static void main(String[] args) {
        // copying an array
        int[] a={3,4,6,9};
        int[] b= new int[a.length];
        for(int i=a.length-1,k=0;i>=0;i--,k++){
            b[k]=a[i];
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}

