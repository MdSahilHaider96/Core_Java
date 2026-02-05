package Feb5th2026.Strngs;

public class differByChar {
    public static void main(String[] args) {
        // Check Two Strings differ by only one character
        String str1 = "hello";
        String str2 = "hello";
        if (differsByOneChar(str1,str2)){
            System.out.println("Strings differ by exactly one character");
        } else {
            System.out.println("Strings do not differ by exactly one character");
        }
    }
    public static boolean differsByOneChar(String str, String str2){
        // Check String size first
        if (str.length() != str2.length()){
            return false;
        }
        int countDiff = 0;

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != str2.charAt(i)){
                countDiff++;
            }
            if (countDiff > 1){
                return false;
            }
        }
        return countDiff == 1;// true if exatly 1 difference
    }
}
