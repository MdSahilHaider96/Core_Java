package August24th;

public class Method22 {
    //22.	void fibonocci(int), print fibonacci series
    static void fibonacci(int num,int num2,int seq){
        int temp ;
        for(int i=1;i<=seq;i++){
            temp=num+num2;
            num=num2;
            num2=temp;

            System.out.print(temp+" , ");
        }

    }

    public static void main(String[] args) {
        fibonacci(1,2,5);
    }
}
