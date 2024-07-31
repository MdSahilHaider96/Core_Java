package July31st;

public class Method18 {
    //Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
    // Call this method from main() and print the results.
    static int getTotal(int a , int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getTotal(9,5));
    }
}
