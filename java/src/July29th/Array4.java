package July29th;

public class Array4 {
    // factorial of element
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 6, 5};
        for (int i=0; i<a.length; i++) {
            int fact = factorial(a[i]);
            System.out.println("Factorial of " + a[i] + " is " + fact);
        }
    }

    static int factorial(int n) {
        int f = 1;
        for (; n> 0; ) {
            f = f * n--;
        }
        return f;
    }
}
