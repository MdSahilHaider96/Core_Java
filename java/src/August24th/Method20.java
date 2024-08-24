package August24th;

public class Method20 {
    //20.	long factorial(int), find factorial of given argument and return result
    static void factorial(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
      factorial(3);

    }
}
