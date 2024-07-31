package July31st;

import java.util.Scanner;

public class Method16 {
    //34.	Write a value-returning method,
    // isVowel that returns the value true if a given character is a, vowel, and otherwise returns false.
    public void vowel() {
        char[] v = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        char n='A';

        for(int i=0;i<v.length;i++){
            if(v[i]==n){
                System.out.println("True");
            }
            else   System.out.println("False");
            break;
        }

    }

    public static void main(String[] args) {
        Method16 obj = new Method16();
        obj.vowel();
    }
}
