package July31st;

public class Method6 {
    //19.	double percent(int, int, int, int, int), suppose 5 arguments are marks in subjects, each subject is of 100 marks, find percentage and return
    //		result.
    static double percentage(int a ,int b,int c,int d,int e,int totalMarks){
        double add=(a+b+c+d+e);
        double average= add/totalMarks*100;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(percentage(89,72,40,59,49,500)+"%");
    }
}
