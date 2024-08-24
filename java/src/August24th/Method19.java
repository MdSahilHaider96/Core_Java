package August24th;

public class Method19 {
    //19.	double percent(int, int, int, int, int), suppose 5 arguments are marks in subjects, each subject is of 100 marks, find percentage and return
    //		result.
    static void percentage(int a , int b , int c , int d , int e,int Subjects){
        double sum= a+b+c+d+e;
        double totalMarks=Subjects*100;
        double percentage = sum*100/totalMarks;
        System.out.println(percentage+"%");
    }

    public static void main(String[] args) {
        percentage(97,80,66,44,66,5);

    }
}
