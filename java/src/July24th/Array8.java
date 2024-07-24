package July24th;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        //searching Array
        int a[] = {2, 5, 6, 3, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Key");
        int key = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println("key Found : "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
