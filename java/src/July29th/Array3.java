package July29th;

public class Array3 {
    public static void main(String[] args) {
        int[] a = {4,2,5,6,1};
        int[] b = new int[a.length];
        for (int i=a.length-1, k=0; i>=0; i--, k++) {
            b[k] = a[i];
        }
        for (int i=0; i<b.length; i++) {
            System.out.println(i + " : " + b[i]);
        }
    }
}
