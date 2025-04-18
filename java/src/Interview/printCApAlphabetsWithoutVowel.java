package Interview;

public class printCApAlphabetsWithoutVowel {
    //	34.	wap to print all upper case alphabets except vowels.
    public static void main(String[] args) {
        for (char ch = 'A'; ch<='Z'; ch++){
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
            System.out.println(ch);
            }
        }
    }
}
