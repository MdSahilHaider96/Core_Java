package Interview;

public class CountDigits {
    //A school has following rules for grading system:
    //		a. Below 25 - F
    //		b. 25 to 45 - E
    //		c. 45 to 50 - D
    //		d. 50 to 60 - C
    //		e. 60 to 80 - B
    //		f. Above 80 - A
    public static void main(String[] args) {
        int marks = 45;
                if(marks <= 25) {
                    System.out.println( marks+": F");
                } if (marks >= 25 && 25 <= 45 ) {
                    System.out.println("E");
                }
    }
}
