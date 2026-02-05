package Feb5th2026.Strngs;

public class FindSubstring {
    public static void main(String[] args) {
        // Find all substrings of a string
        String str = "abc";
        System.out.println("All substrings of \"" + str + "\":");

        for (int i = 0; i< str.length();i++){
            for (int j= i+1; j <= str.length() ; j++){
                System.out.println(str.substring(i,j));
            }
        }

    }
}
