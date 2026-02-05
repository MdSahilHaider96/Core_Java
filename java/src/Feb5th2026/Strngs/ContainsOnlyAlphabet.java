package Feb5th2026.Strngs;

public class ContainsOnlyAlphabet {
    public static void main(String[] args) {
        //Check if Strings contains only alphabet or not
        String str = "HelloWorld";
        String str2= "HELO12O";
        boolean onlyLetters = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                onlyLetters = false;
                break;
            }
        }
        if (onlyLetters) {
            System.out.println(str + " Contains only alphabetic");
        } else {
            System.out.println(str + " does NOT contain only alphabets");
        }
        if (str2.matches("[a-zA-Z]+")) {
            System.out.println(str2 + " contains only alphabets");
        } else {
            System.out.println(str2 + " does NOT contain only alphabets");
        }

    }
}
