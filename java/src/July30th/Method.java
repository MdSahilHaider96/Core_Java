package July30th;

import java.util.Scanner;

public class Method {
    //5.	void printNum(int[], int), method will print number if found in array from supplied array
    //		e.g. if a[]={1,2,3} n b=2 then print 2
    Scanner sc= new Scanner(System.in);
    public void printrif(){
        int a[]={7,1,2,3,4};
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if (a[i]==num){
                System.out.println(a[i]);
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Method obj=new Method();
        obj.printrif();

    }
}
