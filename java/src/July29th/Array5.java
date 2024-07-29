package July29th;

public class Array5 {
    //greatest element
    public static void main(String[] args) {
        int[] a = {1000, 1, 500, 4, 10, -50, 100, 200};
        int[] b = {-1000, -1, -500, -4, -10, -50, -100, -200};
        int[] c = new int[a.length + b.length];
        int x = 0;
        for (int i=0; i<a.length; i++) {
            c[x++] = a[i];
        }
        for (int i=0; i<b.length; i++) {
            c[x++] = b[i];
        }
        for (int i=0; i<c.length; i++) {
            System.out.println("c["+i+"] = " + c[i]);
        }
    }
}
