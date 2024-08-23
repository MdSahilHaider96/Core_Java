package August19th;

import java.util.Scanner;

public class HashcodeMethod {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc= new Scanner(System.in);
        Integer num= sc.nextInt();
         int hashValue = num.hashCode();
        System.out.println("Hash code Value for object is: " + hashValue);
}
}
