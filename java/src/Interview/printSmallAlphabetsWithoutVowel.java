package Interview;

public class printSmallAlphabetsWithoutVowel {
    //	34.	wap to print all lower case alphabets except vowels.
    public static void main(String[] args) {
        for (char ch = 'a'; ch<='z'; ch++){
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                System.out.println(ch);
            }
        }
    }
}
