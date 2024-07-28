package July28th;
//  0 1 1 2 3 5 8
public class Method12 {
    int fibonacci(int n , int n2 , int s){=10
        int temp=0
        for(int i=0;i<=s-2;i++){
           temp=n+n2;
            n=n2;
            n2=temp;
            System.out.println(temp);
            break;
        }
   return n;
    }

    public static void main(String[] args) {
        Method12 obj=new Method12();
        obj.fibonacci(3);

    }
}
