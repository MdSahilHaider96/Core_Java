package Feb5th2026.Strngs;

import java.util.stream.IntStream;

public class StringPangram {
    public static void main(String[] args) {
        // Strig is a pangram or not
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = IntStream.rangeClosed('a','z')
                .allMatch(c -> str.toLowerCase().indexOf(c) >= 0);
        System.out.println(isPangram ? "The string is a pangram." : "The string is NOT a pangram.");
    }
}
