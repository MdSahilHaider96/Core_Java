package July28th;

import java.util.Scanner;

public class Method10 {
    //long factorial(int), find factorial of given argument and return result
    Scanner sc=new Scanner(System.in);
    public void factorial(int n){
        int fact=1;
      for(int i=1;i<=n;i++){
          fact=fact*i;
      }
        System.out.println(fact);
        }

    public static void main(String[] args) {
        Method10 obj=new Method10();
        obj.factorial(4);


    }
}
