package July31st;

public class Method5 {
    //18.	double average(int, int, int) - find average of formal arguments and return result
    static double average(double a, double b){
        double add = a+b;
        double average=add/2;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(average(21,2));
    }
}
