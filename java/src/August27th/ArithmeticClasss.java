package August27th;

public class ArithmeticClasss {
    //34. 	create a class of name Arithmetic, add methods like add, sub, div, prod, fibonacci, prime, factorial. Plz make these methods return type and
    //		arguments according to your wish.
    public void add(int a , int b){
        int sum= a+b;
        System.out.println("ADDITION");
        System.out.println(sum);
    }
    public void sub(int a , int b){
        int sub = a-b;
        System.out.println("SUBTRACT");
        System.out.println(sub);
    }
    public void div(int a ,int b){
        double div=a/b;
        System.out.println("DIVISION");
        System.out.println(div);
    }
    public void prod(int a , int b){
        double prod = a*b;
        System.out.println("PRODUCT");
        System.out.println(prod);
    }
    public void remainder(int a , int b){
        double remainder=a%b;
        System.out.println("REMAINDER");
        System.out.println(remainder);
    }

    public void prime (int num){
        System.out.println("PRIME");
        boolean Prime = (num%2==0);
            System.out.println(Prime);
    }
    public void factorial(int n){
        int fact=1;
        System.out.println("FACTORIAL");
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

