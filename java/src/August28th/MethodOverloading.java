package August28th;

public class MethodOverloading {
    public void sum(int a , int b){
        int sum = a+b;
        System.out.println("Sum : "+sum);
    }
    public void sum(int a,int b ,int c){
        int sum = a+b+c;
        System.out.println("Sum : "+sum);
    }
    public static  void sub(int a , int b){
        int sub = a-b;
        System.out.println(sub);
    }
}
