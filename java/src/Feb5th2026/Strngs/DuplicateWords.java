package Feb5th2026.Strngs;


import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        // Check Duplicates in the Senetence
        String sentence = "This is a test test sentence with with duplicate words";
        // converts words to lower and split into words
        String[] words = sentence.toLowerCase().split("\\s+");
        Set<String> wordset = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words){
            if (!wordset.add(word)){
                duplicates.add(word);
            }
        }
        System.out.println("Duplciates Words : ");
        for (String word : duplicates){
            System.out.println(word);
        }
    }
}
