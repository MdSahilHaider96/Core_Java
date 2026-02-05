package Feb5th2026.Strngs;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        //Remove all Special characters from the String
        String str = "Hello@World! Welcome#to Java123.";
        // Remove all
        String cleaned = str.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(cleaned);
    }
}