package July31st;

public class Method7 {
    static int factorial(int n) {
        int fact = 1;
        for (int i =1; i <= n; i++) {
            fact = fact * n;
            System.out.println(fact);
        }
        return fact;
    }

    public static void main(String[] args) {
        factorial(3);
    }
}

