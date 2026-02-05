package Feb5th2026.Strngs;

import java.util.Arrays;

public class StringCount {
    // Count words in a sentence
    public static void main(String[] args) {
        String sentence = "Hello World! Welcome to Java programming.";
        long count = Arrays.stream(sentence.trim().split("\\s+"))
                .count();
        System.out.println("Number of words : " + count);
    }
}