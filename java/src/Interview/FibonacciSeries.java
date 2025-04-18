package Interview;

public class FibonacciSeries {
    public static void main(String[] args) {
        //	41.	wap to print fibonocci series
        int num = 1;
        int num2 = 2;
        int seq = 5;
        int temp = 0;
        System.out.print(num+" , "+num2+" , ");
        for (int i = 0; i<seq-2;i++){
            temp = num + num2;
            num = num2;
            num2 = temp;
            System.out.print(temp+ ",");
        }
    }
}
