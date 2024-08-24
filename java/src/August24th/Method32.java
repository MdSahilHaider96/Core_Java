package August24th;

public class Method32 {
    //34.	Write a value-returning method, isVowel that returns the value true if a given character is a, vowel, and otherwise returns false.
    static void returnVowel(char c){
        char[]  vowel ={'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'} ;
        for (int i=0,k=0;i< vowel.length;i++,k++){
            if (c==vowel[k]){
                System.out.println("True");
            }
            else System.out.println("False");
            break;
        }
    }

    public static void main(String[] args) {
       returnVowel('l');
    }
}
