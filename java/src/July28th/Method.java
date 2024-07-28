package July28th;

import java.util.Scanner;

public class Method {
    //max number find
     int max(int x,int y){
        if(x>y){
            return x;
        }
        else
        return y;
    }

    public static void main(String[] args) {
        int a =12,b=20,c=98;
        Method obj=new Method();
        b=obj.max(a,c);
        System.out.println(b);
//        b=max(a,c);
//        System.out.println(c);
    }

}

