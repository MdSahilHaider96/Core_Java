package Feb5th2026.Strngs;



public class ReverseStrings {
    public static String reversed(String str){
        if (str.isEmpty() || str.length() == 1){
            return str;
        }
        return reversed(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        // Reverse  a String using Recursion
        String reversed = reversed("SAHIL");
        System.out.println(reversed);
        // usijng String builder
        String str = "hello";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}
