package Interview;

public class printLowerCaseVowels {
    public static void main(String[] args) {
        //	35.	wap to print all lower case vowels.
        for(char ch = 'a' ; ch <= 'z'; ch++){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.println(ch);
            }
        }
    }
}
