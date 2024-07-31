package July31st;

public class Method17 {
    //35.	Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.
    static int isEven(int n){
        if(n%2==0){
            System.out.println("True");
        }
        else System.out.println("False");
    return n;
    }

    public static void main(String[] args) {
        isEven(10);
    }
}
