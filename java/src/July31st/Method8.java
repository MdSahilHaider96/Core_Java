package July31st;

public class Method8 {
    //21.	boolean prime(int), check whether given number is prime or not and return true or false
    static boolean prime(int n){
        boolean prime = n%2==0;
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(prime(7));
    }

}
