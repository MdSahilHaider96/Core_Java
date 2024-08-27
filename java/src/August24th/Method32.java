package August24th;

public class Method32 {
    //34.	Write a value-returning method, isVowel that returns the value true if a given character is a, vowel, and otherwise returns false.
    static void returnVowel(char ch) {
        //TODO First check is it upper case ,if upper case then convert to lower case
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is vowel");
        else
            System.out.println("Not Vowel");

    }

    public static void main(String[] args) {
        returnVowel('i');
    }
}
