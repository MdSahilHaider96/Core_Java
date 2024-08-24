package August24th;

public class Method21 {
    //21.	boolean prime(int), check whether given number is prime or not and return true or false
    static void prime(int  num){
        if(num%2==0){
            System.out.println("True");
        }
        else System.out.println("False");
    }

    public static void main(String[] args) {
        prime(51);
    }
}
