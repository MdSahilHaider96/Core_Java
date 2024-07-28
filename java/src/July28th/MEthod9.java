package July28th;

public class MEthod9 {
    //19.	double percent(int, int, int, int, int), suppose 5 arguments are marks in subjects, each subject is of 100 marks, find percentage and return
    //		result.
    static double percent(double a ,double b ,double c  ,double d ,double e, double marks){
    double add= (a+b+c+d+e);
    double per = add/marks*100;
    return per;
    }

    public static void main(String[] args) {
        System.out.println(percent(99,99,99,99,99,500));
    }
}
