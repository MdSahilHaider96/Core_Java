package July28th;

public class Method8 {
    //double average(int, int, int) - find average of formal arguments and return result
    static double average (double x , double y,double z) {
        double average = (x + y + z)/3;
        return average;
    }
    static double average2(double x ,double y){
        double average =(x+y)/2;
        return average;
    }

    public static void main(String[] args) {
         System.out.println(average(2,2,9));
        System.out.println(average2(2,3));
    }
}


