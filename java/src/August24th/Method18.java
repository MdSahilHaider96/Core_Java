package August24th;

public class Method18 {
    //	18.	double average(int, int, int) - find average of formal arguments and return result
    static  void average(int a ,int b ,int c){
        int Sum = (a+b+c);
        double average = Sum / 3;
        System.out.println(average);
    }

    public static void main(String[] args) {
        average(8,56,100);
    }
}
