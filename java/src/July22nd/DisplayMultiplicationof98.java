package July22nd;

import java.util.Scanner;

public class DisplayMultiplicationof98
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0;i<10;i++){
            System.out.println(num +"*"+i+"="+num*i);
        }
    }
}
